package me.muyuwei.hfdp;

import me.muyuwei.hfdp.coffee.Beverage;
import me.muyuwei.hfdp.coffee.CoffeeDarkRoast;
import me.muyuwei.hfdp.coffee.CondimentMilk;
import me.muyuwei.hfdp.coffee.CondimentMocha;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Beverage beverage = new CoffeeDarkRoast();
        beverage = new CondimentMilk(beverage);
        beverage = new CondimentMilk(beverage);
        beverage = new CondimentMocha(beverage);

        System.out.println("description: " + beverage.description());
        System.out.println("cost: " + beverage.cost());
    }
}
