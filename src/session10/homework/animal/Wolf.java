package session10.homework.animal;

public class Wolf extends Animal{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Howl");
    }
}
