package ch06;

import ch06.garageDoor.GarageDoor;
import ch06.garageDoor.GarageDoorOpenCommand;
import ch06.light.Light;
import ch06.light.LightOnCommand;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setComment(lightOn);
        remote.buttonWasPressed();
        remote.setComment(garageDoorOpen);
        remote.buttonWasPressed();
        remote.buttonWasPressed();
    }
}
