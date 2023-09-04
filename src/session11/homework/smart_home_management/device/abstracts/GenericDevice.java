package session11.homework.smart_home_management.device.abstracts;

import java.time.LocalDate;

public abstract class GenericDevice {

    String deviceName;
    double energyConsumption;
    LocalDate nextRevisionDate;

    public GenericDevice(String deviceName, double energyConsumption, LocalDate nextRevisionDate) {
        this.deviceName = deviceName;
        this.energyConsumption = energyConsumption;
        this.nextRevisionDate = nextRevisionDate;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String getDeviceName() {
        return deviceName;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public LocalDate getNextRevisionDate() {
        return nextRevisionDate;
    }
}
