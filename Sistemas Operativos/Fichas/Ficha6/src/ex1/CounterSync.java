package ex1;

public class CounterSync {
    long counter = 0;

    public synchronized void add(int value) {
        this.counter += value;
    }

    public long getCounter() {
        return counter;
    }
}
