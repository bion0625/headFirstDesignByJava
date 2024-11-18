package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class TeaWithHook extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("찾잎을 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toUpperCase().startsWith("Y")) return true;
        else return false;
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("홍차에 레몬을 넣을까요? (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO 오류");
        }
        return Optional.ofNullable(answer).orElse("no");
    }
}
