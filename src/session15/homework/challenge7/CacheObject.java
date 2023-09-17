package session15.homework.challenge7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Simulate a cache where objects are stored.
// Objects with the same hashcode should overwrite existing objects in the cache.
// Consider how would you design the hashcode method to facilitate this.

public class CacheObject {

    String id;
    String name;

    public CacheObject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        HashMap<String, CacheObject> cache = new HashMap<>();
        CacheObject cacheObject = new CacheObject("1", "One");
        cache.put(cacheObject.getId(), cacheObject);
        CacheObject cacheObject2 = new CacheObject("1", "two");
        cache.put(cacheObject2.getId(), cacheObject2);
        for (Map.Entry<String, CacheObject> entry : cache.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CacheObject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CacheObject that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
