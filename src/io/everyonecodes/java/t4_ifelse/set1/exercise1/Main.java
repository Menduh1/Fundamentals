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
        if (color.equals("blue")) { // compare String mit predefmethod equals
            System.out.println(commentExalted);
        } else {
            System.out.println(commentModerate);
        }

//        Part B
        System.out.println("Would you paint the living room walls in blue sky color?");
        boolean wouldChooseBlueSky = scanner.nextBoolean();
        if (wouldChooseBlueSky) { // true boolean as condition
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
            System.out.println(commentDisappointed); // assigned commits reused several times !!
        }
        if (budget >= limitLower && budget <= limitUpper) {
            System.out.println(commentModerate); // limits set 5000 - 15000
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

