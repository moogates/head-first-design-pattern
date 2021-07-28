package me.muyuwei.hfdp.graphic;

public class Line implements Shape {
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public void accept(Exporter exporter) {
        // visitor double dispatch 技巧
        exporter.export(this);
    }
}
