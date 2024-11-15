package ch06.light;

public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public Light() {
        this("Living Room");
    }
    public void on() {
        System.out.println(location + "의 조명이 켜졌습니다.");
    }
    public void off() {
        System.out.println(location + "의 조명이 꺼졌습니다.");
    }
    public void dim() {
        System.out.println(location + "의 조명이 반만 켜졌습니다.");
    }
}
