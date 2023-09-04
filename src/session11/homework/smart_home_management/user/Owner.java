package session11.homework_fun.smart_home_management.user;

import session11.homework_fun.smart_home_management.device.abstracts.GenericDevice;
import session11.homework_fun.smart_home_management.home.Room;
import session11.homework_fun.smart_home_management.home.SmartHouse;

public class Owner extends Resident {

    public Owner(String name) {
        super(name);
    }

    public void installDevice(SmartHouse smartHouse, GenericDevice device, String roomName) {
        for (Room room : smartHouse.getRooms()) {
            if (room.getRoomName().equals(roomName)) {
                room.installDevice(device);
            }
        }
    }

    public void uninstallDevice(SmartHouse smartHouse, String deviceName, String roomName) {
        for (Room room : smartHouse.getRooms()) {
            if (room.getRoomName().equals(roomName)) {
                room.uninstallDevice(deviceName);
            }
        }
    }
}
