package sample.map;

import java.util.Arrays;
import java.util.List;

/**
 * 要素の変換
 */
public class Map01 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "B", "A");
        stringList.stream()
                .map(value -> "value: " + value)
                .forEach(value -> System.out.println(value));

    }
}
