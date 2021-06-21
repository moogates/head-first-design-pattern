package me.muyuwei.hfdp.simplefactory;

public class PizzaStore {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Pizza pizza = factory.createPizza("cheese");

        System.out.println(pizza.getDescription());
    }
}
