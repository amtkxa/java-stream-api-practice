package sample.limit;

import java.util.Arrays;
import java.util.List;

/**
 * 単純な条件一致の抽出
 */
public class Limit {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "B", "A");
        stringList.stream()
                .limit(3)
                .forEach(value -> System.out.println(value));

    }
}
