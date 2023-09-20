package session16.homework.challenge2_4_6_10;

import java.util.Arrays;
import java.util.List;

public class StringListSorting {

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Aragon", "Legolas", "Gimli", "Gandalf", "Boromir", "Sam");
        namesList.sort((String a, String b) -> (a.compareTo(b)));
        System.out.println(namesList);
        namesList.sort((String a, String b) -> (b.compareTo(a)));
        System.out.println(namesList);
        namesList.sort((String a, String b) -> (a.length() - b.length()));
        System.out.println(namesList);
        namesList.forEach(a -> namesList.set(namesList.indexOf(a), a.toUpperCase()));
        System.out.println(namesList);
    }
}
