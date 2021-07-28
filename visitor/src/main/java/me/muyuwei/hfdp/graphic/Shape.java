package me.muyuwei.hfdp.graphic;

public interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Exporter exporter);
}
