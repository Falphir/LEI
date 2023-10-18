package ex3;

import java.io.*;
import java.util.Scanner;

public class Shell {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Modo de uso: Java Shell <nome_ficheiro>");
            System.exit(0);
        }

        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);

        ProcessBuilder pb = new ProcessBuilder(args[0]);
        Process process = pb.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            br.close();
        }

    }
}
