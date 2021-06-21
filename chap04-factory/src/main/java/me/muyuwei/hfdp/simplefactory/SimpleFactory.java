package me.muyuwei.hfdp.simplefactory;

public class SimpleFactory {
    public Pizza createPizza(String name) {
        if (name.equals("clam")) {
            return new ClamPizza();
        } else if (name.equals("cheese")) {
            return new CheesePizza();
        }
        return null;
    }
}
