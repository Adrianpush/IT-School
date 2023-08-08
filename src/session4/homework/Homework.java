package session4.homework;

public class Homework {

    public static void main(String[] args) {
        boolean isAdult = isAdultAccordingToAge(20);
        int maxHeight = determineMaxHeight(190, 188);
        printAllNumbersTo(10);
        printAllEvenNumbersTo(10);
        String tempRealFeel = checkTemperature(19);
        String triangleType = checkTriangle(2, 5, 5);
        long factorial = calculateFactorial(20);
    }

    /**
     * Write a Java program that declares an integer variable age with a value of 20.
     * Print a statement saying "I am adult" if age is 18 or more,
     * else print "I am not an adult".
     */
    public static boolean isAdultAccordingToAge(int age) {
        String message = age > 17 ? "I am an adult." : "A-gu-gu-goo!";
        System.out.println(message);
        return age > 17;
    }

    /**
     * Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
     * Use a ternary operator to determine the greater height and assign it to a variable maximumHeight.
     * Print the result.
     */
    public static int determineMaxHeight(int heightOne, int heightTwo) {
        int maxHeight = heightTwo > heightOne ? heightTwo : heightOne;
        System.out.println("The bigger of the two heights (" + heightOne + ", " + heightTwo +
                ") is " + maxHeight + ".");
        return maxHeight;
    }

    /**
     * Write a Java program to print the numbers from 1 to 10 using a for loop.
     */
    public static void printAllNumbersTo(int num) {
        for (int index = 1; index <= num; index++) {
            System.out.println(index);
        }
    }

    /**
     * Print only the even numbers from 1 to 10.
     */
    public static void printAllEvenNumbersTo(int num) {
        /*
         Not efficient
         for (int index = 2; index <=num; index++){
             if (index % 2 == 0){
                 System.out.println(index);
             }
         }
         */
        for (int index = 2; index <= num; index += 2) {
            System.out.println(index);
        }
    }

    /**
     * Write a Java program where you declare an integer variable temperature.
     * Assign a value to it and print "Hot" if the temperature is more than 30,
     * "Warm" if the temperature is between 20 and 30,
     * and "Cold" if it's less than 20.
     */
    public static String checkTemperature(int degrees) {
        String realFeel = "Cold";
        if (degrees > 30) {
            realFeel = "Hot";
        } else if (degrees > 20) {
            realFeel = "Warm";
        }
        System.out.println("A temperature of " + degrees + " degrees is considered " + realFeel + ".");
        return realFeel;
    }

    /**
     * Write a Java program that determines the type of triangle based on its sides.
     * Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
     * Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
     */
    public static String checkTriangle(int sideOne, int sideTwo, int sideThree) {
        String triangleType = "Scalene";
        if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
            triangleType = (sideOne == sideTwo && sideOne == sideThree) ? "Equilateral" : "Isosceles";
        }
        System.out.println("The triangle with sides of lengths " + sideOne + ", " + sideTwo + " and " + sideThree +
                " is of type " + triangleType + ".");
        return triangleType;
    }

    /**
     * Write a Java program to calculate the factorial of a number using a for loop.
     * Declare an integer variable number and assign a value to it.
     * Then calculate and print the factorial of number.
     */
    public static long calculateFactorial(int num) {
        long result = 1;
        for (int index = 2; index <= num; index++) {
            result *= index;
        }
        System.out.println("The value of " + num + " factorial is " + result + ".");
        return result;
    }
}
