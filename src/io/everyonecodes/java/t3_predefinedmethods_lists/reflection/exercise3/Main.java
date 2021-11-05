package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise3;

import java.util.ArrayList;
import java.util.List;

import static io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise2.Main.makeFirstCapital;
import static io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise5.Main.makeLastCapital;

public class Main {
    public static void main(String[] args) {
        // Part D
        String reward = formatToBracketsCI("reward");
        String cable = formatToBracketsCI("cable");
        String samantha = formatToBracketsCI("Samantha");
        String spacex = formatToBracketsCI("SpaceX");
        String uppercase = formatToBracketsCI("upperCase");

        // Part E
        List<String> list = List.of(reward, cable, samantha, spacex, uppercase);
        System.out.println(list);
    }

    // Part C
    public static String formatToBracketsCI(String word) {
        String lowercase = word.toLowerCase();
        String firstLetterCapital = makeFirstCapital(lowercase);
        return makeLastCapital(firstLetterCapital);
    }
}
        /*
        String reward = formatToBracketsCI("reward");
        String cable = formatToBracketsCI("cable");
        String samantha = formatToBracketsCI("Samantha");
        String spaceX = formatToBracketsCI("SpaceX");
        String upperCase = formatToBracketsCI("upperCase");
        List<String> list = new ArrayList<>(List.of(reward, cable, samantha, spaceX, upperCase));
        System.out.println(list);
        /* Loops !!
        for (String word : list) {
            formatToBracketsCI(word);
        }
        System.out.println(list);*/

     /* List<String> originalList = new ArrayList<>(List.of("reward", "cable","Samantha","SpaceX","upperCase"));
     String word1 = formatToBracketsCI("reward");
     String word2...
      List<String> words1 = new ArrayList<>(List.of(word1,word2,word3,word4,word5));
      System.out.println(originalList);
      System.out.println(words1);*/
    /*

    public static String formatToBracketsCI(String word) {
        return makeLastCapital(makeFirstCapital(word.toLowerCase()));

  /*String lowerCased = word.toLowerCase();
        String fistLetterCap = makeFirstCapital(lowerCased);
        String lastLetterCap = makeLastCapital(fistLetterCap);
        return lastLetterCap; *///
/*  public static String makeFirstCapital(String word) {
      return word.toUpperCase().substring(0, 1) + word.substring(1);
  }
  public static String makeLastCapital(String word) {
      int wordLength = word.length();
      String makeLastCapitalUpperCase = word.toUpperCase().substring((wordLength - 1), (wordLength));
      String makeLastCapitalUpperCaseTotal = word.substring(0, wordLength - 1) + makeLastCapitalUpperCase;
      return makeLastCapitalUpperCaseTotal;
  }*/




