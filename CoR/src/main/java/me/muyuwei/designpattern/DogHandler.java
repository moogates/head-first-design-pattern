package me.muyuwei.designpattern;

public class DogHandler extends AbstractHandler {
    @Override
    public String handle(String request) {
        if (request.equals("meatball")) {
            return "Dog eats meatball.";
        }
        return super.handle(request);
    }
}
