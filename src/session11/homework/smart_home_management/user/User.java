package session11.homework_fun.smart_home_management.user;

import session11.homework_fun.smart_home_management.home.Scene;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    String name;
    List<Scene> personalScenes;

    protected User(String name) {
        this.name = name;
        this.personalScenes = new ArrayList<>();
    }
}
