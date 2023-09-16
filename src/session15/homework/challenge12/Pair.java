package session15.homework.challenge12;

import java.util.Objects;

public class Pair<K, V> {

    private K kValue;
    private V vValue;

    /**
     * Create a class Pair which can hold a pair of objects, the objects can be of any type.
     * @param kValue
     * @param vValue
     */
    public Pair(K kValue, V vValue) {
        this.kValue = kValue;
        this.vValue = vValue;
    }

    public K getkValue() {
        return kValue;
    }

    public V getvValue() {
        return vValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> pair)) return false;
        return Objects.equals(getkValue(), pair.getkValue()) && Objects.equals(getvValue(), pair.getvValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getkValue(), getvValue());
    }
}
