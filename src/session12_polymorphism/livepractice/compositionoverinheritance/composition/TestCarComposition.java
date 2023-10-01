package session12_polymorphism.livepractice.compositionoverinheritance.composition;

public class TestCarComposition {

    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Car car = new Car(carEngine);
        car.start();
    }
}
