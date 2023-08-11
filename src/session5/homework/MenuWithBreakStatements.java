package session5.homework;

public class MenuWithBreakStatements {

    public static void main(String[] args) {
        String userName = UserInput.getStringInput("What is your username?");
        String greeting = "Hello, world!";
        String menuMessage = "Welcome to the user menu. \n Choose action by entering an integer: \n" +
                " 1. Print greeting. \n 2. Print username. \n 3. End program.";
        boolean displayMenu = true;
        while (displayMenu) {
            int userInput = UserInput.getValidInt(menuMessage);
            switch (userInput) {
                case 1:
                    System.out.println(greeting);
                    break;
                case 2:
                    System.out.println(userName);
                    break;
                case 3:
                    displayMenu = false;
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}