package session5.homework;

import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(1, 11);
        System.out.println("Welcome to the GuessingGame. Guess a number between 1 and 10, inclusive.");
        boolean gameOn = true;
        do {
            int userGuess = UserInput.getValidInt("Enter your guess.");
            if (userGuess == answer) {
                System.out.println("Congratulations!");
                gameOn = false;
            } else if (userGuess > answer) {
                System.out.println("Go lower!");
            } else {
                System.out.println("Go higher!");
            }
        } while (gameOn);
    }
}
