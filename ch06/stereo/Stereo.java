package ch06.stereo;

public class Stereo {

    private int volume;
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "의 오디오 전원이 켜집니다.");
    }
    public void setCD() {
        System.out.println("CD를 재생합니다.");
    }

    public void setDvd() {
        System.out.println("DVD를 재생합니다.");
    }

    public void setRadio() {
        System.out.println("라디오를 재생합니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("오디오 볼륩을 " + this.volume + "로 세팅했습니다.");
    }

    public void off() {
        System.out.println(location + "의 오디오 전원이 꺼집니다.");
    }
}
