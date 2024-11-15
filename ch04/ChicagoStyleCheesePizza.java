package ch04;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        this.name = "시카고 스타일 딥 디쉬 치즈 피자";
        this.toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    @Override
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
