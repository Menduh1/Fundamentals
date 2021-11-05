package io.everyonecodes.java.t5_loops.reflection.exercise1;

import java.util.List;
import java.util.Scanner;

import static io.everyonecodes.java.t5_loops.set1.exercise5.Main.greetGuests;

public class Main {
    public static void main(String[] args) {
        List<String> guestsList = getGuestList();
        greetGuests(guestsList); // imported
        preparePiecesOfCake(askGuestsForCake(guestsList));
    }

    public static int askGuestsForCake(List<String> guests) {
        int numberOfCakes = 0;
        for (String guest : guests) {
            System.out.println(guest + ", do you want a piece of cake?");
            Scanner scanner = new Scanner(System.in);
            boolean isWantingCakes = scanner.nextBoolean();
            if (isWantingCakes) {
                numberOfCakes++;
            }
        }
        numberOfCakes = numberOfCakes + 1;
        System.out.println("I’ll be right back with " + numberOfCakes + " pieces of cake!");
        return numberOfCakes;
    }

    public static List<String> getGuestList() {
        return List.of("Matilda", "Mugatu", "Derek", "Samantha");
    }

    public static void preparePiecesOfCake(int numberOfPieces) {
        System.out.println("Hansel is preparing " + numberOfPieces + " pieces of cake.");
    }
}
