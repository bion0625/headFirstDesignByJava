package ch12.ducks.factory;

import ch12.ducks.DuckCall;
import ch12.ducks.observer.Quackable;
import ch12.ducks.duck.MallardDuck;
import ch12.ducks.duck.RedHeadDuck;
import ch12.ducks.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuckDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCallDuck() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuckDuck() {
        return new RubberDuck();
    }
}
