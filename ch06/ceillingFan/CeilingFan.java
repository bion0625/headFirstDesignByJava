package ch06.ceillingFan;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + "의 천장 선풍기의 속도가 HIGH 입니다.");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "의 천장 선풍기의 속도가 MEDIUM 입니다.");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + "의 천장 선풍기의 속도가 LOW 입니다.");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + "의 천장 선풍기가 꺼졌습니다.");
    }

    public int getSpeed() {
        return this.speed;
    }
}
