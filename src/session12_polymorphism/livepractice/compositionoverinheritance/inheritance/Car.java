package session12_polymorphism.livepractice.compositionoverinheritance.inheritance;

public class Car extends Engine {

    @Override
    void start() {
        System.out.println("Car is moving.");
    }
}
