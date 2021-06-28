package me.muyuwei.hfdp.gumballmachine;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void onRefill(int count) {
        gumballMachine.addGumballCount(count);
        System.out.println("refill count=" + count
                + " total=" + gumballMachine.getGumballCount());
    }

    @Override
    public void onInsertQuarter() {
        System.out.println("Auto eject after insert quarter.");
    }

    @Override
    public void onEjectQuarter() {
        System.out.println("Eject quarter.");
    }

    @Override
    public void onTurnCrank() {
        System.out.println("Do nothing.");
    }
}
