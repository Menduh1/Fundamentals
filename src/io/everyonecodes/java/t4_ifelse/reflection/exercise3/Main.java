package io.everyonecodes.java.t4_ifelse.reflection.exercise3;

import java.util.Scanner;

import static io.everyonecodes.java.t4_ifelse.set1.exercise5.Main.isWearingAHat;
import static io.everyonecodes.java.t4_ifelse.set1.exercise6.Main.isAdult;

public class Main {
    public static void main(String[] args) {

        boolean isAdult = isAdult();
        boolean isWearingHat = isWearingAHat();
        boolean isKnowingPassword1 = knowsSecretPassword();
        boolean canEnterClub = isAdult && isWearingHat && isKnowingPassword1;
        if (canEnterClub) {
            System.out.println("You can enter our club.");
        } else {
            System.out.println("I’m sorry, but you cannot enter our club.");
        }
    }
    public static boolean knowsSecretPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the secret password?");
        String password = scanner.nextLine();
        return password.equals("Hokopoko");
    }
}
