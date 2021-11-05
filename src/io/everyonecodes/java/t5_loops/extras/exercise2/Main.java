package io.everyonecodes.java.t5_loops.extras.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> titles = new ArrayList<>(List.of("Sir", "Lord"));
        List<String> lastNames = new ArrayList<>(List.of("Pupper", "Toby", "Teddy"));
        List<String> firstNames = new ArrayList<>(List.of("Boy", "Jackson", "Champ"));

        for (String title : titles) {
            for (String lastName : lastNames) {
                for (String firstName : firstNames) {
                    String suggestion = generateName(title, lastName, firstName);
                    System.out.println("How about " + suggestion);
                }
            }
        }
    }

    public static String generateName(String title, String lastName, String firstName) {
        return title + " " + firstName + " " + " " + lastName + "?";
    }
}
