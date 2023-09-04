package session11.homework.smart_home_management.device.devices;

import session11.homework.smart_home_management.device.abstracts.SecurityDevice;

import java.time.LocalDate;

public class Door extends SecurityDevice {

    boolean isClosed;
    boolean isLocked;

    public Door(String deviceName, double energyConsumption, LocalDate nextRevisionDate) {
        super(deviceName, energyConsumption, nextRevisionDate);
    }


    @Override
    public void setAlertMode() {
        System.out.println("Door closing.");
        isClosed = true;
        System.out.println("Door locked.");
        isLocked = true;
    }


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
