package ch06.ceillingFan;

import ch06.Command;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    private int preSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (preSpeed) {
            case CeilingFan.HIGH: ceilingFan.high();break;
            case CeilingFan.MEDIUM: ceilingFan.medium();break;
            case CeilingFan.LOW: ceilingFan.low();break;
            case CeilingFan.OFF: ceilingFan.off();break;
        }
    }
}
