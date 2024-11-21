package ch12.ducks.duck;

import ch12.ducks.observer.Observable;
import ch12.ducks.observer.Observer;
import ch12.ducks.observer.Quackable;

public class RedHeadDuck implements Quackable {
    private Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "붉은머리오리";
    }
}
