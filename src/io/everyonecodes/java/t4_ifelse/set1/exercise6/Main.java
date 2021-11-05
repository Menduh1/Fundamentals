package io.everyonecodes.java.t4_ifelse.set1.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //    Part C
        boolean isAdult = isAdult();

        System.out.println("Please, write your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (isAdult && isValid(name)) {
            signUp(name);
            displayLoadingSymbol();
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


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write your name:");
        String name = scanner.nextLine();
        boolean isAdult = isAdult();
        boolean isValid = isValid(name);
        if (isAdult && isValid) {
            signUp(name);
            displayLoadingSymbol();
            System.out.println("You’re signed up! Thank you");
        } else {
            System.out.println("Your age or name do not follow our policies. We apologize for the inconveniences.");
        }
    }

    public static boolean isAdult() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        // boolean isAge = age >= 18;
        return age >= 18;
        //return age >=18;
    }

    public static boolean isValid(String name) {
        //int length = name.length();
        //boolean isLength = length > 2;
        return name.length() > 2;
    }

    public static void displayLoadingSymbol() {
        System.out.println("Loading symbol is being displayed");
    }

    public static void signUp(String name) {
        System.out.println(name + " was added to the database");
    }
}*/
