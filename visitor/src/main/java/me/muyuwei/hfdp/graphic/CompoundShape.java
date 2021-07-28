package me.muyuwei.hfdp.graphic;

import java.util.HashSet;
import java.util.Set;

public class CompoundShape implements Shape {
    Set<Shape> shapes;

    CompoundShape() {
        shapes = new HashSet<>();
    }
    public void add(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public void accept(Exporter exporter) {
        for (Shape shape: shapes) {
            shape.accept(exporter);
        }
    }
}
