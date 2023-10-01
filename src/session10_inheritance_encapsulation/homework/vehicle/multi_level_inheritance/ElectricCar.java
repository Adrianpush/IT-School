package session10_inheritance_encapsulation.homework.vehicle.multi_level_inheritance;

public class ElectricCar extends Car {

    int batteryCapacity;
    double range;

    public void charge() {
        System.out.println("Electric car is recharging it's battery.");
    }
}
