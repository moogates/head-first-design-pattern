package me.muyuwei.hfdp.coffee;

public class CoffeeEspresso implements Beverage {
    @Override
    public String description() {
        return "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
