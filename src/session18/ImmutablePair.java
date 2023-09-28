package session18;

public class ImmutablePair <T extends Cloneable, V extends Cloneable> {

    private T firstItem;
    private V secondItem;

    public ImmutablePair(T firstItem, V secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() throws CloneNotSupportedException {
        return firstItem;
    }

    public V getSecondItem() {
        return secondItem;

    }
}
