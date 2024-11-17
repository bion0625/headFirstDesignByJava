package ch07.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();
        IteratorEnumeration<Integer> integerIteratorEnumeration = new IteratorEnumeration<>(iterator);

        while (integerIteratorEnumeration.hasMoreElements()) {
            System.out.println(integerIteratorEnumeration.nextElement());
        }
    }
}
