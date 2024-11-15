package ch06.stereo;

import ch06.Command;

public class StereoOff implements Command {

    private Stereo stereo;

    public StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
