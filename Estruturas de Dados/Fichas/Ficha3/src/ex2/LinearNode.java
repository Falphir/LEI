package ex2;

public class LinearNode<T> {

    public LinearNode<T> next;

    public T item;

    public LinearNode() {
        this.next = null;
        this.item = null;
    }

    public LinearNode(T item) {
        next = null;
        item = item;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> next) {
        this.next = next;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
