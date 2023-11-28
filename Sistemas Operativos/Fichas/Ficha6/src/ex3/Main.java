package ex3;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        final Semaphore sem = new Semaphore(0);

        Thread th1 = new Thread(new Th1(sem), "[Th1]");
        Thread th2 = new Thread(new Th2(sem), "[Th2]");

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
