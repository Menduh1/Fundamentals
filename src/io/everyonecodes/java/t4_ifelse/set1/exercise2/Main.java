package io.everyonecodes.java.t4_ifelse.set1.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double priceBigGear = 6.50;
        double priceMcButtons = 7.20;
        double priceVeggie = 5.70;
        double priceFrenchFries = 2.50;
        double order = 0;

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
        System.out.println("Do you want french fries with that?");
        boolean wantsFrenchFries = scanner.nextBoolean();
        if (wantsFrenchFries) {
            order += priceFrenchFries; // order = order (BigGearBurger/McButtons...) + priceFrenchFries !!
        }
        System.out.println("That'll be " + order + " Euro, please");
    }

}


        /*
        double bigGearBurger = 6.50;
        double mcButtonsLongBurger = 7.20;
        double veggieCircuitsBurger = 5.70;
        double frenchFries = 2.50;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Good day! What burger do you want?");
        System.out.println(" We have three different delicious burger types and also french fries: ");
        System.out.println(" Big Gear Burger - 6.50 Euro -Mc Buttons Long Burger - 7.20 Euro - Veggie Circuits Burger - 5.70 Euro - French Fries - 2.50 Euro");
        String burger = scanner.nextLine();

        System.out.println("Do you want french fries with that? yes/no? ");
        String askForFrenchFries = scanner.nextLine();

        if (askForFrenchFries.equals("yes")) {
            if (burger.equals("Big Gear Burger")) {
                double total = bigGearBurger + frenchFries;
                System.out.println("That’ll be " + total + " Euro, please");
            } else if (burger.equals("Mc Buttons Long Burger")) {
                double total = mcButtonsLongBurger + frenchFries;
                System.out.println("That’ll be " + total + " Euro, please");
            } else if (burger.equals("Veggie Circuits Burger")) {
                double total = veggieCircuitsBurger + frenchFries;
                System.out.println("That’ll be " + total + " Euro, please");
            }
        } else {
            if (burger.equals("Big Gear Burger")) {
                System.out.println("That’ll be " + bigGearBurger + " Euro, please");
            } else if (burger.equals("Mc Buttons Long Burger")) {
                System.out.println("That’ll be " + mcButtonsLongBurger + " Euro, please");
            } else if (burger.equals("Veggie Circuits Burger")) {
                System.out.println("That’ll be " + veggieCircuitsBurger + " Euro, please");
            }
        }
    }

}*/

