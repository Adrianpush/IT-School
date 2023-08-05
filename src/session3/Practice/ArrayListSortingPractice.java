package session3.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortingPractice {

    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("?This");
        myArrayList.add("#is");
        myArrayList.add("a");
        myArrayList.add("Sorting");
        myArrayList.add(".Test");
        myArrayList.add("!in");
        myArrayList.add("{Java");

        System.out.println("Before sorting: " + myArrayList);
        // Output: Before sorting: [Hello, ?This, #is, a, Sorting, .Test, !in, {Java]
        Collections.sort(myArrayList);
        // After sorting: [!in, #is, .Test, ?This, Hello, Sorting, a, {Java]
        System.out.println("After sorting: " + myArrayList);
    }
}
