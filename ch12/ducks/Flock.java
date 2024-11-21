package ch12.ducks;

import ch12.ducks.observer.Observer;
import ch12.ducks.observer.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(quacker -> quacker.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
    }
}
