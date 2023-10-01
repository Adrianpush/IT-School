package session7_utilityclasses.livesession;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

    }

    public static void printUserInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String userName = scanner.next();
        System.out.println("Hello " + userName +"!");
    }
}
