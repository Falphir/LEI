package ex1;

public class Exer {
    public static synchronized void main(String[] args) {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);
        threadA.start();
        threadA.setName("ThreadA");
        threadB.start();
        threadB.setName("ThreadB");
    }
}
