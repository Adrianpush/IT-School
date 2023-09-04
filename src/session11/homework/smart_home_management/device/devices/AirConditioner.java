package session11.homework.smart_home_management.device.devices;

import session11.homework.smart_home_management.device.abstracts.GenericDevice;
import session11.homework.smart_home_management.device.interfaces.NightMode;
import session11.homework.smart_home_management.device.interfaces.PowerSavingMode;

import java.time.LocalDate;

public class AirConditioner extends GenericDevice implements NightMode, PowerSavingMode {

    double targetTemperature = 20;

    public AirConditioner(String deviceName, double energyConsumption, LocalDate nextRevisionDate) {
        super(deviceName, energyConsumption, nextRevisionDate);
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void turnOn() {
        System.out.println("Air conditioner turning on.");

    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioner turning off.");
    }

    private void increaseTemperature() {
        System.out.println("Air conditioner is heating the room");
    }

    private void decreaseTemperature() {
        System.out.println("Air conditioner is cooling the room.");
    }

    @Override
    public void setNightMode() {

    }

    @Override
    public void setPowerSavingMode() {

    }


}
