package session11.homework.smart_home_management;

import session11.homework.smart_home_management.device.devices.AirConditioner;
import session11.homework.smart_home_management.home.PrivateRoom;
import session11.homework.smart_home_management.home.PublicRoom;
import session11.homework.smart_home_management.home.SmartHouse;
import session11.homework.smart_home_management.user.Owner;
import session11.homework.smart_home_management.user.Resident;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        SmartHouse mySmartHouse = new SmartHouse();
        mySmartHouse.addRoom(new PublicRoom("Living Room"));
        mySmartHouse.addRoom(new PrivateRoom("Bedroom"));
        mySmartHouse.addRoom(new PublicRoom("Kitchen"));
        mySmartHouse.addRoom(new PrivateRoom("Bathroom"));
        mySmartHouse.addRoom(new PublicRoom("Guest Bathroom"));

        Owner adrian = new Owner("Adrian");
        mySmartHouse.addUser(adrian);

        Resident cat = new Resident("Zoe");

        AirConditioner airConditioner = new AirConditioner("Living Room Air Conditioner", 20,
                LocalDate.now().plusYears(2));
        adrian.installDevice(mySmartHouse, airConditioner, "Living Room");
    }
}
