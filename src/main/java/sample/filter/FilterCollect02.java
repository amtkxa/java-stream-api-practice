package sample.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 単純な条件一致の抽出を行い、List形式にて返却するサンプルコード（Integer）
 */
public class FilterCollect02 {
    public static void main(String[] args) {

        // filter した list を生成
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> results = integers.stream()
                .filter(value -> value > 2)
                .collect(Collectors.toList());

        // 結果出力
        results.forEach(System.out::println);
    }
}
