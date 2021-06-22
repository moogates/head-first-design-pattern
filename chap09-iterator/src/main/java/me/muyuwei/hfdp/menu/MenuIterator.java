package me.muyuwei.hfdp.menu;

public interface MenuIterator {
    MenuIterator next();
    boolean hasNext();

    MenuItem value();
}
