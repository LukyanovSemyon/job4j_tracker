package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void go() {

    }

    @Override
    public void passengers(int num) {

    }

    @Override
    public int toFuel(int volFuel) {
        int price = 5;
        return volFuel*price;
    }
}
