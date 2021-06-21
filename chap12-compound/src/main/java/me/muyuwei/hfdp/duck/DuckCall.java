package me.muyuwei.hfdp.duck;


public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak"); // 鸭鸣器(DuckCall)会叫，但是叫声跟真鸭子不一样
        notifyObservers();
    }

    private QuackObservable observable;

    public DuckCall() {
        observable = new QuackObservableImpl(this);
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
