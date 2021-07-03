package me.muyuwei.hfdp.menu;

public class MenuItem extends MenuComponent {
    String name;
    int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public void print(int level) {
        for(int i = 0; i < level; ++i) {
            System.out.print('\t');
        }
        System.out.println(name + " ... " + price);
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
