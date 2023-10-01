package session8_arrays.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FruitSorting {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Pear");
        System.out.println(fruits);
        fruits.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return -1;
                } else if (o1.length() < o2.length()) {
                    return 1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        System.out.println(fruits);
    }
}


