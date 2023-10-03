
package net.tiago.so_ficha1.ex3;

import java.io.File;
import java.nio.file.*;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File value_file = new File(args[0]);
        
        Scanner reader = new Scanner(value_file);
        
        int soma = 0;
        int subtracao = 0;
        int multiplicacao = 0;
        int divisao = 0;
        
        while(reader.hasNextLine()) {
            soma += reader.nextInt();
            subtracao -= reader.nextInt();
            multiplicacao *= reader.nextInt();
            divisao /= reader.nextInt();
        }
        
        System.out.println("A soma dos dois valores e:" + soma);
        System.out.println("A subtracao dos dois valores e: " + subtracao);
        System.out.println("A multiplicacao dos dois valores e: " + multiplicacao);
        System.out.println("A divisao dos dois valores e: " + divisao);
    }
    
}
