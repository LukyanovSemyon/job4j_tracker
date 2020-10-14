package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Profile {
    private Address address;
    private String name;

    public Profile(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return Objects.equals(address, profile.address)
                && Objects.equals(name, profile.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name);
    }

    @Override
    public String toString() {
        return "Profile{" + "address="
                + address + ", name='"
                + name + '\'' + '}';
    }

    public static List<Address> collect(List<Profile> profiles) {
        List<Address> rsl = profiles.stream()
                .map(location -> location.address)
                .collect(Collectors.toList());
        return rsl;
    }

    public static void main(String[] args) {
        List<Profile> profiles = List.of(
                new Profile(new Address("SPb", "Nevskiy", 45, 3), "Ivan"),
                new Profile(new Address("SPb", "Sadovaya", 22, 5), "Petr"),
                new Profile(new Address("SPb", "Lomonosova", 20, 4), "Egor")
        );
        List<Address> location = collect(profiles);
        location.forEach(System.out::println);
    }
}

