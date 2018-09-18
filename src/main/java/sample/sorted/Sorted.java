package sample.sorted;

import java.util.Arrays;
import java.util.List;

/**
 * List の ソート
 */
public class Sorted {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(20, 10, 50, 40, 30);
        integerList.stream()
                .sorted()
                .forEach(value -> System.out.println(value));

    }
}
