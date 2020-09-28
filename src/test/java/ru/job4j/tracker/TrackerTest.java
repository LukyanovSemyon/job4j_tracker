package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void s1() {
        TrackerSingle1 t = TrackerSingle1.INSTANCE;
        TrackerSingle1 t2 = TrackerSingle1.INSTANCE;
        assertEquals(t, t2);
    }

    @Test
    public void s2() {
        TrackerSingle2 t = TrackerSingle2.getInstance();
        TrackerSingle2 t2 = TrackerSingle2.getInstance();
        assertEquals(t, t2);
    }

    @Test
    public void s3() {
        TrackerSingle3 t = TrackerSingle3.getInstance();
        TrackerSingle3 t2 = TrackerSingle3.getInstance();
        assertEquals(t, t2);
    }

    @Test
    public void s4() {
        TrackerSingle4 t = TrackerSingle4.getInstance();
        TrackerSingle4 t2 = TrackerSingle4.getInstance();
        assertEquals(t, t2);
    }
}