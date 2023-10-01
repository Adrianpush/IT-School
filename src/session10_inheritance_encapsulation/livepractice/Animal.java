package session10_inheritance_encapsulation.livepractice;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("This animal is eating.");
    }
}

class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The mammal is eating plants or other animals");
    }
}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The bird eats seeds and insects.");
    }
}

class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The fish eats plankton.");
    }
}
