package session11_abstraction.homework.smart_home_management.device.abstracts;

import session11_abstraction.homework.smart_home_management.device.interfaces.NightMode;
import session11_abstraction.homework.smart_home_management.device.interfaces.PowerSavingMode;

import java.time.LocalDate;

abstract class AtmosphericDevice extends GenericDevice implements PowerSavingMode, NightMode {

    public AtmosphericDevice(String deviceName, double energyConsumption, LocalDate nextRevisionDate) {
        super(deviceName, energyConsumption, nextRevisionDate);
    }

    @Override
    public void setNightMode() {

    }

    @Override
    public void setPowerSavingMode() {

    }
}
