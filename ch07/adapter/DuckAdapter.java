package ch07.adapter;

import ch01.Duck;

public class DuckAdapter implements Turkey{

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.performQuack();
    }

    @Override
    public void fly() {
        duck.performFly();
    }
}
