package me.muyuwei.hfdp.coffee;

public class CondimentMilk extends Condiment {
    public CondimentMilk(Beverage beverage) {
        super(beverage); // 学习语法
    }
    @Override
    public String description() {
        return beverage.description() + ", milk";
    }

    public double cost() {
        return beverage.cost() + 0.75;
    }
}
