package me.muyuwei.hfdp.menu;

public class DinerMenu {
    private MenuItem[] menuItems;
    private static int MAX_ITEMS = 4;
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        menuItems[0] = new MenuItem("西红柿鸡蛋", "山地野鸡下蛋", 3);
        menuItems[1] = new MenuItem("排黄瓜", "屠龙宝刀排黄瓜", 5);
        menuItems[2] = new MenuItem("永顺炸鸡", "山地野鸡", 8);
        menuItems[3] = new MenuItem("竹笋炒肉", "新鲜四川卧龙竹笋", 15);
    }

    public MenuIterator createMenuIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
