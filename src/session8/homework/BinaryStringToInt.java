package session8.homework;

public class BinaryStringToInt {

    public static void main(String[] args) {
        String numberString = "101110011";
        try {
            int number = Integer.parseInt(numberString, 2);
            System.out.println(number);

        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
