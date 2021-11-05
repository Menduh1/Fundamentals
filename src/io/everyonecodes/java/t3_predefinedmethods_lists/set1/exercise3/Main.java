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
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our store. How much do you have to pay?");
        double totalPriceToPay = scanner.nextDouble();
        System.out.println("How much are you going to pay?");
        double customerWantsToPay = scanner.nextDouble();
        double change = customerWantsToPay - totalPriceToPay;
int euro = (int) change;
double centDouble = (change - euro) * 100;
int cent = (int) centDouble;
       int euro = (int) Math.floor(change);// type casting -> double in int !!!
        int cent = (int) ((change - euro) * 100);
        System.out.println("Here you are, " + euro + " Euro and " + cent + " cents");
        //also possible
        //System.out.println("Here you are," + (int) Math.floor(change) + " Euro and " + ((int) ((change-((int)Math.floor(change)))*100) + " cents"));

    }
}*/
