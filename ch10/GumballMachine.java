package ch10;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = hasQuarterState;
        }
    }

    public void setCount(int count) {
        this.count = count;
    }

    void insertQuarter() {
        state.insertQuarter();
    }
    void ejectQuarter() {
        state.ejectQuarter();
    }
    void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    void refill(int count) {
        state.refill(count);
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) count = count - 1;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\n주식회사 왕뽑기\n자바로 돌아가는 최신형 뽑기 기계\n남은 개수: " + count + "개\n" + state.toString() + "\n";
    }
}
