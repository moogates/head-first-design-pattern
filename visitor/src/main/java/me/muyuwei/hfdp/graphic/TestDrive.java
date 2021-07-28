package me.muyuwei.hfdp.graphic;

public class TestDrive {
    public static void main(String args[]) {
        CompoundShape graphics = new CompoundShape();
        graphics.add(new Dot(10, 10));
        graphics.add(new Dot(20, 10));
        graphics.add(new Line());

        Exporter exporter = new XmlExporter();
        graphics.accept(exporter);

        graphics.accept(new JsonExporter());
    }
}
