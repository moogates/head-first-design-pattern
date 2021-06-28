package me.muyuwei.hfdp.gumballmachine;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void onRefill(int count) {
        System.out.println("do nothing");
    }

    @Override
    public void onInsertQuarter() {
        System.out.println("do NOT insert now.");
    }

    @Override
    public void onEjectQuarter() {
        gumballMachine.setState(new NoQuarterState(gumballMachine));
    }

    @Override
    public void onTurnCrank() {
        System.out.println("onTurnCrank dispense gumball");
        gumballMachine.addGumballCount(-1);

        if (gumballMachine.getGumballCount() == 0) {
            gumballMachine.setState(new SoldOutState(gumballMachine));
        } else {
            gumballMachine.setState(new NoQuarterState(gumballMachine));
        }
    }
}
