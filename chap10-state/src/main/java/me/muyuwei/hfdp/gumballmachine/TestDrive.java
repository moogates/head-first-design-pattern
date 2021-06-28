package me.muyuwei.hfdp.gumballmachine;

public class TestDrive {
    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine(4);
        gm.refill(1);
        gm.insertQuarter();
        gm.turnCrank();
        gm.ejectQuarter();
    }
}
