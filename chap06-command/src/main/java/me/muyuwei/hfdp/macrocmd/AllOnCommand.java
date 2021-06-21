package me.muyuwei.hfdp.macrocmd;

public class AllOnCommand implements Command {
    private Command[] commands;
    AllOnCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        for (Command cmd : commands) {
            cmd.undo();
        }
    }
}
