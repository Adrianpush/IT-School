package session10_inheritance_encapsulation.homework.single_inheritance;

public class Wolf extends Animal{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Howl");
    }
}
