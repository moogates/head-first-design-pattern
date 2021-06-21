package me.muyuwei.hfdp.macrocmd;

public class LightOnCommand implements Command {
    ReceiverLight light;
    public LightOnCommand(ReceiverLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
