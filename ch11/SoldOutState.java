package ch11;

import java.io.Serial;

public class SoldOutState implements State {
    @Serial
    private static final long serialVersionUID = 5L;

    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었습니다. 다음 기회에 이용해 주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진되었습니다.");
    }

    @Override
    public String toString() {
        return "매진";
    }

    @Override
    public void refill(int count) {
        System.out.println(count + "개가 리필됩니다.");
        gumballMachine.setCount(count);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
