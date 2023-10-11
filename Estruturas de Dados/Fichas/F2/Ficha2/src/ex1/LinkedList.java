package ex1;

public class LinkedList<T> {
    private LinearNode<T> head, tail;
    private int count;

    public LinkedList() {
        count = 0;
        head = tail = null;
    }

    public void add(T data) {
        LinearNode<T> newNode = new LinearNode<>(data);

        newNode.setNext(head == null ? tail : head);

        head = newNode;

        count++;
    }

    public void remove(T data) {
        if(head == null) {
            return;
        }

        if(head.data.equals(data)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        LinearNode<T> current = head;
        LinearNode<T> prev = null;
        while (current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }
    }

    public void printList(LinkedList<T> list) {
        LinearNode<T> currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
        System.out.println();
    }


}
