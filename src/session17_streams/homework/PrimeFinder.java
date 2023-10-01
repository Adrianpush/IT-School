package session17_streams.homework;

import codingkata.session2.PrimeNumberFinder;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeFinder {

    public static void main(String[] args) {
        printPrimesUpTo(1000);
    }

    /**
     * Create a stream of numbers from 1 to 100
     * and use the filter operation to retain only those numbers which are prime.
     *
     * @param bound - UpperLimit
     */
    private static void printPrimesUpTo(int bound) {
        System.out.println(Arrays.toString(IntStream.range(0, bound).filter(PrimeNumberFinder::isPrime).toArray()));
    }
}
