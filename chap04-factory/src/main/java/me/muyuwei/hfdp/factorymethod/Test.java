package me.muyuwei.hfdp.factorymethod;

public class Test {
    public static void main(String[] args) {
        AbstractPizzaStore pizzaStore = new NewYorkPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
