package ex1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws IOException {
        CounterSync counter = new CounterSync();
        Semaphore sem = new Semaphore(1);
        PrinterThread ThreadI[] = new PrinterThread[5];
        File filename = null;
        Filewriting filewriter = null;

        try {
            //filename = new File(args[0]);
            filename = new File("teste.txt");
            if(filename.createNewFile()){
                System.out.println("File Created: " + filename.getName());
            }

            filewriter= new Filewriting(filename);

        } catch (IOException io) {

        }

        for (int i = 0; i < 5; i++) {
            ThreadI[i] = new PrinterThread(counter, filename, sem);
            ThreadI[i].setName("[TH "+ i + "]");
            ThreadI[i].start();
        }

        for (int i = 0; i <5; i++) {
            try {
                ThreadI[i].join();
            } catch (InterruptedException ie) {

            }
        }
    }
}
