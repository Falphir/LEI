package net.tiago.so_ficha1.ex4;



import java.io.*;
import java.util.*;
import java.nio.charset.*;
import java.nio.file.*;


public class ex4 {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length == 0) {
            System.out.println(
                    "Argumento nao incluido" + "\n" + "Devera inserir o nome do ficheiro onde pretende imprimir" + "\n"
                            + "Por exemplo: java (ex4.java) (Nome do ficheiro)");

            System.exit(0);
        }

        try {
            Charset ENCODING = StandardCharsets.UTF_8;
            Path path = Paths.get(args[0]);
            List<String> linhas = Files.readAllLines(path, ENCODING);

            for (int i = 0; i < linhas.size(); i++) {
                System.err.println("Linha n." +i+ ": " + linhas.get(i));
            }

        } catch (IOException ex) {
            System.out.println("ERRO: O Ficheiro " + args[0] + " nao existe!!!");
        }
    }
}
