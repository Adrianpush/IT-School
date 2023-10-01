package session18;

public class Pair<T extends Cloneable, V extends Cloneable> {

    private T firstItem;
    private V secondItem;

    public Pair(T firstItem, V secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() {
        return firstItem;
    }

    public V getSecondItem() {
        return secondItem;
    }
}
