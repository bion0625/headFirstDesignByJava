package ch04;

public class ClamPizza extends Pizza{

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비 중: " + name);
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.cheese = pizzaIngredientFactory.createCheese();
        this.clams = pizzaIngredientFactory.createClams();
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
}
