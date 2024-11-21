package ch12.mvc;

import ch12.mvc.controller.ControllerInterface;
import ch12.mvc.controller.HeartController;
import ch12.mvc.model.HeartModel;
import ch12.mvc.model.HeartModelInterface;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModelInterface heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
