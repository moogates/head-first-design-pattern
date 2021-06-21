package me.muyuwei.hfdp.undo;

import java.util.ArrayList;
import java.util.List;
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
        ReceiverAirConditioner ac = new ReceiverAirConditioner();

        // 2. 将command装配到invoker(即SimpleRemoteControl)中
        SimpleRemoteControl rc = new SimpleRemoteControl();

        Stack<Command> commandHistory = new Stack<>();

        Command command = new AirConditionerRunCommand(ac);
        rc.setCommand(command);
        rc.onPressed();
        commandHistory.push(command);

        command = new AirConditionerRunCommand(ac);
        rc.setCommand(command);
        rc.onPressed();
        commandHistory.push(command);

        command = new AirConditionerRunCommand(ac);
        rc.setCommand(command);
        rc.onPressed();
        commandHistory.push(command);

        while(!commandHistory.empty()) {
            Command cmd = commandHistory.pop();
            cmd.undo();
        }
    }
}
