package ch07.adapter;

import ch01.Duck;
import ch01.MallardDuck;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey =  new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.performQuack();
        duck.performFly();
    }
}