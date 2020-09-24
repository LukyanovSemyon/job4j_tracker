package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int num);

    int toFuel(int volFuel);
}
