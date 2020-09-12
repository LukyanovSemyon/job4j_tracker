package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int vol){
        this.load = vol;
    }
    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(0);
        System.out.println("Заряд : " + first.load + ". Разряжен на : " + second.load);
        first.exchange(second);
        System.out.println("Заряд : " + first.load + ". Разряжен на : " + second.load);
    }
}
