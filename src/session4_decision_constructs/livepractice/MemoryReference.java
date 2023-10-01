package session4_decision_constructs.livepractice;

public class MemoryReference {

    public static void main(String[] args) {
        String greetingOne = "Hello there";
        String greetingTwo = "General Kenobi";
        String greetingThree = "General Kenobi";
        greetingThree.toString();
        greetingThree = "Hello There";
//        System.out.println(greetingThree == greetingTwo);
//        System.out.println(greetingThree.equals(greetingTwo));
//        System.out.println(greetingThree);
//        System.out.println(greetingTwo);

        User user1 = new User();
        user1.getAge();
        User user2 = new User();
//        System.out.println(user1 == user2);
//        System.out.println(user1.equals(user2));

        int number1 = 5;
        double number2 = 5.00;
    }
}
