package ch06;

public class SimpleRemoteControl {
    private Command slot;
    public SimpleRemoteControl() {}

    public void setComment(Command comment) {
        this.slot = comment;
    }
    public void buttonWasPressed() {
        this.slot.execute();
    }
}
