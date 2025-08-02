
public class StringContainer<T> implements Container<T> {
    private T items;

    public void add(T item) {
        this.items = item;
    }

    public T get(int index) {
        if (index == 0) {
            return items;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds for StringContainer");
        }
    }
} 