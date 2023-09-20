package session16.homework.challenge15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListFilterTest {

    public static void main(String[] args) {
        ListFilter<Integer> integerListFilter = (inputList, predicate) -> {
            List<Integer> filteredList = new ArrayList<>();
            for (Integer number : inputList) {
                if (predicate.test(number)) {
                    filteredList.add(number);
                }
            }
            return filteredList;
        };

        Predicate<Integer> greaterThenTen = value -> (value > 10);

        List<Integer> numbers = Arrays.asList(5, 20, 30, 2, 1, 99);

        System.out.println("Original List: " + numbers + "\n Filtered List: " +
                integerListFilter.getFilteredList(numbers, greaterThenTen));

        ListFilter<String> stringListFilter = ((inputList, predicate) -> {
            List<String> filteredList = new ArrayList<>();
            for (String string : inputList) {
                if (predicate.test(string)) {
                    filteredList.add(string);
                }
            }
            return filteredList;
        });

        Predicate<String> shorterThenFive = value -> value.length() < 5;
        List<String> capitals = Arrays.asList("London", "Paris", "Rome", "Bucharest", "Oslo", "Washington");
        System.out.println("Original List: " + capitals + "\n Filtered List: " +
                stringListFilter.getFilteredList(capitals, shorterThenFive));
    }
}
