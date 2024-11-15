package ch04;

public class CaliforniaStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) return new CaliforniaStyleCheesePizza();
        else if ("pepperoni".equals(type)) return new CaliforniaStylePepperoniPizza();
        else if ("clam".equals(type)) return new CaliforniaStyleClamPizza();
        else if ("veggie".equals(type)) return new CaliforniaStyleVeggiePizza();
        else return null;
    }
}
