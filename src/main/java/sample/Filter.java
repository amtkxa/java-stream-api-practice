package sample;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        // Sample 01
        System.out.println("=== Sample 01 ===");
        List<String> stringList = Arrays.asList("A", "B", "C", "B", "A");
        stringList.stream()
                .filter(value -> value == "B")
                .forEach(value -> System.out.println("value: " + value));

        // Sample 02
        System.out.println("=== Sample 02 ===");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.stream()
                .filter(value -> value > 2)
                .forEach(value -> System.out.println("value: " + value));

    }
}
