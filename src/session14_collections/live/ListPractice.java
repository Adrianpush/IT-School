package session14_collections.live;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        List<Integer> updatedList = updateList(myList, 0, 25);
        System.out.println(myList);
        System.out.println(updatedList);
    }

    private static List<Integer> initializeList() {
        List<Integer> myList = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            myList.add(index);
        }
        return myList;
    }

    private static List<Integer> updateList(List<Integer> list, int index, int value){
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index.");
            return list;
        }
        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }

    private static boolean searchElement(List<Integer> list, int value) {
        return list.contains(value);
    }
}
