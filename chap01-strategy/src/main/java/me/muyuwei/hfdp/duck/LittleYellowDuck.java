package me.muyuwei.hfdp.duck;

public class LittleYellowDuck extends Duck {
    public LittleYellowDuck() {
        flyBehavior = new FlyWithSwing();
        quackBehavior = new QuackQuack();
    }
    public void display() {
        System.out.println("I'm a LittleYellowDuck!");
    }
}
