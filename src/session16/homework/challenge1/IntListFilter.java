package session16.homework.challenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class IntListFilter {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);
        IntPredicate evenChecker = a -> a % 2 == 0;
        IntPredicate oddChecker = a -> a % 2 == 1;
        System.out.println(filterList(integerList, evenChecker));
        System.out.println(filterList(integerList, oddChecker));
    }

    private static List<Integer> filterList(List<Integer> inputList, IntPredicate checker) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer number : inputList) {
            if (checker.test(number)) {
                resultList.add(number);
            }
        }
        return resultList;
    }
}