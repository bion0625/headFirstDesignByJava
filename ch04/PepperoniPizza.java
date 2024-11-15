package ch04;

public class PepperoniPizza extends Pizza{

    private PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비 중: " + name);
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.pepperoni = pizzaIngredientFactory.createPepperoni();
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
}
