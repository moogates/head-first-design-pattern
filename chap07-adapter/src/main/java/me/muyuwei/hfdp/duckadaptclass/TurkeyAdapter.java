package me.muyuwei.hfdp.duckadaptclass;

public class TurkeyAdapter extends WildTurkey implements Duck {
    @Override
    public void quack() {
        gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; ++i) {
            awkwardFly(); // 两个基类的方法名，都叫fly会有冲突
        }
    }
}
