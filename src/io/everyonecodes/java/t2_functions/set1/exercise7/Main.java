package io.everyonecodes.java.t2_functions.set1.exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the total rent?");
        Scanner scanner = new Scanner(System.in);
        double rent = scanner.nextDouble();
        double payment = splitRent(rent, 4);// function call - parameters as variable and value - assignment to variable
        payRent("John", payment); // function in a function  call
        payRent("Lisa", payment); // in main function - other functions are called
        payRent("Jack", payment); // in payRent function is splitRent function
        payRent("Joe", payment); // main function - payRent function - splitRent function
        // in fact here we see String
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
        String bankAccount = getBankAccount(name); // return - String - in fact here we see String
        transferMoney(bankAccount, amount);
        System.out.println("Your payment of " + amount + " Euro is done!");
    }

    public static void transferMoney(String bankAccount, double amount) {
        // Do nothing. We're just pretending to send the money. If only real life were so easy!
        System.out.println("Transfer successful.");
    }
}
