package session16.homework.challenge3and5;

import java.util.Arrays;
import java.util.List;

public class ListSumTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 25, 39);
        ListOperator getSum = (a -> {
            int sum = 0;
            for (Integer number : a) {
                sum += number;
            }
            return sum;
        });
        System.out.println(getSum.listOperator(numbers));

        ListOperator getMin = a -> {
            if (a.isEmpty()) throw new IllegalArgumentException("List Empty");
            int minValue = Integer.MAX_VALUE;
            for (int number : a) {
                if (number < minValue) {
                    minValue = number;
                }
            }
            return minValue;
        };
        System.out.println(getMin.listOperator(numbers));
    }
}
