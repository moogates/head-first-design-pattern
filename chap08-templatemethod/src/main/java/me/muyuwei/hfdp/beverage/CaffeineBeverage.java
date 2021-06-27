package me.muyuwei.hfdp.beverage;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water... OK");

    }
    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup... OK");
    }
    protected abstract void addCondiments();
}
