package ch06.tv;

import ch06.Command;

public class TvOffCommand implements Command {
    private TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
