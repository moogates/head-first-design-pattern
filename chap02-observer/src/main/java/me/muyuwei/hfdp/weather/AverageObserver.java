package me.muyuwei.hfdp.weather;

public class AverageObserver implements Observer {
    private long total = 0;
    private long count = 0;
    @Override
    public void update(int temperature, int humidity) {
        ++count;
        total += temperature;
        System.out.println("avg temp " + total * 1.0 / count);
    }
}
