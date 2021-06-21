package me.muyuwei.hfdp.duck;

import java.util.ArrayList;
import java.util.List;

public class QuackObservableImpl implements QuackObservable {
    List<QuackObserver> observers = new ArrayList<>();
    QuackObservable duck;

    QuackObservableImpl(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (QuackObserver o : observers) {
            o.update(duck);
        }
    }
}
