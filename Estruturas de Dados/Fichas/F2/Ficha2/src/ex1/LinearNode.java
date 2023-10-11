package ex1;

public class LinearNode<T> {

    T data;
    LinearNode<T> next;

    public LinearNode(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(LinearNode<T> nextNode) {
        this.next = nextNode;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public LinearNode(LinearNode<T> next) {
        this.next = next;
    }

}
