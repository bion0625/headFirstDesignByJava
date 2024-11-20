package ch11.datingService;

import java.lang.reflect.Proxy;
import java.util.List;

public class MatchMakingTestDrive {
    private List<Person> people;
    private Person kim = new PersonImpl("김꺽정", "M", "자전거");

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        Person joe = getPersonFromDatabase("김자바");
        Person ownerProxy = getOwnerProxy(kim);
        System.out.println("이름: " + ownerProxy.getName());
        ownerProxy.setInterests("볼링, 바둑");
        System.out.println("본인 프록시에 관심 사항을 등록합니다.");
        try {
            ownerProxy.setGreekRating(10);
        } catch (Exception e) {
            System.out.println("본인 프록시에는 괴짜지수를 매길 수 없습니다.");
        }
        System.out.println("괴짜 지수: " + ownerProxy.getGreekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("이름: " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("볼링, 바둑");
        } catch(Exception e) {
            System.out.println("타인의 프록시에는 관심 사항을 등록할 수 없습니다.");
        }
        nonOwnerProxy.setGreekRating(3);
        System.out.println("타인의 프록시에 괴짜 지수를 매깁니다.");
        System.out.println("괴짜 지수: " + nonOwnerProxy.getGreekRating());
    }

    private void initializeDatabase() {
        people = List.of(new PersonImpl("김자바", "F", "장기", 7));
        kim.setGreekRating(7);
    }

    private Person getPersonFromDatabase(String name) {
        return people.stream().filter(person -> name.equals(person.getName())).findFirst().orElseThrow();
    }

    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

}
