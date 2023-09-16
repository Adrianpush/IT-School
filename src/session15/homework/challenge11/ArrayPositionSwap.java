package session15.homework.challenge11;

import java.util.Arrays;

public class ArrayPositionSwap {

    private static <T> T[] swapElements(T[] array, int firstPosition, int secondPosition) {
        if (firstPosition >= 0 && firstPosition < array.length && secondPosition >= 0 && secondPosition < array.length) {
            T temp = array[firstPosition];
            array[firstPosition] = array[secondPosition];
            array[secondPosition] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] strings = {"1", "2", "3"};
        Integer[] ints = {1, 2, 3};
        Double[] doubles = {1.2, 2.3, 4.9};
        System.out.println(Arrays.toString(swapElements(strings, 0, 2)));
        System.out.println(Arrays.toString(swapElements(ints, 0, 1)));
        System.out.println(Arrays.toString(swapElements(doubles, 1, 2)));
    }
}