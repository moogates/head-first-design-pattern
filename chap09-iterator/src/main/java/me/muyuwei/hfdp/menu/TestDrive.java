package me.muyuwei.hfdp.menu;

public class TestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        MenuIterator it = dinerMenu.createMenuIterator();


        while(it.value() != null) {
            System.out.println(it.value().getName());
            System.out.println(it.hasNext());

            it.next();
        }


        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        it = pancakeHouseMenu.createMenuIterator();
        while(it.value() != null) {
            System.out.println(it.value().getName());
            System.out.println(it.hasNext());

            it.next();
        }

    }
}
