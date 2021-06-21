package me.muyuwei.hfdp;

import me.muyuwei.hfdp.duck.Duck;
import me.muyuwei.hfdp.duck.FlyByRocket;
import me.muyuwei.hfdp.duck.LittleYellowDuck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Duck duck = new LittleYellowDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();

        duck.setFlyBehavior(new FlyByRocket());
        duck.performFly();
    }
}
