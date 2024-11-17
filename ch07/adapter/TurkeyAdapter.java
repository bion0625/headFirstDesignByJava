package ch07.adapter;

import ch01.Duck;

public class TurkeyAdapter extends Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

    @Override
    public void performFly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    @Override
    public void display() {

    }
}
