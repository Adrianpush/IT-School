package session18;

public class ImmutablePair <T extends Cloneable, V extends Cloneable> {

    private T firstItem;
    private V secondItem;

    public ImmutablePair(T firstItem, V secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() throws CloneNotSupportedException {
        Object obj = new Object();
        return (T) obj.clone();
    }

    public V getSecondItem() {
        return secondItem;

    }
}
