package io.everyonecodes.java.t8_evaluation.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(List.of("as","word","example","","this is a sentence.","another sentence.","Donaudampfschiffahrtskapitän"));
        for (String word : words) {
            List<String> splitInHalfAndCap = (splitInHalfAndCapitalize(word));
            System.out.println(splitInHalfAndCap);
        }

        //System.out.println(splitInHalfAndCap);
    }
    public static List<String> splitInHalfAndCapitalize(String word) {
        List<String> strings = new ArrayList<>();
        if (word.length() > 0) {
            if (word.length() % 2 == 0) {
                String halfFirst = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, (word.length() / 2));
                strings.add(halfFirst);
                String halfSecond = String.valueOf(word.toUpperCase().charAt(word.length() / 2) + word.substring((word.length() / 2)));
                strings.add(halfSecond);
            } else {
                String halfFirst = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, word.length() - (int) (Math.ceil(word.length() / 2)));
                strings.add(halfFirst);
                String halfSecond = String.valueOf(word.toUpperCase().charAt((int) (Math.ceil(word.length() / 2))+1))+ word.substring( (int) (Math.ceil(word.length() / 2)+2));
                strings.add(halfSecond);
            }
        }
        return strings;
    }
}
/*  public static List<String> splitInHalfAndCapitalize(String text) {
        List<String> list = new ArrayList<>();
        if (text.length() > 0) {
            int halfIndex = (int) Math.ceil((double) text.length() / 2);
            String firstHalf = text.substring(0, halfIndex);
            list.add(makeFirstUpperCase(firstHalf));
            String secondHalf = text.substring(halfIndex, text.length());
            list.add(makeFirstUpperCase(secondHalf));
        }
        return list;
    }

    public static String makeFirstUpperCase(String text) {
        char firstChar = text.charAt(0);
        String firstCharAsString = String.valueOf(firstChar);
        return firstCharAsString.toUpperCase() + text.substring(1, text.length());
    }


    public static void main(String[] args) {
        prettyPrintWithInput("as");
        prettyPrintWithInput("word");
        prettyPrintWithInput("example");
        prettyPrintWithInput("");
        prettyPrintWithInput("this is a sentence.");
        prettyPrintWithInput("another sentence.");
        prettyPrintWithInput("Donaudampfschiffahrtskapitän");
    }

    public static void prettyPrintWithInput(String input) {
        System.out.print("\"" + input + "\" -> ");
        prettyPrint(splitInHalfAndCapitalize(input));
    }

    public static void prettyPrint(List<String> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.print("\"" + element + "\"");
            if (i < list.size() -1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }*/