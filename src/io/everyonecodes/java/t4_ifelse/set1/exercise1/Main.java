package io.everyonecodes.java.t4_ifelse.set1.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //        Part A
        Scanner scanner = new Scanner(System.in);
        String commentModerate = "That’s quite interesting.";
        String commentExalted = "I think just the same!";

        System.out.println("What is your favourite color?");
        String color = scanner.nextLine();
        if (color.equals("blue")) {
            System.out.println(commentExalted);
        } else {
            System.out.println(commentModerate);
        }

//        Part B
        System.out.println("Would you paint the living room walls in blue sky color?");
        boolean wouldChooseBlueSky = scanner.nextBoolean();
        if (wouldChooseBlueSky) {
            System.out.println(commentExalted);
        } else {
            System.out.println(commentModerate);
        }

        //        Part C
        String commentDisappointed = "Oh, I didn’t expect something like that...";
        int limitLower = 5000;
        int limitUpper = 15000;

        System.out.println("How much would you spend to decorate a studio?");
        int budget = scanner.nextInt();
        if (budget < limitLower) {
            System.out.println(commentDisappointed);
        }
        if (budget >= limitLower && budget <= limitUpper) {
            System.out.println(commentModerate);
        }
        if (budget > limitUpper) {
            System.out.println(commentExalted);
        }
        //        Part D
        int limitForBudget = 12000;
        int limitForDays = 7;

        System.out.println("How many days would it take you to decorate the studio?");
        int numberOfDays = scanner.nextInt();
        if (numberOfDays < limitForDays && budget > limitForBudget) {
            System.out.println(commentExalted);
        } else {
            System.out.println(commentModerate);
        }
    }
}
    /*
    public static String isFavoriteColor() {
        // -- Part A
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your favorite colour is blue?");
        Boolean bleuTrue = scanner.nextBoolean();
        //String favoriteColor = scanner.nextLine();
        String blueTrue = " I think just the same !";
        if (bleuTrue) {
            return blueTrue;
            //System.out.println("I think just the same!");
        } if(!blueTrue){
            //System.out.println("That’s quite interesting.");
            return "That's quite interesting.";
        }
       // return "its interesting";
    }*/
/*
    public static void main(String[] args) {

        // System.out.println( isFavoriteColor());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your favorite colour is blue?");
        String favoriteColor = scanner.nextLine();

        if (favoriteColor.equals("blue")) {
            System.out.println("I think just the same!");
        } else {
            System.out.println("That’s quite interesting.");
        }
//--Part B

        System.out.println("Would you choose to paint the living room walls in blue sky color - yes/no?");
        String roomColor = scanner.nextLine();
        if (roomColor.equals("yes")) {

            System.out.println("I think just the same!");
        } else {
            System.out.println("That’s quite interesting.");
        }

// -- Part C
        System.out.println("How big of a budget would you spend to decorate a studio ?");
        int spent = scanner.nextInt();

        if (spent > 15000) {

            System.out.println("I think just the same!");
        } else if (spent < 5000) {
            System.out.println("Oh, I didn’t expect something like that...");
        } else {
            System.out.println("That’s quite interesting.");

        }
// -- Part D
        System.out.println("How many days would you need to decorate that studio?");
        int day = scanner.nextInt();
        if (day < 7) {
            System.out.println("I think just the same!");
        } else {
            System.out.println("That’s quite interesting.");
        }

    }

}*/

