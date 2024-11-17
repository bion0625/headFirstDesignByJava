package ch07.facade;

public class StreamingPlayer {
    Amplifier amplifier;

    public StreamingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("스트리밍 플레이어가 켜집니다.");
    }
    public void off() {
        System.out.println("스트리밍 플레이어가 꺼집니다.");
    }
    public void pause() {
        System.out.println("스트리밍 플레이어가 중지됩니다.");
    }
    public void play(String name) {
        System.out.println(name + "가 재생됩니다.");
    }
    public void setSurroundAudio() {}
    public void setTwoChannelAudio() {}
    public void stop() {}
    //toString
}
