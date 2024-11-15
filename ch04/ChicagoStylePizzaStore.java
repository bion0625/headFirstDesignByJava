package ch04;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) return new ChicagoStyleCheesePizza();
        else if ("pepperoni".equals(type)) return new ChicagoStylePepperoniPizza();
        else if ("clam".equals(type)) return new ChicagoStyleClamPizza();
        else if ("veggie".equals(type)) return new ChicagoStyleVeggiePizza();
        else return null;
    }
}
