package io.everyonecodes.java.t5_loops.set1.exercise9;

import java.util.Scanner;

import static io.everyonecodes.java.t4_ifelse.set1.exercise5.Main.isBringingAPet;
import static io.everyonecodes.java.t4_ifelse.set1.exercise5.Main.isWearingAHat;

public class Main {
    public static void main(String[] args) {
        int derekPoints = 0;
        int matildaPoints = 0;
        int hanselPoints = 0;

        int people = 0;
        while (people < 100) {//#1
            if (isListeningToMusic()) {
                derekPoints++;
            }
            if (isBringingAPet()) {
                matildaPoints++;
            }
            if (isWearingAHat()) {
                hanselPoints++;
            }
            people++;
        }
        System.out.println("Matilda got " + matildaPoints + "points");//#2
        System.out.println("Hansel got " + hanselPoints + "points");
        System.out.println("Derek got " + derekPoints + "points");

        if (derekPoints > matildaPoints && derekPoints > hanselPoints) {//#3
            System.out.println("Derek wins.");
        } else if (matildaPoints > derekPoints && matildaPoints > hanselPoints) {
            System.out.println("Matilda wins.");
        } else if (hanselPoints > derekPoints && hanselPoints > matildaPoints) {
            System.out.println("Hansel wins.");
        }

    }

    public static boolean isListeningToMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you listening to music?");
        return scanner.nextBoolean();
    }
}

        /*int pointHanselHat = 0;
        int pointMatildaPet = 0;
        int pointDerekMusic = 0;

        // very simple solution !!

        for (int i = 0; i < 3; i++) {
            if (isWearingAHat()) {
                pointHanselHat++;
            }
            if (isBringingAPet()) {
                pointMatildaPet++;
            }
            if (isListeningToMusic()) {
                pointDerekMusic++;
            }
        }
        System.out.println("Hansel got " + pointHanselHat + " points.");
        System.out.println("Matilda got " + pointMatildaPet + " points.");
        System.out.println("Derek got " + pointDerekMusic + " points.");

        if (pointMatildaPet > pointHanselHat && pointMatildaPet > pointDerekMusic) {
            System.out.println("Matilda wins"); // Matilda is prioritized
        } else if (pointHanselHat > pointMatildaPet && pointHanselHat > pointDerekMusic) {
            System.out.println("Hansel wins"); // Hansel is prioritized
        } else {
            System.out.println("Derek wins");
        }
    */
