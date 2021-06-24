package me.muyuwei.hfdp.menu2;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("鸡蛋饼", "山地野鸡下蛋", 3));
        menuItems.add(new MenuItem("牛肉饼", "精选张家口牛肉", 5));
        menuItems.add(new MenuItem("猪肉大葱饼", "肉多葱少", 4));
        menuItems.add(new MenuItem("土豆丝饼", "多放葱花不要酱", 3));
    }

    public Iterator createMenuIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
