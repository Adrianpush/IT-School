package session10.homework.animal;

public class TestAnimal {

    public static void main(String[] args) {
        Animal genericAnimal = new Animal("animal");
        genericAnimal.sound();
        Animal dog = new Dog("spike");
        dog.sound();
        Animal cat = new Cat("Felix");
        cat.sound();
        Animal wolf = new Wolf("Scar");
        wolf.sound();
    }
}
