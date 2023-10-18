package ex1;

import static java.lang.Integer.parseInt;

public class Threads implements Runnable {

    public void run() {
        System.out.println("Eu sou uma thread!");
    }

    public static void main(String[] args) {

        int numThreads = parseInt(args[0]);

        for (int i = 0; i < numThreads; i++) {
            (new Thread(new Threads())).start();
        }

    }
}
