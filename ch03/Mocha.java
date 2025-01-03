package ch03;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .20;
    }
}
