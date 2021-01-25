package ru.job4j.tracker;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SqlTrackerTest {

    public Connection init() {
        try (InputStream in = SqlTracker.class.getClassLoader()
                .getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            return DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Test
    public void createItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("desc"));
            assertThat(tracker.findByName("desc").size(), is(1));
        }
    }

    @Test
    public void replaceItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("desc");
            tracker.add(item);
            int i = item.getId();
            tracker.replace(i, new Item("hhh"));
            assertThat(tracker.findById(i).getName(), is("hhh"));
        }
    }

    @Test
    public void delete() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("desc");
            tracker.add(item);
            int i = item.getId();
            tracker.delete(i);
            assertThat(tracker.findById(i), is(nullValue()));
        }
    }

    @Test
    public void findAll() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("desc"));
            tracker.add(new Item("sdf"));
            assertThat(tracker.findAll().size(), is(2));
        }
    }

    @Test
    public void findByName() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("desc"));
            tracker.add(new Item("ff"));
            tracker.add(new Item("desc"));
            assertThat(tracker.findByName("desc").size(), is(2));
        }
    }

    @Test
    public void findById() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("desc");
            tracker.add(item);
            assertThat(tracker.findById(item.getId()), is(item));
        }
    }
}