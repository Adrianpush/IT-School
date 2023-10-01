package session11_abstraction.homework.smart_home_management.home;

import session11_abstraction.homework.smart_home_management.device.abstracts.GenericDevice;

import java.util.ArrayList;
import java.util.List;

public abstract class Room {

    String roomName;
    List<GenericDevice> devices;

    public Room(String roomName) {
        this.roomName = roomName;
        this.devices = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }


    public List<GenericDevice> getDevices() {
        return devices;
    }

    public void installDevice(GenericDevice device) {
        devices.add(device);
    }

    public void uninstallDevice(String deviceName) {
        for (GenericDevice device : devices) {
            if (device.getDeviceName().equals(deviceName)) {
                devices.remove(device);
            }
        }
    }
}
