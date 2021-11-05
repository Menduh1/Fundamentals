package io.everyonecodes.java.t2_functions.set1.exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the total rent?");
        Scanner scanner = new Scanner(System.in);
        double rent = scanner.nextDouble();
        double payment = splitRent(rent, 4);
        payRent("John", payment);
        payRent("Lisa", payment);
        payRent("Jack", payment);
        payRent("Joe", payment);
    }

    public static double splitRent(double amount, int people) {
        return amount / people;
    }

    public static String getBankAccount(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", what is your bank account's IBAN?");
        return scanner.nextLine();
    }

    public static void payRent(String name, double amount) {
        String bankAccount = getBankAccount(name);
        transferMoney(bankAccount, amount);
        System.out.println("Your payment of " + amount + " Euro is done!");
    }

    public static void transferMoney(String bankAccount, double amount) {
        // Do nothing. We're just pretending to send the money. If only real life were so easy!
        System.out.println("Transfer successful.");
    }
}
 /*  Scanner scanner = new Scanner(System.in);
        System.out.println("What is the total rent?");
        double totalRent = scanner.nextDouble();
        double amount = splitRent(totalRent, 4); // call with variable names and values !!!

        payRent("John", amount); // call "values" and variable names !!!
        payRent("Lisa", amount);
        payRent("Jack", amount);
        payRent("Joe", amount);


    }

    public static double splitRent(double totalRent, int numberOfPeople) {
        return totalRent / numberOfPeople; // double divided integer results in double again -> int/double -> int -> nominator (zähler) dominates
    }

    public static String getBankAccount(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + "," + " what is your bank account´s IBAN: ");
        return scanner.nextLine();
    }

    static public void payRent(String name, double amount) {
        String iban = getBankAccount(name); // function in function is called (parameter orig. 2 -> called 1) and new variable defined simultaneously
        transferMoney(iban, amount); // function in function is called
        System.out.println("Your payment of " + amount + " Euro is done!");
    }

    public static void transferMoney(String iban, double amount) {
        System.out.println("Transfer successful.");
        //Do nothing. We`re just pretending to send the money.
    }*/