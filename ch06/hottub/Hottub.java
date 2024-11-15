package ch06.hottub;

public class Hottub {
    private String location;

    public void on() {
        System.out.println("Hottub가 켜졌습니다.");
    }
    public void off() {
        System.out.println("Hottub가 꺼졌습니다.");
    }
    public void circulate() {
        System.out.println(location + "의 Hottub가 회전합니다.");
    }
}
