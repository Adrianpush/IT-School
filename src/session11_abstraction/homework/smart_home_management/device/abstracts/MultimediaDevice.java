package session11_abstraction.homework.smart_home_management.device.abstracts;

import session11_abstraction.homework.smart_home_management.device.interfaces.NightMode;
import session11_abstraction.homework.smart_home_management.device.interfaces.PowerSavingMode;

import java.time.LocalDate;

public abstract class MultimediaDevice extends GenericDevice implements PowerSavingMode, NightMode {

    public MultimediaDevice(String deviceName, double energyConsumption, LocalDate nextRevisionDate) {
        super(deviceName, energyConsumption, nextRevisionDate);
    }

    abstract void play();
}
