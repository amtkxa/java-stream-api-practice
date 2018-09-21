package sample.filter;

import java.util.Arrays;
import java.util.List;

/**
 * filter を使った絞り込み
 */
public class Filter02 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.stream()
                .filter(value -> value > 2)
                .forEach(value -> System.out.println(value));

    }
}
