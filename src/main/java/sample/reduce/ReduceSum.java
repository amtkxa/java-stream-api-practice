package sample.reduce;

import java.util.Arrays;
import java.util.List;

/**
 * 単純な条件一致の抽出
 */
public class ReduceSum {
    public static void main(String[] args) {

        List<Integer> arrays = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = arrays.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
