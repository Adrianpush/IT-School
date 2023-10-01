package session10_inheritance_encapsulation.livepractice;

public class Vehicle {

    private String brand;
    private int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }
}

class Car extends Vehicle {

    @Override
    public void accelerate(){
        super.accelerate();
    }
}

class Bike extends Vehicle {

    @Override
    public void accelerate() {
        super.accelerate();
    }
}
