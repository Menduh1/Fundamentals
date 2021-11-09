package io.everyonecodes.java.t4_ifelse.set1.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double priceBigGear = 6.50;
        double priceMcButtons = 7.20;
        double priceVeggie = 5.70;
        double priceFrenchFries = 2.50;
        double order = 0;// used in the whole program

        System.out.println("Good day! What burger do you want?");

        String burger = scanner.nextLine();
        if (burger.equals("Big Gear Burger")) {
            order += priceBigGear;
        }
        if (burger.equals("Mc Buttons Long Burger")) {
            order += priceMcButtons;
        }
        if (burger.equals("Veggie Circuits Burger")) {
            order += priceVeggie;
        }
        System.out.println("Do you want french fries with that?"); // order is taken from the previous scan -:
        boolean wantsFrenchFries = scanner.nextBoolean();
        if (wantsFrenchFries) {
            order += priceFrenchFries; // order = order (BigGearBurger/McButtons...) + priceFrenchFries !!
        }
        System.out.println("That'll be " + order + " Euro, please");
    }

}



