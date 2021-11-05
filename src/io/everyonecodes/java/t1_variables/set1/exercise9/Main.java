package io.everyonecodes.java.t1_variables.set1.exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How old are you? ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.nextLine();
// We have to call nextLine after calling nexInt, because nextInt does not `consume`nextInt,
// that the user enters after the integer (when pressing the return ke<).
// So the next time `nextLine`is called, it will just take the empty line,
// and the name would be empty, if we left out the previous line of code.
        System.out.println("What`s your name? "); /* Without nextLine this line will be skipped */
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + "! You are " + age + " years old.");
    }
}
