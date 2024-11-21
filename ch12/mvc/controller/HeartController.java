package ch12.mvc.controller;

import ch12.mvc.model.HeartAdapter;
import ch12.mvc.model.HeartModelInterface;
import ch12.mvc.view.DJView;

public class HeartController implements ControllerInterface{
    HeartModelInterface model;
    DJView djView;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        this.djView = new DJView(this, new HeartAdapter(model));
        djView.createView();
        djView.createControls();
        djView.disableStopMenuItem();
        djView.disableStartMenuItem();
    }

    @Override
    public void start() {}
    @Override
    public void stop() {}
    @Override
    public void increaseBPM() {}
    @Override
    public void decreaseBPM() {}
    @Override
    public void setBPM(int bpm) {}
}
