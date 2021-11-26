package io.everyonecodes.java.t8_evaluation.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MainB {
    public static List<String> splitInHalfAndCapitalize(String text) {
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
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }
}
