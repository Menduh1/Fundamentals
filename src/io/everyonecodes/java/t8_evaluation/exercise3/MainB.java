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
            List<Character> pressedKeys = retrieveAllCharacters(allKeys);
//            prettyPrint(pressedKeys);
            System.out.println("Ok, we will go " + calculateDirection(pressedKeys) + ".");
        }
    }

    public static void prettyPrint(List<Character> list) {
        System.out.println(list + " -> \"" + calculateDirection(list) + "\"");
    }

    public static List<Character> retrieveAllCharacters(String text) {
        List<Character> allCharacters = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            allCharacters.add(text.charAt(i));
        }
        return allCharacters;
    }

    public static String calculateDirection(List<Character> pressedKeys) {
        String nowhere = "nowhere";
        boolean containsCharS = pressedKeys.contains('s');
        boolean containsCharW = pressedKeys.contains('w');
        boolean containsCharA = pressedKeys.contains('a');
        boolean containsCharD = pressedKeys.contains('d');
        boolean containsOpposingChars = (containsCharS && containsCharW)
                || (containsCharA && containsCharD);
        if (containsOpposingChars) {
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

        return nowhere;
    }
    }

