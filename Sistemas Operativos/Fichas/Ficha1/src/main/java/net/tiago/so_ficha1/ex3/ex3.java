
package net.tiago.so_ficha1.ex3;

import java.io.File;
import java.io.FileNotFoundException;
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

        try{
            File f = new File(args[0]);
            Scanner scanner = new Scanner(f);
            float soma = 0, subtracao = 0, multiplicacao = 1, divisao = 1;

            if (scanner.hasNext()) {
                int val1 = scanner.nextInt();
                soma = val1;
                subtracao = val1;
                multiplicacao = val1;
                divisao = val1;
            }
            while (scanner.hasNext()){
                    int val = scanner.nextInt();
                    soma += val;
                    subtracao -= val;
                    multiplicacao *= val;
                    divisao /= val;
            }
            System.out.println("Soma: " + soma + "\n" + "Subtracao: " + subtracao + "\n" + "Multiplicacao: " + multiplicacao + "\n" + "Divisao: " + divisao);

        }catch(Exception err){
            err.printStackTrace();
        }
        
    }
    
}
