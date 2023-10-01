package session15_hashcode_equals_generics.live.generics;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 24);
        System.out.println(pair.getKey() + " " + pair.getValue());
    }
}
