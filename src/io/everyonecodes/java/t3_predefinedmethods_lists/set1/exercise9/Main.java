package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Part A
        String message = "PLEASE NO ADVERTISEMENT"; // initial assignment
        message = message.toLowerCase(); // change assignment
        System.out.println(message);// easy way

        List<String> words = new ArrayList<>(List.of("PLEASE", "NO", "ADVERTISEMENT"));
        replaceWordWithLowerCasedWord(words); // changes list words by every function call
        replaceWordWithLowerCasedWord(words); // attention recall three time is needed
        replaceWordWithLowerCasedWord(words);
        System.out.println(words);

        /*//for loop !
        for (int i = 0; i < words.size(); i++) {
            replaceWordWithLowerCasedWord(words);
        }
        System.out.println(words);*/

    }
// refactoring - anderungen des codes ohne des verhalten des codes zu verändern

    public static void replaceWordWithLowerCasedWord(List<String> words) {
        String word = words.get(0); // get first element from list
        word = word.toLowerCase(); // set first element to low
        words.remove(0); // remove
        words.add(word);// add lowered word in list words

       /* String text = words.get(0).toLowerCase();
        words.remove(0);
        words.add(text);*/
    }
}
