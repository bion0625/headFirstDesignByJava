package ch12.ducks.factory;

import ch12.ducks.observer.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuckDuck();
    public abstract Quackable createDuckCallDuck();
    public abstract Quackable createRubberDuckDuck();
}
