package me.muyuwei.hfdp.simple;

public class SimpleRemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    void onPressed() {
        command.execute();
    }

    public static void main(String[] args) {
        // 1. 将实际操作封装为command
        ReceiverLight light = new ReceiverLight();
        Command command = new LightOnCommand(light);

        // 2. 将command装配到invoker(即SimpleRemoteControl)中
        SimpleRemoteControl rc = new SimpleRemoteControl();
        rc.setCommand(command);

        // 3. 模拟外部动作，触发invoker的对外接口
        rc.onPressed();

        // 装配新的command
        ReceiverAirConditioner ac = new ReceiverAirConditioner();
        command = new AirConditionerRunCommand(ac);
        rc.setCommand(command);
        rc.onPressed();
    }
}
