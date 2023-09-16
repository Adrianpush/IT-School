package session15.live.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardPractice {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("John", "ALice");
        List<Integer> integers = Arrays.asList(1, 2);

        printFirstClass(stringList);
        printFirstClass(integers);
    }

    private static void printFirstClass(List<?> list) {
        if (!list.isEmpty()) {
            System.out.println(list.get(0).getClass().getSimpleName());
        }
    }
}
