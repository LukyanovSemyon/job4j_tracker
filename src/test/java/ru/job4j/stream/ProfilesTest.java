package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile> profiles = List.of(
                new Profile(new Address("SPb", "Nevskiy", 45, 3), "Ivan"),
                new Profile(new Address("SPb", "Sadovaya", 22, 5), "Petr"),
                new Profile(new Address("SPb", "Sadovaya", 22, 5), "Petr"),
                new Profile(new Address("Moscow", "Neglinnaya", 14, 7), "Petr"),
                new Profile(new Address("SPb", "Lomonosova", 20, 4), "Egor")
        );
        List<Address> location = Profiles.collect(profiles);
        List<Address> expected = List.of(
                new Address("Moscow", "Neglinnaya", 14, 7),
                new Address("SPb", "Nevskiy", 45, 3),
                new Address("SPb", "Sadovaya", 22, 5),
                new Address("SPb", "Lomonosova", 20, 4)
        );
        assertThat(location, is(expected));
    }
}