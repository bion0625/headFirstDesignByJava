package ch12.ducks;

import ch12.ducks.observer.Observable;
import ch12.ducks.observer.Observer;
import ch12.ducks.observer.Quackable;

public class GooseAdapter implements Quackable {
    private Goose goose;
    private Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "거위";
    }
}
