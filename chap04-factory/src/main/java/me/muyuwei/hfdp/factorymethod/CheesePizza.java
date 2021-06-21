package me.muyuwei.hfdp.factorymethod;

public class CheesePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Cheese Pizza";
    }

    @Override
    public double getPrice() {
        return 4.0;
    }
}
