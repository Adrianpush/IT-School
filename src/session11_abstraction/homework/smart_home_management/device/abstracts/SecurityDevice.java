package session11_abstraction.homework.smart_home_management.device.abstracts;

import session11_abstraction.homework.smart_home_management.device.interfaces.AlertMode;

import java.time.LocalDate;

public abstract class SecurityDevice extends GenericDevice implements AlertMode {
    public SecurityDevice(String deviceName, double energyConsumption, LocalDate nextRevisionDate) {
        super(deviceName, energyConsumption, nextRevisionDate);
    }

    public abstract void setAlertMode();
}
