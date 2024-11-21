package ch12.ducks;

import ch12.ducks.observer.Observer;
import ch12.ducks.observer.Quackable;

public class QuackCount implements Quackable {
    private Quackable duck;
    private static int quacks;

    public QuackCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quacks++;
    }

    public static int getQuacks() {
        return quacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}
