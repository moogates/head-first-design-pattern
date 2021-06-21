package me.muyuwei.hfdp.weather;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation {
    List<Observer> observers = new LinkedList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange(int temperature, int humidity) {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
