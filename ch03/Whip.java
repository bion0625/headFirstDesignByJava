package ch03;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
