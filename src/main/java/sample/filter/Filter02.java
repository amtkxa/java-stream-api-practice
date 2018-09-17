package sample.filter;

import java.util.Arrays;
import java.util.List;

/**
 * 単純な条件一致の抽出
 */
public class Filter02 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.stream()
                .filter(value -> value > 2)
                .forEach(value -> System.out.println(value));

    }
}
