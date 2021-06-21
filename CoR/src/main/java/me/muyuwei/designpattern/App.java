package me.muyuwei.designpattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Handler monkey = new MonkeyHandler();
        Handler dog = new DogHandler();
        Handler squirrel = new SquirrelHandler();
        monkey.setNext(dog).setNext(squirrel);

        System.out.println(monkey.handle("banana"));
        System.out.println(monkey.handle("meatball"));
        System.out.println(monkey.handle("nut"));
        System.out.println();
        // 职责链不一定非要从头开始执行，可以从任意位置开始执行
        System.out.println(dog.handle("banana"));
        System.out.println(dog.handle("meatball"));
        System.out.println(dog.handle("nut"));
    }
}
