package me.muyuwei.hfdp.simple;

public class AirConditionerRunCommand implements Command {
    ReceiverAirConditioner airConditioner;

    AirConditionerRunCommand(ReceiverAirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.run();
    }
}
