package net.tiago.so_ficha1.ex2;

/**
 *
 * @author tiago
 */
public class ex2 {

    public static void main(String[] args) {
        
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
      
        int soma = value1 + value2;
        int subtracao = value1 - value2;
        int multiplicacao = value1 * value2;
        int divisao = value1 / value2;
        
        System.out.println("A soma dos dois valores e:" + soma);
        System.out.println("A subtracao dos dois valores e: " + subtracao);
        System.out.println("A multiplicacao dos dois valores e: " + multiplicacao);
        System.out.println("A divisao dos dois valores e: " + divisao);
    }
    
}
