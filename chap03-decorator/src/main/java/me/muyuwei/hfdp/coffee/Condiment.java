package me.muyuwei.hfdp.coffee;

public abstract class Condiment implements Beverage {
    Beverage beverage;
    protected Condiment(Beverage beverage) {
        this.beverage = beverage;
    }
}
