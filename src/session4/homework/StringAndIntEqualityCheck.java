package session4.homework;

public class StringAndIntEqualityCheck {


    public static void main(String[] args) {
        /*
        Write a Java program where
        you create two String objects named stringOne and stringTwo with the same value "OpenAI".
        Check and print whether they refer to the same object.
         */
        String stringOne = new String("OpenAI");
        String stringTwo = new String("OpenAI");
        String message = stringOne == stringTwo ? "The variables stringOne and stringTwo point to the same object." :
                "The variables stringOne and stringTwo do not point to the same object.";
        System.out.println(message);

        stringOne = "OpenAI";
        stringTwo = "OpenAI";
        message = stringOne == stringTwo ? "The variables stringOne and stringTwo point to the same object." :
                "The variables stringOne and stringTwo do not point to the same object.";
        System.out.println(message);

        /*
        Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
        Use an equality operator to compare these two numbers and print the result.
        Do the same for two String objects firstString and secondString with the same value,
        but use the equals() method for comparison. Print the result.
         */
        int firstNumber = 30;
        int secondNumber = 50;
        message = firstNumber == secondNumber ? "The numbers are equal." : "The numbers are not equal.";
        System.out.println(message);

        String firstString = "30";
        String secondString = "30";
        message = firstString.equals(secondString) ? "The strings are equal." : "The strings are not equal.";
        System.out.println(message);

        /*
          Write a Java program to create two String variables,
          countryOne with the value "USA" and countryTwo with the value "USA".
          Check if countryOne and countryTwo are equal using the equals() method and print the result.
          Then change the value of countryTwo to "UK" and check for equality again. Print the result.
         */
        String countryOne = "USA";
        String countryTwo = "USA";
        boolean areEqual = countryOne.equals(countryTwo);
        System.out.println("Comparing the strings " + countryOne + " and " + countryTwo +
                " using the String equals method returns " + areEqual + ".");
        countryTwo = "UK";
        areEqual = countryOne.equals(countryTwo);
        System.out.println("Comparing the strings " + countryOne + " and " + countryTwo +
                " using the String equals method returns " + areEqual + ".");

    }
}
