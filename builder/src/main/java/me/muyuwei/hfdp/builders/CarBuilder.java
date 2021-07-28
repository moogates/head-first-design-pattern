package me.muyuwei.hfdp.builders;

import me.muyuwei.hfdp.cars.Car;
import me.muyuwei.hfdp.cars.CarType;
import me.muyuwei.hfdp.components.Engine;
import me.muyuwei.hfdp.components.GPSNavigator;
import me.muyuwei.hfdp.components.Transmission;
import me.muyuwei.hfdp.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    /*
     * 注意该方法并不是定义在Builder接口中
     * Unlike other creational patterns, Builder can construct unrelated products,
     * which don't have the common interface.
     */
    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}