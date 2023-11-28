package ex1;

public class CounterThread extends Thread {
    protected Counter counter = null;
    public CounterThread (Counter counter) {
        this.counter = counter;

    }
    public void run() {
        for(int i = 0; i < 10; i++) {
            counter.add(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
