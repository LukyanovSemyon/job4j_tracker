package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Profile> profiles = List.of(
                new Profile(new Address("SPb", "Nevskiy", 45, 3), "Ivan"),
                new Profile(new Address("SPb", "Sadovaya", 22, 5), "Petr"),
                new Profile(new Address("SPb", "Sadovaya", 22, 5), "Petr"),
                new Profile(new Address("Moscow", "Neglinnaya", 14, 7), "Petr"),
                new Profile(new Address("SPb", "Lomonosova", 20, 4), "Egor")
        );
        List<Address> location = collect(profiles);
        location.forEach(System.out::println);
    }
}
