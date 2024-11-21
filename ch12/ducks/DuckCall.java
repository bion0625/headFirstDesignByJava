package ch12.ducks;

import ch12.ducks.observer.Observable;
import ch12.ducks.observer.Observer;
import ch12.ducks.observer.Quackable;

public class DuckCall implements Quackable {
    private Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽉꽉");
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
        return "오리 호출기";
    }
}
