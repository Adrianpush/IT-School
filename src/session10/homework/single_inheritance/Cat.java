package session10.homework.single_inheritance;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
