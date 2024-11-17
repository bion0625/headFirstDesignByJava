package ch07.facade;

public class Tuner {
    Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {}
    public void off() {}
    public void setAm() {}
    public void setFm() {}
    public void setFrequency() {}
    //toString
}
