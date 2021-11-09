package io.everyonecodes.java.t4_ifelse.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        Part A

        List<String> cards = List.of("Screws", "Sparks", "Circuits");

//        Part B
        int numberOfPoints = 13;
        System.out.println("Name a picture.");
        Scanner scanner = new Scanner(System.in);
        String picture = scanner.nextLine();
        if (!cards.contains(picture)) {// contains for lists
            System.out.println("Oops! I don’t have it! That’s " + numberOfPoints + " points. Well played!");
        } else {
            numberOfPoints = numberOfPoints + picture.length();
            if (numberOfPoints >= 20) {
                System.out.println("That’s " + numberOfPoints + " points. Yay! I won!");
            } else {
                System.out.println("That’s " + numberOfPoints + " points. I almost got you there! Well played!");
            }
        }
    }
}