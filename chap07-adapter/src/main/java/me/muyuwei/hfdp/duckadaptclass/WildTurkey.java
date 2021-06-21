package me.muyuwei.hfdp.duckadaptclass;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble, gobble, gobble");
    }

    @Override
    public void awkwardFly() {
        System.out.println("fly awkwardly");
    }
}
