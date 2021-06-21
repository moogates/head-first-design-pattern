package me.muyuwei.hfdp.duck;

import java.util.ArrayList;
import java.util.List;

// 鸭群，组合模式
public class Flock implements Quackable {
    List<Quackable> ducks = new ArrayList<>();

    void addDuck(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
            duck.notifyObservers();
        }
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        for (Quackable quackable : ducks) {
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // 通知的行为交给各个鸭子，这里不需要再重复通知了
    }
}
