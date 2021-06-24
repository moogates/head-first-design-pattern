package me.muyuwei.hfdp.menu2;

import java.util.Iterator;

public class TestDrive {
    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();
        Iterator it = dinerMenu.createMenuIterator();

        while(it.hasNext()) {
            MenuItem item = (MenuItem)it.next();
            System.out.println(item.getName());
        }


        Menu menu = new PancakeHouseMenu();
        it = menu.createMenuIterator();

        while(it.hasNext()) {
            MenuItem item = (MenuItem)it.next();
            System.out.println(item.getName());
            // it.next();
        }
    }
}
