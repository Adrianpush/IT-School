package session3;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        System.out.println("Please provide some text: \n");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println(userInput);
    }


}
