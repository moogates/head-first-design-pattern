package me.muyuwei.hfdp.macrocmd;

public class AirConditionerRunCommand implements Command {
    ReceiverAirConditioner airConditioner;
    boolean prevRunning = false;

    AirConditionerRunCommand(ReceiverAirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        prevRunning = airConditioner.isRunning();
        airConditioner.run();
    }

    @Override
    public void undo() {
        if (!prevRunning) {
            airConditioner.stop();
        } else {
            System.out.println("undo do nothing");
        }
    }
}
