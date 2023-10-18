package ex2;

import static java.lang.Integer.parseInt;

public class ThreadsExTwo implements Runnable {

    public static int id = 0;

    public void run() {
        id++;
        Thread.currentThread().setName("[Th" + id + "]");
        System.out.println(Thread.currentThread().getName() + " Eu sou uma thread!");
    }

    public static void main(String[] args) {

        int numThreads = parseInt(args[0]);

        for (int i = 0; i < numThreads; i++) {
            (new Thread(new ThreadsExTwo())).start();
        }

    }
}
