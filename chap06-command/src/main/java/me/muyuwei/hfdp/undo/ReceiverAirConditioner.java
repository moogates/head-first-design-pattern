package me.muyuwei.hfdp.undo;

public class ReceiverAirConditioner {
    private boolean running = false;

    void run() {
        if (!running) {
            System.out.println("run the air-conditioner");
            running = true;
        } else {
            System.out.println("air-conditioner is already running");
        }
    }
    void stop() {
        if (running) {
            running = false;
            System.out.println("stop the air-conditioner");
        } else {
            System.out.println("air-conditioner is already stopped");
        }
    }

    public boolean isRunning() {
        return running;
    }
}
