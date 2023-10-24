package ex1;

public class EmptyStackException extends Exception {
    public EmptyStackException(String message) {
        System.err.println(message);
    }
}
