package me.muyuwei.hfdp.menu;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements MenuIterator {
    ArrayList<MenuItem> menuItems;
    int index;
    PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        index = 0;
    }

    @Override
    public MenuIterator next() {
        ++index;
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.size() - 1;
    }

    @Override
    public MenuItem value() {
        if (index >= 0 && index < menuItems.size()) {
            return menuItems.get(index);
        } else {
            return null;
        }
    }
}
