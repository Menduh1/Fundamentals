package io.everyonecodes.java.t1_variables.reflection.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your first name?");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("What`s your second name?");
        String secondName = scanner.nextLine();
        System.out.println("Welcome, " + firstName + " " + secondName + "!");
    }
}
