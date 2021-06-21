package me.muyuwei.hfdp.duck;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }


    private QuackObservable observable;

    public MallardDuck() {
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
