package ex3;

import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Integer.parseInt;

public class ThreadsExThree implements Runnable {

    public static int id = 0;

    public void run() {
        id++;
        Thread.currentThread().setName("[Th" + id + "]");

        int numLines = 10;

        try {
            for (int i = 0; i < numLines; i++) {

                System.out.println(Thread.currentThread().getName() + " Eu sou uma thread!");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        (new Thread(new ThreadsExThree())).start();

        Timer timer = new Timer();

        Thread.currentThread().interrupt();
    }
}
