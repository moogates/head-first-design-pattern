package me.muyuwei.designpattern;

public class SquirrelHandler extends AbstractHandler {

    @Override
    public String handle(String request) {
        if (request.equals("nut")) {
            return "Squirrel eats nut.";
        }
        return super.handle(request);
    }
}
