package io.everyonecodes.java.t5_loops.reflection.exercise2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your word?");
            String word = scanner.nextLine();
            System.out.println("House contains " + countDistinctVowels(word) + " different vowels!");
        }
    }

    public static boolean containsLetter(String word, String letter) {
        return (word.contains(letter));
    }
    public static int countDistinctVowels(String word) {
        List<String> vowels = new ArrayList<>(List.of("a", "e", "i", "o", "u"));
        int vowelCounter = 0;
        for (String vowel : vowels) {
            boolean isInString = containsLetter(word, vowel); //tricky -> word from function is taken compared saved as again boolean and progressed!
            if (isInString) {
                vowelCounter++;
            }
        }
        return vowelCounter;*/
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("What is your word?");
            String word = scanner.nextLine();
            System.out.println(word + " contains " + countDistinctVowels(word) + " different vowels!");
        }
    }

    public static int countDistinctVowels(String word) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        int numberOfDistinctVowels = 0;
        for (Character vowel : vowels) {
            if (containsLetter(word, vowel)) {
                numberOfDistinctVowels++;
            }
        }
        return numberOfDistinctVowels;
    }

    public static boolean containsLetter(String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == letter) {
            }
        }
        return true;
    }
}