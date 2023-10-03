package net.tiago.so_ficha1;

import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class Ficha1 {

    public static void main(String[] args) {
        System.out.println("Insira o valor 1:");
        Scanner input1 = new Scanner(System.in);
        
        int value1 = input1.nextInt();
        
        System.out.println("Insira o valor 2:");
        
        Scanner input2 = new Scanner(System.in);
        int value2 = input2.nextInt();
        
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
