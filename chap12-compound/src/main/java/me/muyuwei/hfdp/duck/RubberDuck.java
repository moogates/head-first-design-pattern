package me.muyuwei.hfdp.duck;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    public RubberDuck() {
        observable = new QuackObservableImpl(this);
    }


    private QuackObservable observable;

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
