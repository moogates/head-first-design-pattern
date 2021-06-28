package me.muyuwei.hfdp.gumballmachine;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void onRefill(int count) {
        System.out.println("onrefill, count=" + count);
        gumballMachine.addGumballCount(count);
    }

    @Override
    public void onInsertQuarter() {
        System.out.println("onInsertQuarter, new state HasQuarterState");
        gumballMachine.setState(new HasQuarterState(gumballMachine));
    }

    @Override
    public void onEjectQuarter() {
        System.out.println("onEjectQuarter do nothing");
    }

    @Override
    public void onTurnCrank() {
        System.out.println("onTurnCrank do nothing");
    }
}
