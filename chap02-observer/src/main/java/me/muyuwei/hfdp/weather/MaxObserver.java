package me.muyuwei.hfdp.weather;

public class MaxObserver implements Observer {
    Integer max = null;
    @Override
    public void update(int temperature, int humidity) {
        if (max == null) {
            max = temperature;
        } else {
            if (temperature > max) {
                max = temperature;
            }
        }
        System.out.println("max temp " + max);
    }
}
