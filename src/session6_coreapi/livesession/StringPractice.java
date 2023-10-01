package session6_coreapi.livesession;

public class StringPractice {

    public static void main(String[] args) {
        String animal1 = "lion";
        String animal2 = new String(animal1);
        String animal3 = "lion";

        System.out.println(animal1 == animal2);
        System.out.println(animal1 == animal3);

        System.out.println("animal1 hashcode " + Integer.toHexString(System.identityHashCode(animal1)));
        System.out.println("animal2 hashcode " +  Integer.toHexString(System.identityHashCode(animal2)));
        System.out.println("animal3 hashcode " +  Integer.toHexString(System.identityHashCode(animal3)));


//        garbageCollectorExample();
        stringConcat();

        System.out.println(getStringCharAt(animal1, 0));
    }

    public static void garbageCollectorExample(){
        String name = "Andrei";
        System.out.println(name);
        name = "Ion";
        System.out.println(name);

        User user = new User();
        user.setName("Gogu");
        user.setAge(20);
    }

    public static void stringConcat() {
        String value1 = "Adrian";
        String value2 = "Puscuta";
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));
        value1 = value1.concat(value2);
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));
    }

    public static int getStringLength(String input){
        return input.length();
    }

    public static char getStringCharAt(String input, int index){
        return input.charAt(index);
    }
}
