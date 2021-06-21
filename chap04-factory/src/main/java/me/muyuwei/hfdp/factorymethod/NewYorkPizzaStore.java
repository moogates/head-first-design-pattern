package me.muyuwei.hfdp.factorymethod;

// import me.muyuwei.hfdp.factorymethod.CheesePizza;
// import me.muyuwei.hfdp.factorymethod.ClamPizza;

public class NewYorkPizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza createPizza(String name) {
        if (name.equals("clam")) {
            return new ClamPizza();
        } else if (name.equals("cheese")) {
            return new CheesePizza();
        }
        return null;
    }
}
