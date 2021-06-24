package me.muyuwei.hfdp.menu2;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;

    int index;
    DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        index = 0;
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[index];  // 注意接口的微妙细节，返回当前元素，并移动到下一元素
        index++;
        return item;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.length; // 跟标准容器一样的行为。边界条件可能是反直觉的
    }

}
