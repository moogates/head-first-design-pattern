package me.muyuwei.hfdp.gumballmachine;

public class GumballMachine {
    private int gumballCount = 0;
    private State state;

    GumballMachine(int gumballCount) {
        this.gumballCount = gumballCount;
        state = new NoQuarterState(this);
    }

    public void addGumballCount(int count) {
        gumballCount += count;
    }
    public int getGumballCount() {
        return gumballCount;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void refill(int count) {
        state.onRefill(count);
    }
    public void insertQuarter() {
        state.onInsertQuarter();
    }

    public void ejectQuarter() {
        state.onEjectQuarter();
    }

    public void turnCrank() {
        state.onTurnCrank();
    }

}
