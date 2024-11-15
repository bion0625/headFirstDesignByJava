package ch04;

public class CaliforniaStyleCheesePizza extends Pizza{
    public CaliforniaStyleCheesePizza() {
        this.name = "존맛 딥 치즈 피자";
        this.toppings.add("요리사의 땀");
    }

    @Override
    void prepare() {
        System.out.println("캘리포니아 치즈피자는 준비따위 하지 않지.");
    }

    @Override
    void bake() {
        System.out.println("굽는 척 하지만 사실 반죽을 그대로 먹이기에 시간만 죽이는 중...");
    }

    @Override
    void cut() {
        System.out.println("반으로만 자르는 중...");
    }

    @Override
    void box() {
        System.out.println("박스보단 비닐(뜨겁게, 환경 호르몬과 함께 섭취 유도)에 포장하는 중...");
    }
}
