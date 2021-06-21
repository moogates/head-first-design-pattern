package me.muyuwei.hfdp.factorymethod;

public abstract class AbstractPizzaStore {
    protected abstract Pizza createPizza(String name);

    public void orderPizza(String name) {
        Pizza pizza = createPizza(name);
        System.out.println(pizza.getDescription());
    }
}
