package session16.homework.challenge11;

import java.util.ArrayList;
import java.util.List;

public class FindInListTest {

    public static void main(String[] args) {
        FindInList isInList = (List a, Object object) -> a.contains(object);
        List someList = new ArrayList<>();
        someList.add("Hello");
        someList.add(20);
        someList.add(new ArrayList<>());
        someList.add(new StringBuilder("stringbuilder"));
        int[] ints = new int[4];
        someList.add(ints);
        System.out.println(isInList.findInList(someList, "Hello"));
        System.out.println(isInList.findInList(someList, ints));
        System.out.println(isInList.findInList(someList, 20));
    }
}
