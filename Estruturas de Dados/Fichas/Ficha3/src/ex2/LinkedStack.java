package ex2;

public class LinkedStack<T> {

    private LinearNode<T> top;
    public boolean isEmpty() {
        return top == null;
    }

    public int count = 0;

    public void push(T item) {
        top = new LinearNode<T>(item);

        count++;
    }

    public T pop() {
        if(top == null) return null;
        else {
            T item = top.item;

            top = top.next;

            count--;
            return item;
        }
    }

    public T peek() {
        return top.item;
    }

    public int size() {
        return count;
    }

    public void printList() {

        System.out.println("The items of the stack are: ");

        LinearNode<T> temp = top;

        while (temp != null) {
            System.out.println(temp.item + "->");

            temp = temp.next;
        }

        System.out.println("null");
        System.out.println();

    }


}
