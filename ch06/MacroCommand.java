package ch06;

import java.util.Arrays;

public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        Arrays.stream(commands).forEach(Command::execute);
    }

    @Override
    public void undo() {
        Arrays.stream(commands).forEach(Command::undo);
    }
}
