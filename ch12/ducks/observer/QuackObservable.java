package ch12.ducks.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
