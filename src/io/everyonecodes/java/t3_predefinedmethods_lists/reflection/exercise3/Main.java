package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise3;

import java.util.ArrayList;
import java.util.List;

import static io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise2.Main.makeFirstCapital;
import static io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise5.Main.makeLastCapital;

public class Main {
    public static void main(String[] args) {
        // Part D
        String reward = formatToBracketsCI("reward"); // function in function
        String cable = formatToBracketsCI("cable");// assignment to variable
        String samantha = formatToBracketsCI("Samantha");
        String spacex = formatToBracketsCI("SpaceX");
        String uppercase = formatToBracketsCI("upperCase");

        // Part E
        List<String> list = List.of(reward, cable, samantha, spacex, uppercase); // add to list
        System.out.println(list);
    }

    // Part C
    public static String formatToBracketsCI(String word) {
        String lowercase = word.toLowerCase(); // lower String
        String firstLetterCapital = makeFirstCapital(lowercase); // assignment and import of function to variable due return is String
        return makeLastCapital(firstLetterCapital); // return String nested methods
    }
}

        /* Loops !!
        for (String word : list) {
            formatToBracketsCI(word);
        }
        System.out.println(list);*/






