package session4.homework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {

    /**
     * Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
     * Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
     * Print both lists and observe the output.
     */
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        listOne.add("Mercury");
        listOne.add("Venus");
        listOne.add("Terra");
        listOne.add("Mars");
        listOne = listTwo;
        listOne.add("Jupiter");
        listOne.add("Saturn");
        listOne.add("Uranus");
        listOne.add("Neptune");
        System.out.println(listOne);
        System.out.println(listTwo);
        // After reassigning listOne to listTwo the location in memory that held the information for
        // listOne before the reassignment is no longer accessible as we no longer have any variable pointing
        // to that location. (Garbage collected?)
        List<String> listThree = new ArrayList<>();
        List<String> listFour = new ArrayList<>();
        listThree.add("Mercury");
        listThree.add("Venus");
        listThree.add("Terra");
        listThree.add("Mars");
        List<String> tempList = listThree;
        listThree = listFour;
        listFour = tempList;
        listThree.add("Jupiter");
        listThree.add("Saturn");
        listThree.add("Uranus");
        listThree.add("Neptune");
        System.out.println(listThree);
        System.out.println(listFour);
        // If a switch between the list is desired, this can be achieved using a temporary list.
    }
}
