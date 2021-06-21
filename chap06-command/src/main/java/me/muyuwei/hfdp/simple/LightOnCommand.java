package me.muyuwei.hfdp.simple;

public class LightOnCommand implements Command {
    ReceiverLight light;
    public LightOnCommand(ReceiverLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
