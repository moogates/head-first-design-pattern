package me.muyuwei.hfdp.duck;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble, gobble, gobble");
    }

    @Override
    public void fly() {
        System.out.println("fly awkwardly");
    }
}
