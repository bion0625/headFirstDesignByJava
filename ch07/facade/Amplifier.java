package ch07.facade;

public class Amplifier {

    int volume = 0;

    Tuner tuner;
    StreamingPlayer player;

    public void on() {
        System.out.println("앰프가 켜집니다");
    }
    public void off() {
        System.out.println("앰프가 꺼집니다");
    }
    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
        System.out.println("엠프 입력을 스트리밍 플레이어로 설정합니다.");
    }
    public void setStereoSound() {
        System.out.println("엠프를 서라운드 스테레오 모드로 전환합니다.");
    }
    public void setSurroundSound() {
        System.out.println("엠프를 서라운드 음향 모드로 전환합니다.");
    }
    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("엠프 볼륨을 " + volume + "로 설정합니다.");
    }

    // toString
}
