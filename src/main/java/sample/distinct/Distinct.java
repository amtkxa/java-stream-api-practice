package sample.distinct;

import java.util.Arrays;
import java.util.List;

/**
 * 単純な条件一致の抽出
 */
public class Distinct {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "B", "A");
        stringList.stream()
                .distinct()
                .forEach(value -> System.out.println(value));

    }
}
