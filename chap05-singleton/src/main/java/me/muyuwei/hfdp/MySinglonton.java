package me.muyuwei.hfdp;

public class MySinglonton {
    private MySinglonton(){}

    private static MySinglonton instance;

    public static MySinglonton getInstance() {
        if (instance == null) {
            synchronized(MySinglonton.class) {
                if (instance == null) {
                    instance = new MySinglonton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("do something");
    }
}
