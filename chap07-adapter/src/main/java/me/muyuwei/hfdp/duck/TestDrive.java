package me.muyuwei.hfdp.duck;

public class TestDrive {
    // 对象适配
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new WildTurkey());
        duck.quack();
        duck.fly();
    }
}
