package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int vol){
        this.load = vol;
    }
    public void exchange(Battery another) {
        int charge = 5;
        this.load = this.load - charge;
        another.load = another.load + charge;
    }
    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(0);
        System.out.println("Заряд : " + first.load + ". Разряжен на : " + second.load);
        first.exchange(second);
        System.out.println("Заряд : " + first.load + ". Разряжен на : " + second.load);
        first.exchange(second);
        System.out.println("Заряд : " + first.load + ". Разряжен на : " + second.load);
    }
}
