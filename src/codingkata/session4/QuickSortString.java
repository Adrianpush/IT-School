package codingkata.session4;

import java.util.Scanner;

public class QuickSortString {

    public static void main(String[] args) {

        int[] numbers = getInputNumbers();
        for (int num : numbers){
            System.out.println(num);
        }

        quickSort(numbers, 0, numbers.length - 1);
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }

    public static int[] getInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of numbers separated by spaces: ");
        String[] numStrings = scanner.nextLine().split(" ");
        int[] numbers = new int[numStrings.length];

        for (int i = 0; i < numStrings.length; i++) {
            numbers[i] = Integer.parseInt(numStrings[i]);
        }

        return numbers;
    }


    public static void quickSort(int[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        int pivotValue = array[pivotIndex];

        int leftPointer = startIndex;
        int rightPointer = endIndex;

        do {
            while (array[leftPointer] < pivotValue)
                //As long as values to the left of the pivot are smaller than the pivot, increment left pointer.
                leftPointer++;
            while (array[rightPointer] > pivotValue)
                //As long as values to the right of the pivot are bigger than the pivot, decrement right pointer.
                rightPointer--;
            if (leftPointer <= rightPointer) {
                //If the left and right pointers haven't met, swap the values at their indexes
                // and increase left point, decrement right pointer.
                int aux = array[leftPointer];
                array[leftPointer] = array[rightPointer];
                array[rightPointer] = aux;
                leftPointer++;
                rightPointer--;
            }
        } while (leftPointer <= rightPointer);
        //Do this till left pointer and right pointers meet and so
        // making sure all values bigger then the pivot are on the right side
        // and all values smaller than the pivot are on the left side.

        if (startIndex < rightPointer) {
            //if right pointer has not reached the startIndex recursively sort the left side of the array.
            quickSort(array, startIndex, rightPointer);
        }
        if (endIndex > leftPointer) {
            //if left pointer has not reached the endIndex recursively sort the right side of the array.
            quickSort(array, leftPointer, endIndex);
        }
    }
}