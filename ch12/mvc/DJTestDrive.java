package ch12.mvc;

import ch12.mvc.controller.BeatController;
import ch12.mvc.controller.ControllerInterface;
import ch12.mvc.model.BeatModel;
import ch12.mvc.model.BeatModelInterface;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
