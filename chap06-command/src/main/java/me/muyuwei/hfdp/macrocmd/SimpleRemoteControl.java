package me.muyuwei.hfdp.macrocmd;

import java.util.Stack;

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
        ReceiverAirConditioner ac = new ReceiverAirConditioner();


        SimpleRemoteControl rc = new SimpleRemoteControl();

        Stack<Command> commandHistory = new Stack<>();

        Command subcommands[] = {new LightOnCommand(light),
                new AirConditionerRunCommand(ac)};
        Command command = new AllOnCommand(subcommands);
        rc.setCommand(command);
        rc.onPressed();
        commandHistory.push(command);

        while(!commandHistory.empty()) {
            Command cmd = commandHistory.pop();
            cmd.undo();
        }
    }
}
