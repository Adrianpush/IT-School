package session5.homework;

public class OddOrEven {

    public static void main(String[] args) {
        isEven(5);
        isEven(6);
    }

    public static boolean isEven(int input) {
        boolean isEven = input % 2 == 0;
        String message = isEven ? "The number " + input + " is even." :
                "The number " + input + " is not even.";
        System.out.println(message);
        return isEven;
    }
}