package ch06.garageDoor;

import ch06.Command;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.stop();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOff();
    }
}
