package io.everyonecodes.java.t5_loops.set1.exercise8;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Part B
        List<String> weekdays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");//#1

//        Part C
        for (String weekday : weekdays) {
            boolean willManShout = containsLetter(weekday, 'n');// #2
            if (willManShout) {
                System.out.println("On " + weekday + ", the man shouts!");
            } else {
                System.out.println("On " + weekday + ", the man doesn't shout.");
            }
        }
        // Print is done in the main function !!!
    }
    //        Part A
    public static boolean containsLetter(String word, char letter) {//#3
        int length = word.length();
        int currentLetterNumber = 0;
        while (currentLetterNumber < length) {
            char currentLetter = word.charAt(currentLetterNumber); // !!!! points to index 0,1,2...
            if (currentLetter == letter) {
                return true; // first return
            }
            currentLetterNumber++;
        }
        return false; // second return
    }
}
/*
    List<String> weekdays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    containsLetter(weekdays);
}

static public void containsLetter(List<String> weekdays) {

        for (int i = 0; i < weekdays.size(); i++) {
        String pickElement = weekdays.get(i);
        if (pickElement.contains("n")) {
        System.out.println("On " + pickElement + ", the man shouts!");
        } else {
        System.out.println("On " + pickElement + ", the man does not shout");
        }
        }
        }*/