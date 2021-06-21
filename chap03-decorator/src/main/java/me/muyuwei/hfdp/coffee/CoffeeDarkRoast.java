package me.muyuwei.hfdp.coffee;

public class CoffeeDarkRoast implements Beverage {
    @Override
    public String description() {
        return "DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
