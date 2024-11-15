package ch06.garageDoor;

import ch06.Command;

public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.stop();
        garageDoor.lightOn();
    }
}
