package session11.homework.smart_home_management.home;

import session11.homework.smart_home_management.user.User;

import java.util.ArrayList;
import java.util.List;

public class SmartHouse {

    List<User> users;
    List<Room> rooms;

    public SmartHouse() {
        this.users = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
