//package ch09;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class PancakeHouseMenu extends Menu {
//    List<MenuItem> menuItems;
//
//    public PancakeHouseMenu(String name) {
//        menuItems = new ArrayList<>();
//
//        addItem("K&B 팬케이크 세트", "스크럼블 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
//
//        addItem("레귤러 팬케이크 세트", "달걀 프라이와 소시지가 곁들여진 팬케이크", false, 2.99);
//
//        addItem("블루베리 팬케이크", "신선한 블루베피와 블루베리 시럽으로 만든 팬케이크", true, 3.49);
//
//        addItem("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플", true, 3.59);
//
//        this.name = name;
//    }
//
//    public void addItem(String name, String description, boolean vegetarian, double price) {
//        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
//        menuItems.add(menuItem);
//    }
//
////    public List<MenuItem> getMenuItems() {
////        return menuItems;
////    }
//
//    @Override
//    public Iterator<MenuItem> createIterator() {
////        return new PancakeHouseIterator(this.menuItems);
//        return this.menuItems.iterator();
//    }
//}
