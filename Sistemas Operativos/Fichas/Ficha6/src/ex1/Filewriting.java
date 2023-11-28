package ex1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {

    public File filename;

    public Filewriting(File filename) {
        this.filename = filename;
    }


    public void write(String s) throws IOException {
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter buff = new BufferedWriter(writer);
            buff.write(s);
            buff.newLine();
        } catch (IOException io) {
            System.out.println("Error writing");
            io.printStackTrace();
        }
    }
}
