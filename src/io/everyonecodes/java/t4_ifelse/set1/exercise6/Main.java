package io.everyonecodes.java.t4_ifelse.set1.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //    Part C
        boolean isAdult = isAdult(); // function call + assignment



        System.out.println("Please, write your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        boolean isValid = isValid(name);

        if (isAdult && isValid) {
            signUp(name); // function call - without return
            displayLoadingSymbol(); // function call - without return
            System.out.println("You’re signed up! Thank you.");
        } else {
            System.out.println("Your age or name do not follow our policies. We apologize for the inconveniences.");
        }
    }
    //    Part A
    public static boolean isAdult() {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        return age >= 18;
    }

    //    Part B
    public static boolean isValid(String name) {
        return name.length() >= 3;
    }

    //    Available Functions Part C
    public static void signUp(String name) {
//        Do nothing but print to command line. Pretending like it's doing what it should. If only life were so easy.
        System.out.println(name + " was added to the database");
    }

    public static void displayLoadingSymbol() {
//        Do nothing but print to command line. Pretending like it's doing what it should. If only life were so easy.
        System.out.println("Loading symbol is being displayed");
    }
}
