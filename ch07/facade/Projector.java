package ch07.facade;

public class Projector {
    StreamingPlayer player;

    public void setInput(StreamingPlayer player) {
        this.player = player;
        System.out.println("프로젝터의 입력을 스트리밍 플레이어로 설정합니다.");
    }

    public void on() {
        System.out.println("프로젝터가 켜집니다..");
    }
    public void off() {
        System.out.println("프로젝터가 꺼집니다..");
    }
    public void tvMode() {
        System.out.println("프로젝터를 TV 모드로 전환합니다.");
    }
    public void wideScreenMode() {
        System.out.println("프로젝터를 와이드 스크린 모드로 전환합니다.");
    }
    //toString
}
