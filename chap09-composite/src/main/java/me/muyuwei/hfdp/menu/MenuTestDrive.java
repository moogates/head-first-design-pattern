package me.muyuwei.hfdp.menu;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent menuRoot = new Menu("All Menus");

        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu");
        MenuComponent dinerMenu = new Menu("Diner Menu");

        MenuComponent cafeMenu = new Menu("Cafe Menu");
        cafeMenu.add(new MenuItem("Cappuccino", 4));
        cafeMenu.add(new MenuItem("Espresso", 7));
        cafeMenu.add(new MenuItem("DarkRoast", 6));

        menuRoot.add(pancakeHouseMenu);
        menuRoot.add(dinerMenu);
        menuRoot.add(cafeMenu);

        MenuComponent dessertMenu = new Menu("Dessert Menu");
        dessertMenu.add(new MenuItem("Apple Pie", 5));
        dessertMenu.add(new MenuItem("Ice Cream", 2));

        dinerMenu.add(new MenuItem("Pasta", 4));
        dinerMenu.add(dessertMenu);

        menuRoot.print(0);
    }
}
