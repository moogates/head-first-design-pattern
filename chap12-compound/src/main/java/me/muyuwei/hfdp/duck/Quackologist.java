package me.muyuwei.hfdp.duck;

public class Quackologist implements QuackObserver {
    @Override
    public void update(QuackObservable observable) {
        System.out.println("Quackologist : duck " + observable + " just quacked.");
    }
}
