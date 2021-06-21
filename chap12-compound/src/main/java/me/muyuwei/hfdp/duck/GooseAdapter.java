package me.muyuwei.hfdp.duck;

public class GooseAdapter implements Quackable {
    private Goose goose;
    private QuackObservable observable;

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }


    public GooseAdapter(Goose goose) {
        this.goose = goose;
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
