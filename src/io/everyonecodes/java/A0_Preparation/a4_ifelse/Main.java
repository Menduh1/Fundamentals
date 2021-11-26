package io.everyonecodes.java.A0_Preparation.a4_ifelse;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


       /* List<String> names = List.of("Lisa", "John", "Martha"); // iteration * 3
        for (String name : names) {
            if (name.equals("John")) {
                System.out.println("I found you John!"); // second iteration -> found you !
                break;
            }
            System.out.println("Still looking ...");
        }
        System.out.println("We are done!"); // print always*/

        // ----

/*       List<String> names = List.of("Lisa", "John", "Martha"); // iteration * 3
         String result = find(names);
         System.out.println(result);*/

        //----

/*        char firstCharacter0 = firstFirstCharacter2("Hello");
        System.out.println("first char " + firstCharacter0);
        char firsCharacter1 = firstFirstCharacter2("");
        System.out.println("empty char " + firsCharacter1);*/

      /*  Optional<Character> firstCharacter3 = firstFirstCharacter3("Hello");
        System.out.println("first char " + firstCharacter3);
        Optional<Character> firsCharacter4 = firstFirstCharacter3("");
        System.out.println("empty char " + firsCharacter4);*/

        char firstCharacter3 = getFirstCharacter2("Hello");
        char firstCharacter4 = getFirstCharacter2("");
        System.out.println(firstCharacter3);
        System.out.println(firstCharacter4);
    }

    public static char getFirstCharacter2(String text) {
        char first = '0';
        if (text.length() > 0) {
            first = text.charAt(0);
        }
        return first;
    }

    public static String find(List<String> names) {
        for (String name : names) {
            return "I found you!";
        }
        return "I couldn't find you!";
    }

    public static char firstFirstCharacter2(String text) {

        if (text.length() == 0) {
            return '\0';
        }
        return text.charAt(0);
    }

    public static Optional<Character> firstFirstCharacter3(String text) {

        if (text.isBlank()) {
            return Optional.empty();
        }
        return Optional.of(text.charAt(0));

    }

}

