package ch04;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("예단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");

        PizzaStore californiaStore = new CaliforniaStylePizzaStore();
        pizza = californiaStore.orderPizza("cheese");
        System.out.println("바로 내가 주문한 " + pizza.getName() + "\n");
    }
}
