package session12.livepractice.compositionoverinheritance.composition;

public class Car {

    private final Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}
