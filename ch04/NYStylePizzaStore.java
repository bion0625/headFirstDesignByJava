package ch04;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        }
        else if ("veggie".equals(type)) {
            pizza =  new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        }
        else if ("clam".equals(type)) {
            pizza =  new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        }
        else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }


        return pizza;
    }
}
