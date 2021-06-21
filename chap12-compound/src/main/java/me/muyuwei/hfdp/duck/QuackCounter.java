package me.muyuwei.hfdp.duck;

public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int counter;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        ++counter;
        quackable.quack();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }

    public static int getCounter() {
        return counter;
    }
}
