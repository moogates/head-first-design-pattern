package me.muyuwei.designpattern;

public class MonkeyHandler extends AbstractHandler {
    @Override
    public String handle(String request) {
        if (request.equals("banana")) {
            return "Monkey eats banana.";
        }
        return super.handle(request);
    }
}
