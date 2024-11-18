package ch09;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String descriptions;

    public Menu(String name, String descriptions) {
        this.name = name;
        this.descriptions = descriptions;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return descriptions;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
