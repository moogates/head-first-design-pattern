package me.muyuwei.hfdp.duck;

public class TestDrive {
    public static void main(String[] args) {
        TestDrive test = new TestDrive();
        // test.drive();
        // test.driveAbstractFactory();
        // test.driveComposite();
        test.driveObserver();
    }

    void drive() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable googseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(googseDuck);

        System.out.println("quack counter = " + QuackCounter.getCounter());
    }

    void driveComposite() {
        Quackable mallardDuck = new MallardDuck();
        Quackable mallardDuck2= new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flock = new Flock();
        flock.addDuck(mallardDuck);
        flock.addDuck(mallardDuck2);
        flock.addDuck(redheadDuck);
        flock.addDuck(rubberDuck);
        flock.addDuck(duckCall);
        flock.addDuck(gooseDuck);

        AbstractDuckFactory factory = new DuckFactory();

        flock.addDuck(factory.createMallardDuck());

        flock.quack();
    }

    void driveAbstractFactory() {
        AbstractDuckFactory factory = new CountingDuckFactory();

        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable googseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(googseDuck);

        System.out.println("quack counter = " + QuackCounter.getCounter());

    }

    void driveObserver() {
        QuackObserver quackologist = new Quackologist();
        Quackable googseDuck = new GooseAdapter(new Goose());
        Quackable rubberDuck = new RubberDuck();

        googseDuck.registerObserver(quackologist);
        rubberDuck.registerObserver(quackologist);

        simulate(googseDuck);
        simulate(rubberDuck);

        Flock flock = new Flock();
        flock.addDuck(googseDuck);
        flock.addDuck(rubberDuck);
        simulate(flock);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
