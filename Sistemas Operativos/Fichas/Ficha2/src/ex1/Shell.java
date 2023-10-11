package ex1;

import java.io.*;

public class Shell {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Modo de uso: Java Shell <comando>");
            System.exit(0);
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            ProcessBuilder pb = new ProcessBuilder(arg);
            Process process = pb.start();
            System.out.println("Inicio do comando \""+ arg + "\".");
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            try {
                process.waitFor();
                System.out.println("Fim do comando \""+ arg +"\".");
            } catch (InterruptedException e) {

            }
        }
    }
}
