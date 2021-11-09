package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise2;

public class Main {
    public static void main(String[] args) {

        String matrix = makeFirstCapital("the ") + makeFirstCapital("matrix"); // function assignment to variable
        String inception = makeFirstCapital("inception");
        String hotel = makeFirstCapital("the ")
                + makeFirstCapital("grand ")
                + makeFirstCapital("budapest ")
                + makeFirstCapital("hotel");
        System.out.println(matrix);
        System.out.println(inception);
        System.out.println(hotel);

    }

    public static String makeFirstCapital(String word) {
        String firstChar = String.valueOf(word.charAt(0)).toUpperCase(); // Char to String
        String otherChars = word.substring(1, word.length()); // Alternatively, we could omit the second argument
        return firstChar + otherChars;
    }
    }

