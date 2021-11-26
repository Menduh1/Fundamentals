package io.everyonecodes.java.t8_evaluation.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Where should we go?");
            String allKeys = scanner.nextLine();
            if (allKeys.equals("stop")) {
                break;
            }
            List<Character> pressedKeys = retrieveAllCharacters(allKeys); // clone (projection) of the methods to main
            // 1.function (retrv) String -> List -> 2. function (calculate) List -> String
            // retrieve all chars in the list
            String direction = calculateDirection(pressedKeys);
            prettyPrint(pressedKeys);
            System.out.println(direction);
            System.out.println("Ok, we will go " + calculateDirection(pressedKeys) + ".");
        }
    }

    public static void prettyPrint(List<Character> list) {
        System.out.println(list + " -> \"" + calculateDirection(list) + "\""); // (\") backslash -> " "
    }

    public static List<Character> retrieveAllCharacters(String text) {
        List<Character> allCharacters = new ArrayList<>();// attention list of CHARS
        for (int i = 0; i < text.length(); i++) {
            allCharacters.add(text.charAt(i)); // in case of multiple chars iteration follows lengths (done by length)
        }
        return allCharacters;
    }

    public static String calculateDirection(List<Character> pressedKeys) {
        String nowhere = "nowhere";
        boolean containsCharS = pressedKeys.contains('s'); // prevent of condition check in the if statement
        boolean containsCharW = pressedKeys.contains('w'); // Lists allows contains method to check otherwise simple way would be okay too.
        boolean containsCharA = pressedKeys.contains('a');
        boolean containsCharD = pressedKeys.contains('d');
        boolean containsOpposingChars = (containsCharS && containsCharW) // down -s up -w opposing
                || (containsCharA && containsCharD); // left -a right -d opposing
        if (containsOpposingChars) { // in this case go nowhere
            return nowhere;
        } else if (containsCharA && containsCharW) {
            return "up-left";
        } else if (containsCharA && containsCharS) {
            return "down-left";
        } else if (containsCharD && containsCharW) {
            return "up-right";
        } else if (containsCharD && containsCharS) {
            return "down-right";
        } else if (containsCharW) {
            return "up";
        } else if (containsCharA) {
            return "left";
        } else if (containsCharS) {
            return "down";
        } else if (containsCharD) {
            return "right";
        }
        return nowhere; // in all other cases move nowhere
    }
}

