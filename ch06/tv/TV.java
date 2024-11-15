package ch06.tv;

public class TV {

    private int inputChannel;
    private int volume;
    private String location;

    public TV(String location) {
        this.inputChannel = 0;
        this.volume = 0;
        this.location = location;
    }

    public void on() {
        System.out.println(location + "의 tv가 켜졌습니다.");
    }
    public void off() {
        System.out.println(location + "의 tv가 꺼졌습니다.");
    }
    public void setInputChannel(int inputChannel) {
        this.inputChannel = inputChannel;
        System.out.println("채널이 " + inputChannel + "로 바뀌었습니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨이 " + volume + "로 바뀌었습니다.");
    }
}
