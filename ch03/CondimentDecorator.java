package ch03;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    @Override
    public abstract String getDescription();
    public Size getSize() {
        return this.beverage.getSize();
    }
}
