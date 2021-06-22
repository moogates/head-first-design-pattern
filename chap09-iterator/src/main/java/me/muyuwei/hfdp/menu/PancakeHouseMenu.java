package me.muyuwei.hfdp.menu;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("鸡蛋饼", "山地野鸡下蛋", 3));
        menuItems.add(new MenuItem("牛肉饼", "精选张家口牛肉", 5));
        menuItems.add(new MenuItem("猪肉大葱饼", "肉多葱少", 4));
    }

    public MenuIterator createMenuIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
