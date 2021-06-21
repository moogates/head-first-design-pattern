package me.muyuwei.hfdp.coffee;

public class CoffeeDecaf implements Beverage {
    @Override
    public String description() {
        return "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 18.0;
    }
}
