package me.muyuwei.designpattern;

public interface Handler {
    Handler setNext(Handler handler);
    String handle(String request);
}
