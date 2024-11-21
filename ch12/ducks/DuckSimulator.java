package ch12.ducks;

import ch12.ducks.factory.AbstractDuckFactory;
import ch12.ducks.factory.CountingDuckFactory;
import ch12.ducks.observer.Quackable;
import ch12.ducks.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redHeadDuck = duckFactory.createRedHeadDuckDuck();
        Quackable duckCall = duckFactory.createDuckCallDuck();
        Quackable rubberDuck = duckFactory.createRubberDuckDuck();
        GooseAdapter gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallards);


        System.out.println("\n오리 시뮬레이션 게임 (+옵저버)");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\n오리가 소리 낸 횟수: " + QuackCount.getQuacks() + " 번");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
