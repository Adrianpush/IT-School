package session10.homework.vehicle.cars;

import java.time.LocalDate;

public class Car {
    String make;
    String model;
    LocalDate year;

    public void start() {
        System.out.println("Car is starting.");
    }

    public void stop() {
        System.out.println("Car is stopping.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
