package me.muyuwei.hfdp.undo;

public interface Command {
    void execute();
    void undo();
}
