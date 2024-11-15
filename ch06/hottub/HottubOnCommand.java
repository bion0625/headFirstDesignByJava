package ch06.hottub;

import ch06.Command;

public class HottubOnCommand implements Command {

    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
