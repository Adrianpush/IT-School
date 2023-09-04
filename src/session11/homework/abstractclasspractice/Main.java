package session11.homework_fun.abstractclasspractice;

public class Main {

    public static void main(String[] args) {
        SubClass subClass = new SubClass(); // Calls super's constructor
        subClass.a_method(); // Calls SubClass's implementation of abstract method in AbstractParent
        subClass.print(); // Calls the non-abstract method in AbstractParent(super).
    }
}