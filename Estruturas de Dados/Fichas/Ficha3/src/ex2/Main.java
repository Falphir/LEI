package ex2;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> lStack = new LinkedStack<String>();

        lStack.push("test item 1");
        lStack.push("test item 2");
        lStack.push("test item 3");

        lStack.printList();
    }
}
