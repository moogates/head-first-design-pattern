package me.muyuwei.hfdp.coffee;

public class CondimentMocha extends Condiment {
    public CondimentMocha(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String description() {
        return beverage.description() + ", mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }
}
