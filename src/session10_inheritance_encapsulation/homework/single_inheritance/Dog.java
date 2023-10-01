package session10_inheritance_encapsulation.homework.single_inheritance;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("bark");
    }
}
