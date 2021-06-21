package me.muyuwei.hfdp.duck;

public interface QuackObservable {
    void registerObserver(QuackObserver observer);
    void notifyObservers();
}
