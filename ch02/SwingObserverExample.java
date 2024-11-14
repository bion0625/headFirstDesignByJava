package ch02;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());
        button.addActionListener(event -> System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event -> System.out.println("그냥 저질러 버렷!!!"));

        // 버튼과 기본 설정 추가
        frame.getContentPane().add(button); // 버튼을 프레임에 추가
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 누르면 종료
        frame.setSize(300, 200); // 프레임 크기 설정
        frame.setVisible(true); // 프레임 보이도록 설정
    }
}
