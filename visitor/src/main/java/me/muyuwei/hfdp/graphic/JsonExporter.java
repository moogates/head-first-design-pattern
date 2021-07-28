package me.muyuwei.hfdp.graphic;

public class JsonExporter implements Exporter {
    @Override
    public void export(Dot dot) {
        System.out.println("{ x : " + dot.getX()
                + ", y : " + dot.getY() + "}");
    }

    @Override
    public void export(Line line) {
        System.out.println("{ left : , top : , right: , bottom : }");
    }
}
