package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our store. How much do you have to pay?");
        double price = scanner.nextDouble();
        System.out.println("How much are you going to pay?");
        double moneyPaid = scanner.nextDouble();

        double change = moneyPaid - price;
        int euro = (int) Math.floor(change);
        int cent = (int) ((change - euro) * 100);
        System.out.println("Here you are, " + euro + " Euro and " + cent + " cents.");
    }
}
