package ex3;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Th2 implements Runnable{
    final private int Max = 9;

    private Semaphore sem;

    public Th2(Semaphore sem) {
        this.sem = sem;
    }

    public void run() {
        try {
            Random gerador = new Random();
            int num_aleatorio = gerador.nextInt(Max);

            sem.acquire();
            for (int i = 0; i < num_aleatorio; i++) {
                System.out.println(Thread.currentThread().getName() + " Linha " + i);
            }
            sem.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
