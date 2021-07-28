package me.muyuwei.hfdp.graphic;

public class Dot implements Shape {
    private int x, y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {
    }

    @Override
    public void accept(Exporter exporter) {
        exporter.export(this);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
