package io.everyonecodes.java.Consolidation.exercise1;

import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scanner.nextInt();
        System.out.println("Enter second number:");
        int second = scanner.nextInt();
        System.out.println("Enter third number:");
        int third = scanner.nextInt();

        int greatest = first;
        if (second >= first && second >= third) {
            greatest = second;
        } else if (third >= first) {
            greatest = third;
        }
        System.out.println("Greatest: " + greatest);
    }

}

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int numberFirst = scanner.nextInt();
        System.out.println("Enter second number:");
        int numberSecond = scanner.nextInt();
        System.out.println("Enter third number:");
        int numberThird = scanner.nextInt();
        if (numberFirst > numberSecond && numberFirst > numberThird) {
            System.out.println("Greatest: " + numberFirst);
        } else if (numberSecond > numberThird && numberSecond > numberFirst) {
            System.out.println("Greatest: " + numberSecond);
        } else {
            System.out.println("Greatest: " + numberThird);
        }*/