package me.muyuwei.hfdp.duckadaptclass;

public class TestDrive {
    // 对象适配
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter();
        duck.quack();
        duck.fly();
    }
}
