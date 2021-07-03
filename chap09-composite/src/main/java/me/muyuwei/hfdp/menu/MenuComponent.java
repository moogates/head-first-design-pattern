package me.muyuwei.hfdp.menu;

public abstract class MenuComponent {
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public int getPrice() {
        throw new UnsupportedOperationException();
    }

    public abstract void print(int level);

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int pos) {
        throw new UnsupportedOperationException();
    }

}
