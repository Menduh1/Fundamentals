package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

/*
        List<String> words = new ArrayList<>(List.of("PLEASE", "NO", "ADVERTISEMENT"));

        String wordOne = words.get(0).toLowerCase();
        String wordTwo = words.get(1).toLowerCase();
        String wordThree = words.get(2).toLowerCase();
        words.remove(0);
        words.add(0, wordTwo);
        words.remove(1);
        words.add(1, wordThree);
        words.remove(2);
        words.add(2, wordOne);
        System.out.println(wordOne + " " + wordTwo + " " + wordThree);*/

        // Part A
        String message = "PLEASE NO ADVERTISEMENT";
        message = message.toLowerCase();
        System.out.println(message);

        List<String> words = new ArrayList<>(List.of("PLEASE", "NO", "ADVERTISEMENT"));
        replaceWordWithLowerCasedWord(words);
        replaceWordWithLowerCasedWord(words);
        replaceWordWithLowerCasedWord(words);
        System.out.println(words);

        /*//for loop !
        for (int i = 0; i < words.size(); i++) {
            replaceWordWithLowerCasedWord(words);
        }
        System.out.println(words);*/

    }


    public static void replaceWordWithLowerCasedWord(List<String> words) {
        String word = words.get(0);
        word = word.toLowerCase();
        words.remove(0);
        words.add(word);

       /* String text = words.get(0).toLowerCase();
        words.remove(0);
        words.add(text);*/
    }
}
