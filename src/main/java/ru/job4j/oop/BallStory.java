package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Bear bear = new Bear();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.runAway(hare);
        bear.tryEat(ball);
        ball.runAway(bear);
        fox.eat(ball);
    }
}
