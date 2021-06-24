package me.muyuwei.hfdp.menu2;

import java.util.ArrayList;
import java.util.Iterator;

// 这个类其实已经没有存在价值了
public class PancakeHouseMenuIterator implements Iterator {
    Iterator<MenuItem> realIterator;

    PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.realIterator = menuItems.iterator();
    }

    @Override
    public MenuItem next() {
        return realIterator.next();
    }

    @Override
    public boolean hasNext() {
        return realIterator.hasNext();
    }
}
