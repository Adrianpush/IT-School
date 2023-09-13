package session14.live;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = initializeMap();
        System.out.println(retrieveValue(myMap,"One"));
        updateMap(myMap, "Three", 10);
    }

    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        return myMap;
    }

    private static int retrieveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static void updateMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    private static void removeEntry(Map<String, Integer> map, String key) {
        map.remove(key);
    }
}
