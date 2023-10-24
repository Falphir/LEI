package ex1;

public class Main {
    public static void main(String[] args) {
        try {
            StackList<String> stack = new StackList<String>(2);

            stack.push("test item 1");
            stack.push("test item 2");
            stack.push("test item 3");

            stack.size();

            stack.pop();
            stack.pop();

            stack.peek();

            stack.isEmpty();

            stack.size();

            stack.pop();

            stack.size();

            stack.pop();

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
