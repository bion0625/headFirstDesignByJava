package ch05;

public class ChocolateBoilerClient {
    public static void main(String[] args) {
        // ChocolateBoiler 싱글턴 인스턴스 가져오기
        ChocolateBoiler instance1 = ChocolateBoiler.UNIQUE_INSTANCE;
        ChocolateBoiler instance2 = ChocolateBoiler.UNIQUE_INSTANCE;

        // 같은 객체인지 확인 (참조 비교)
        if (instance1 == instance2) {
            System.out.println("instance1과 instance2는 동일한 인스턴스입니다. (싱글턴 확인)");
        } else {
            System.out.println("instance1과 instance2는 다른 인스턴스입니다. (싱글턴 아님)");
        }

        // 초기 상태 확인
        System.out.println("초기 상태:");
        System.out.println("isEmpty: " + instance1.isEmpty());
        System.out.println("isBoiled: " + instance1.isBoiled());

        // 상태 변경 후 확인
        instance1.fill();
        System.out.println("\nfill() 호출 후:");
        System.out.println("isEmpty: " + instance2.isEmpty()); // 동일한 인스턴스이므로 instance2로도 확인 가능
        System.out.println("isBoiled: " + instance2.isBoiled());

        instance1.boil();
        System.out.println("\nboil() 호출 후:");
        System.out.println("isEmpty: " + instance2.isEmpty());
        System.out.println("isBoiled: " + instance2.isBoiled());

        instance1.drain();
        System.out.println("\ndrain() 호출 후:");
        System.out.println("isEmpty: " + instance2.isEmpty());
        System.out.println("isBoiled: " + instance2.isBoiled());
    }
}
