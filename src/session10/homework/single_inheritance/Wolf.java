package session10.homework.single_inheritance;

public class Wolf extends Animal{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Howl");
    }
}
