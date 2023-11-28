package ex3;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Th1 implements Runnable {
    final private int Max = 10;

    private Semaphore sem;

    public Th1(Semaphore sem) {
        this.sem = sem;
    }

    public void run() {
        try {
            Random gerador = new Random();
            int num_aleatorio = gerador.nextInt(Max);

            System.out.println(Thread.currentThread().getName() + " INIT " + num_aleatorio);
            Thread.sleep(num_aleatorio * 1000);
            System.out.println(Thread.currentThread().getName() + " END");
            sem.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
