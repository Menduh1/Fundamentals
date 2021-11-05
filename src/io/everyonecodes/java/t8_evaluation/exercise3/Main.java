package io.everyonecodes.java.t8_evaluation.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        String direction = "";
        while (true) {
            System.out.println("Where should we go?");
            direction = scanner.nextLine();
            if (direction.equals("stop")) {
                break;
            }
*/

            // System.out.println("Ok, we will go " + calculateDirection());

            // calculateDirection(retrieveAllCharacters(direction));
            //System.out.println(calculateDirection(retrieveAllCharacters("word")));
            System.out.println(calculateDirection());
        }


    public static List<Character> retrieveAllCharacters(String retrieve) {

        List<Character> vowels = List.of('w', 'a', 's', 'd');

        List<Character> chars = new ArrayList<>();
        // char input = direction.charAt(0);
        chars.add(retrieve.charAt(0));

        return chars;
    }

    public static String calculateDirection(/*List<Character> calculateDir*/) {
        Scanner scanner = new Scanner(System.in);
        List<Character> chars = new ArrayList<>();
        String direction2 = "";
        while (true) {
            System.out.println("Where should we go?");
            String direction = scanner.nextLine();

            char dir = direction.charAt(0);
            if (direction.equals("stop")) {
                break;
            }
            if (direction.equals("w")) {
                direction2 = " up";
                chars.add('w');
            }
        }
        return direction2;
    }
}
        /*
        List<Character> chars = retrieveAllCharacters(scanner.nextLine());
        String direction = "";
        for (Character charOne : chars) {
            if (charOne.equals("w")) {
                direction = "up";

            }
            System.out.println("Ok, we will go " + direction +".");
            /*
        }
        {
            if (direction.equals("w")) {
                chars.add("up");
            }
            if (direction.equals("a")) {
                chars.add("left");
            }
            if (direction.equals("s")) {
                chars.add("down");
            }
            if (direction.equals("w") && direction.equals("d")) {
                chars.add("up-right");
            }
            if (direction.equals("w") && direction.equals("a")) {
                chars.add("up-left");
            }
            if (direction.equals("s") && direction.equals("d")) {
                chars.add("down-right");
            }
            if (direction.equals("s") && direction.equals("a")) {
                chars.add("down-left");
            }
            if (direction.equals("a") && direction.equals("s")) {
                chars.add("down-left");
            }
            if (direction.equals("a") && direction.equals("d")) {
                chars.add("nowhere");
            } else {
                System.out.println(chars);
            }
        }
        String direction = "left";

    }
            return direction;
            }
            }*/
