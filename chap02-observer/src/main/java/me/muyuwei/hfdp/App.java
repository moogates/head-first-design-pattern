package me.muyuwei.hfdp;

import me.muyuwei.hfdp.weather.AverageObserver;
import me.muyuwei.hfdp.weather.MaxObserver;
import me.muyuwei.hfdp.weather.WeatherStation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WeatherStation station = new WeatherStation();
        station.register(new MaxObserver());
        station.register(new AverageObserver());

        station.notifyChange(17, 0);
        station.notifyChange(23, 0);
        station.notifyChange(13, 0);
        station.notifyChange(27, 0);
        station.notifyChange(0, 0);
        station.notifyChange(40, 0);
    }
}
