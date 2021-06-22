package me.muyuwei.hfdp.menu;

public class DinerMenuIterator implements MenuIterator {
    MenuItem[] menuItems;

    int index;
    DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        index = 0;
    }

    @Override
    public MenuIterator next() {
        index++;
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.length - 1;
    }

    @Override
    public MenuItem value() {
        if (index >= 0 && index < menuItems.length) {
            return menuItems[index];
        } else {
            return null;
        }
    }
}
