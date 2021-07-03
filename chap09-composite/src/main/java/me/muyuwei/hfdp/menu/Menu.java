package me.muyuwei.hfdp.menu;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuItems;
    private String name;
    public Menu(String name) {
        this.name = name;
        menuItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void print(int level) {
        for(int i = 0; i < level; ++i) {
            System.out.print('\t');
        }
        System.out.println("+" + name);
        for(MenuComponent component : menuItems) {
            component.print(level + 1);
        }
    }

    public void add(MenuComponent component) {
        menuItems.add(component);
    }

    public void remove(MenuComponent component) {
        boolean b = menuItems.remove(component);
        System.out.println("remove " + b);
    }

    public MenuComponent getChild(int index) {
        return menuItems.get(index);
    }
}
