package session3.homework;

import java.util.Scanner;

public class HomeWorkSession3 {
    private final Scanner SCANNER;

    public HomeWorkSession3() {
        this.SCANNER = new Scanner(System.in);
    }
    public static void main(String[] args) {
        HomeWorkSession3 homeWork = new HomeWorkSession3();
        homeWork.exercise1();
        homeWork.exercise2();
        homeWork.exercise3();
        homeWork.exercise4();
        homeWork.exercise5();
        homeWork.exercise6();
        homeWork.exercise7();
        homeWork.exercise8();
        homeWork.exercise9();
        homeWork.exercise10();
        homeWork.exercise11();
        homeWork.exercise12();
        homeWork.exercise13();
        homeWork.exercise14();
    }
    private double[] getTwoValidDoubles() {
        double[] validInputs = new double[2];
        boolean isInputValid = false;
        while (!isInputValid) {
            System.out.println("Please input the first number.");
            String firstNumString = SCANNER.next();
            try {
                validInputs[0] = Double.parseDouble(firstNumString);
                isInputValid = true;
            } catch (NumberFormatException | NullPointerException exception) {
                System.out.println(firstNumString + " is not a valid number.");
            }
        }
        isInputValid = false;
        while (!isInputValid) {
            System.out.println("Please input the second number.");
            String secondNumString = SCANNER.next();
            try {
                validInputs[1] = Double.parseDouble(secondNumString);
                isInputValid = true;
            } catch (NumberFormatException exception) {
                System.out.println(secondNumString + " is not a valid number.");
            }
        }
        return validInputs;
    }
    private boolean getValidBool() {
        boolean isInputValid = false;
        boolean myBoolValue = false;
        while (!isInputValid) {
            System.out.println("Please input a boolean value (True or False)");
            String boolInputString = SCANNER.next();
            if (boolInputString.equalsIgnoreCase("false")) {
                isInputValid = true;
            } else if (boolInputString.equalsIgnoreCase("true")) {
                myBoolValue = true;
                isInputValid = true;
            } else {
                System.out.println(boolInputString + " is not a valid boolean value");
            }
        }
        return myBoolValue;
    }
    private int getValidInt() {
        int myNum = 0;
        boolean isInputValid = false;
        while (!isInputValid) {
            System.out.println("Please input an integer.");
            String myNumString = SCANNER.next();
            try {
                myNum = Integer.parseInt(myNumString);
                isInputValid = true;
            } catch (NumberFormatException exception) {
                System.out.println(myNumString + " is not a valid integer.");
            }
        }
        return myNum;
    }
    /**
     * Write a Java program to take two numbers as input
     * and display the result of addition, subtraction, multiplication, division, and modulus.
     */
    public void exercise1() {
        double[] validInputs = this.getTwoValidDoubles();
        double firstNum = validInputs[0];
        double secondNum = validInputs[1];
        System.out.println("The result of the addition of the two numbers is " + (firstNum + secondNum));
        System.out.println("The result of the subtraction of the two numbers is " + (firstNum - secondNum));
        System.out.println("The result of the multiplication of the two numbers is " + (firstNum * secondNum));
        System.out.println("The result of the division of the two numbers is " + (firstNum / secondNum));
        System.out.println("The modulus of the two numbers is " + (firstNum % secondNum));
    }
    /**
     * Create a Java program where you increment and decrement the same variable.
     * Display the value of the variable after each operation.
     */
    public void exercise2() {
        int myNumber = 5;
        System.out.println("The value of myNumber is " + myNumber);
        myNumber++;
        System.out.println("After incrementing, the value of myNumber is " + myNumber);
        myNumber--;
        System.out.println("After decrementing, the value of myNumber is " + myNumber);
    }
    /**
     * Write a program to check if a number is positive or negative using logical complement operator.
     */
    public void exercise3() {
        int myNum = getValidInt();
        boolean isNotNegative = (myNum >= 0);
        boolean isNegative = !isNotNegative;
        if (isNegative) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is neither negative or zero.");
        }
    }
    /**
     * Write a Java program that uses both the increment (++) and decrement (--) operators
     * in a loop to count up to 10 and then back down to 1.
     */
    public void exercise4() {
        int myNum = 0;
        while (myNum < 10) {
            System.out.println("myNum is equal to " + ++myNum);
        }
        while (myNum > 1) {
            System.out.println("myNum is equal to " + --myNum);
        }
    }
    /**
     * Create a Java program that demonstrates the use of each compound assignment operator with integers.
     */
    public void exercise5() {
        int firstNum = 5;
        int secondNum = 3;
        firstNum += secondNum;
        firstNum -= 4;
        firstNum *= secondNum;
        firstNum /= secondNum;
        firstNum %= 2;
    }
    /**
     * Write a Java program that takes two numbers from the user
     * and uses relational operators to display
     * whether the first number is greater than, less than, or equal to the second number.
     */
    public void exercise6() {
        double[] validInputs = this.getTwoValidDoubles();
        double firstNum = validInputs[0];
        double secondNum = validInputs[1];
        System.out.println("The statement that the first number is greater then the second is " +
                (firstNum > secondNum) + ".");
        System.out.println("The statement that the first number is smaller then the second is " +
                (firstNum < secondNum) + ".");
        System.out.println("The statement that the first number and second numbers are equal is " +
                (firstNum == secondNum) + ".");
    }
    /**
     * Write a program where you perform operations between an integer and a double. Display the result.
     */
    public void exercise7() {
        int myIntegerNumber = 7;
        double myDoubleNumber = 3.13;
        System.out.println("myInteger number is " + myIntegerNumber + " and myDoubleNumber is " + myDoubleNumber);
//        int myAdditionResult = myIntegerNumber + myDoubleNumber; - Expects double, gets int
        System.out.println("Cannot store the result of the addition between myIntegerNumber and myDoubleNumber into" +
                " a variable of type int");
        double myAdditionResult = myIntegerNumber + myDoubleNumber; // Works
        System.out.println("Can store the result result of the addition between myIntegerNumber and myDoubleNumber" +
                " into a variable of type double because Java promotes myIntegerNumber to a double. The result is " +
                myAdditionResult);
        myIntegerNumber += myDoubleNumber; // Implicit cast from 'double' to 'int' in compound assignment
        System.out.println("If I use the compound assignment operator += to add the value of myDoubleNumber to the " +
                "value of myIntegerNumber, Java performs an implicit cast from double to int and myIntegerNumber " +
                "becomes " + myIntegerNumber);
        myIntegerNumber = 7;
        myDoubleNumber += myIntegerNumber; // Works
        System.out.println("If I use the compound assignment operator += to add the value of myIntegerNumber to the " +
                "value of myDoubleNumber, Java promotes myIntegerNumber to a double. The result is " + myDoubleNumber);
        myDoubleNumber = 3.13;
//        int myDivisionResult = myIntegerNumber / myDoubleNumber; - Expects double, gets int
        System.out.println("Cannot store the result of the division between myIntegerNumber and myDoubleNumber into" +
                " a variable of type int");
        double myDivisionResult = myDoubleNumber / myIntegerNumber; // Works
        myDivisionResult = myIntegerNumber / myDoubleNumber; // Works
        System.out.println("Can store the result of the division between myIntegerNumber and myDoubleNumber" +
                " into a variable of type double because Java promotes myIntegerNumber to a double. The result is " +
                myDivisionResult);
        myIntegerNumber /= myDoubleNumber; //Implicit cast from 'double' to 'int' in compound assignment
        System.out.println("If I use the compound assignment operator /= to divide the value of myIntegerNumber " +
                "by the value of myDoubleNumber, Java performs an implicit cast from double to int and " +
                "myIntegerNumber becomes " + myIntegerNumber);
        myIntegerNumber = 7;
        myDoubleNumber /= myIntegerNumber;
        System.out.println("If I use the compound assignment operator /= to divide the value of myDoubleNumber " +
                "by the value of myIntegerNumber, Java performs an implicit cast from double to int and " +
                "myDoubleNumber becomes " + myDoubleNumber);
    }
    /**
     * Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
     */
    public void exercise8() {
        byte myFirstByteNum = 3;
        byte mySecondByteNum = 7;
        byte myResult = (byte) (myFirstByteNum + mySecondByteNum);
        System.out.println(myResult);
        myResult = myFirstByteNum;
        myResult += mySecondByteNum;
        System.out.println(myResult);
    }
    /**
     * Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
     */
    public void exercise9() {
        System.out.println("To calculate the area of a rectangle please input the the width as the first number" +
                " and the height as the second number.");
        double[] validInputs = this.getTwoValidDoubles();
        double width = validInputs[0];
        double height = validInputs[1];
        System.out.println("The area of a rectangle with a width of " + width + " units and a height of " + height +
                " units is equal to " + (height * width) + " square units.");
    }
    /**
     * Write a program that reverses the sign of an entered integer using unary minus operator.
     */
    public void exercise10() {
        int myNum = getValidInt();
        myNum = -myNum;
        System.out.println("The reverse of your number is " + myNum);
    }
    /**
     * Write a Java program that takes two boolean inputs from a user.
     * Apply the logical negation operator (!) to each and print the result.
     */
    public void exercise11() {
        boolean firstBool = !getValidBool();
        boolean secondBool = !getValidBool();
        System.out.println("Your first boolean value was changed from " + !firstBool +
                " to " + firstBool);
        System.out.println("Your second boolean value was changed from " + !secondBool +
                " to " + secondBool);
    }
    /**
     * Create a program that takes an integer as input
     * and then increments and decrements it by 1, displaying the output at each stage.
     */
    public void exercise12() {
        int myInt = getValidInt();
        System.out.println("After incrementing your integer has the value if " + ++myInt);
        System.out.println("After decrementing your integer has the value if " + --myInt);
    }
    /**
     * Write a program to calculate the price after discount.
     * Take the original price and discount percentage as input.
     * Use compound assignment operator to perform the calculation.
     */
    public void exercise13() {
        boolean isInputValid = false;
        double originalPrice = 0;
        double discount = 0;
        while (!isInputValid) {
            System.out.println("Please input the original price of the item.");
            String firstNumString = SCANNER.next();
            try {
                originalPrice = Double.parseDouble(firstNumString);
                isInputValid = true;
            } catch (NumberFormatException | NullPointerException exception) {
                System.out.println(firstNumString + " is not a valid number.");
            }
        }
        isInputValid = false;
        while (!isInputValid) {
            System.out.println("Please input the percentage of the discount.");
            String firstNumString = SCANNER.next();
            try {
                discount = Integer.parseInt(firstNumString);
                isInputValid = true;
            } catch (NumberFormatException | NullPointerException exception) {
                System.out.println(firstNumString + " is not a valid number.");
            }
        }
        discount /= 100;
        double finalPrice = originalPrice;
        finalPrice -= originalPrice * discount;
        System.out.println("The price of the item after discount is " + finalPrice);
    }
    /**
     * Create a program that checks if a user entered number is within a specific range (e.g., 1-100).
     * Use relational operators for the checks.
     */
    public void exercise14() {
        int myInt = getValidInt();
        if (0 <= myInt && myInt <= 100) {
            System.out.println("The number " + myInt + " is in the range from 0 to 100 inclusive.");
        } else {
            System.out.println("The number " + myInt + " is not in the range from 0 to 100 inclusive.");
        }
    }
}
