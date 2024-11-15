package ch06.garageDoor;

public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public GarageDoor() {
        this("garage");
    }

    public void up() {
        System.out.println(location + "의 문이 올라갑니다.");
    }

    public void down() {
        System.out.println(location + "의 문이 내려갑니다.");
    }

    public void stop() {
        System.out.println(location + "의 문이 멈췄습니다.");
    }

    public void lightOn() {
        System.out.println(location + "의 불이 켜집니다.");
    }

    public void lightOff() {
        System.out.println(location + "의 불이 꺼집니다.");
    }
}
