package sample.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filter を使った絞り込みを行い、List形式にて返却するサンプルコード（String）
 */
public class FilterCollect01 {
    public static void main(String[] args) {

        // filter した list を生成
        List<String> strings = Arrays.asList("A", "B", "C", "B", "A");
        List<String> results = strings.stream()
                .filter(value -> value == "B")
                .collect(Collectors.toList());

        // 結果出力
        results.forEach(System.out::println);
    }
}