package io.everyonecodes.java.t4_ifelse.set1.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (!isWearingAHat() && !isBringingAPet()) {
            System.out.println("Welcome to our cinema, how may I assist you?");
        } else {
            System.out.println("I’m sorry, but you’re not allowed to enter.");
        }
    }
    public static boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        return scanner.nextBoolean();
    }
    public static boolean isBringingAPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you bringing a pet?");
        return scanner.nextBoolean();
    }
}

