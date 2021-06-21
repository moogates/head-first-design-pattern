package me.muyuwei.designpattern;

public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;
    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public String handle(String request) {
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return null;
    }
}
