package session10.homework.vehicle.cars;

public class Tesla extends ElectricCar {

    String autopilotVersion;
    boolean autopilotOn = false;

    public void enableAutopilot() {
        autopilotOn = true;
    }

    public void disableAutopilot() {
        autopilotOn = false;
    }
}
