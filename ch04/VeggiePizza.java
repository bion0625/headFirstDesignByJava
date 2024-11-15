package ch04;

public class VeggiePizza extends Pizza{
    private PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비 중: " + name);
        this.dough = pizzaIngredientFactory.createDough();
        this.clams = pizzaIngredientFactory.createClams();
        this.sauce = pizzaIngredientFactory.createSauce();
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
}
