package session10.homework.vehicle.multi_level_inheritance;

import java.time.LocalDate;

public class Car {

    String manufacturer;
    String model;
    LocalDate productionYear;

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
