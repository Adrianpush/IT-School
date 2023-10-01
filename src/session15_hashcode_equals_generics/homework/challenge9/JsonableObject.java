package session15_hashcode_equals_generics.homework.challenge9;

public class JsonableObject implements Jsonable {

    private String name;
    private String id;
    private int count;

    public JsonableObject(String name, String id, int count) {
        this.name = name;
        this.id = id;
        this.count = count;
    }

    public static void main(String[] args) {
        JsonableObject one = new JsonableObject("Mark", "1", 2);
        System.out.println(one.getJson());
    }

    @Override
    public String getJson() {
        return toString();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}
