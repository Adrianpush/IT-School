package session11.homework.smart_home_management.device.abstracts;

import session11.homework.smart_home_management.device.interfaces.NightMode;
import session11.homework.smart_home_management.device.interfaces.PowerSavingMode;

import java.time.LocalDate;

abstract class LightingDevice extends GenericDevice implements NightMode, PowerSavingMode {

    public LightingDevice(String deviceName, double energyConsumption, LocalDate nextRevisionDate) {
        super(deviceName, energyConsumption, nextRevisionDate);
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
