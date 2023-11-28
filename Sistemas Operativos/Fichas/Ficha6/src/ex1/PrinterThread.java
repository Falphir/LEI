package ex1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;

public class PrinterThread extends Thread {
    Semaphore sem;
    protected CounterSync counter = null;
    protected FileWriter writer = null;

    protected BufferedWriter buff = null;

    public PrinterThread(CounterSync counter, File file, Semaphore sem) throws IOException {
        this.counter = counter;
        this.sem = sem;
        this.writer = new FileWriter(file);
        this.buff = new BufferedWriter(writer);
    }

    public void run() {
            try {
                sem.acquire();

                for(int i = 0; i < 200; i++) {
                    counter.add(1);
                    try {
                        buff.write(Thread.currentThread().getName() + " " + counter.getCounter());
                        buff.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " " + counter.getCounter());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sem.release();
        }
}
