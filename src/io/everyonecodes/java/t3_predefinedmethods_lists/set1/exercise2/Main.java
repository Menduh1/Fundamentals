package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise2;

public class Main {
    public static void main(String[] args) {

        String matrix = makeFirstCapital("the ") + makeFirstCapital("matrix");
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
        String firstChar = String.valueOf(word.charAt(0)).toUpperCase();
        String otherChars = word.substring(1, word.length()); // Alternatively, we could omit the second argument
        return firstChar + otherChars;
    }
    }
        /*
        String theMatrix = makeFirstCapital("the ") + makeFirstCapital("matrix");

        String inception = makeFirstCapital("inception");

        String theGrandBudapestHotel = makeFirstCapital("the ") + makeFirstCapital("grand ") + makeFirstCapital("budapest ") + makeFirstCapital("hotel");

        System.out.println(theMatrix + ", " + inception + ", " + theGrandBudapestHotel);
        // also possible without variable assignment !
        //System.out.println(makeFirstCapital("the ") + makeFirstCapital("matrix, ")+makeFirstCapital("inception, ") + makeFirstCapital("the ") + makeFirstCapital("grand ") + makeFirstCapital("budapest ") + makeFirstCapital("hotel"));
    }

    public static String makeFirstCapital(String wordOne) {

        // return wordOne.toUpperCase().substring(0, 1) + wordOne.substring(1);

        String firstChar = String.valueOf(wordOne.charAt(0)).toUpperCase(); // Char in String converting with `valueOf`
        //String otherChar = wordOne.substring(1,wordOne.length()); // Alternatively, we could omit the second argument return firstChar + otherChars;
        String otherChar = wordOne.substring(1);

        return firstChar + otherChar;
    }

}*/

