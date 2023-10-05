package net.tiago.ex1;

import java.util.Scanner;

public class TwoTypePairDemo {

    public static void main(String[] args) {
        TwoTypePair<Integer, Integer> secretPair = new TwoTypePair(23,45);

        Scanner Keyboard = new Scanner (System.in);

        System.out.println("Enter two numbers:");

        int n1 = Keyboard.nextInt();
        int n2 = Keyboard.nextInt();

        TwoTypePair<Integer, Integer> inputTwoTypePair = new TwoTypePair<Integer, Integer>(n1, n2);

        if (inputTwoTypePair.equals(secretPair)) {
            System.out.println("You guessed the secret numbers");
            System.out.println("in the correct order!");
        } else {
            System.out.println("You guessed incorrectly.");
            System.out.println("You guessed");
            System.out.println(inputTwoTypePair);
            System.out.println("The secret numbers are");
            System.out.println(secretPair);
        }
    }
}