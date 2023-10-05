package net.tiago.ex2;

import java.util.Scanner;

public class PairDemo {

    public static void main(String[] args) {
        Pair<Integer> secretPair = new Pair<Integer>(45,21);

        Scanner Keyboard = new Scanner (System.in);

        System.out.println("Enter two numbers:");

        int n1 = Keyboard.nextInt();
        int n2 = Keyboard.nextInt();

        Pair<Integer> inputPair = new Pair<Integer>(n1, n2);

        System.out.println(inputPair.max());
        System.out.println("Values: " + "\n" + inputPair);

    }
}