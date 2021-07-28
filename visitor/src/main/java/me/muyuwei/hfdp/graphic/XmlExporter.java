package me.muyuwei.hfdp.graphic;

public class XmlExporter implements Exporter {
    @Override
    public void export(Dot dot) {
        System.out.println("<Dot>" +  dot.getX()
                + "," + dot.getY() + "</Dot>");
        // System.out.println("<Dot>x,y</Dot>");
    }

    @Override
    public void export(Line line) {
        System.out.println("<Line></Line>");
    }
}
