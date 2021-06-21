package me.muyuwei.hfdp.factorymethod;

public class ClamPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Clam Pizza";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
