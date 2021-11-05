package io.everyonecodes.java.t5_loops.set1.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say a number between 1 and 10");
        int number = scanner.nextInt(); // initializing
        while (number < 1 || number > 10) {
            System.out.println("Say a number between 1 and 10");
            number = scanner.nextInt(); // Called and saved !! till condition is false - actually an infinite loop till condition is false in the body
        }
        System.out.println("Alright! Let’s perform a trick with the number " + number + ".");
    }
}

