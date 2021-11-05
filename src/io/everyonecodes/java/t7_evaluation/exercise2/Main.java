package io.everyonecodes.java.t7_evaluation.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter some text:");
            String word = scanner.nextLine();
            if (word.equals("stop")) {
                break;
            }

            String reversedText = reverseWord(word);
            System.out.println("Reversed: " + reversedText);
            if (reversedText.toLowerCase().equals(word.toLowerCase())) {
                System.out.println("That`s a palindrome!");
            }
            /*String wordLowerCased = word.toLowerCase();
            String reverseLowerCased = reverseWord(word).toLowerCase();
            System.out.println("Reversed:" + reverseWord(word));
            if (wordLowerCased.equals(reverseLowerCased)) {
                System.out.println("That's a palindrome!");
            }*/
        }
    }

    private static String reverseWord(String word) {
        String output = "";
        int lastIndex = word.length() - 1;
       /* for (int i = 1; i <= word.length(); i++) {
            last += word.valueOf(word.charAt(word.length() - i));
        }*/
        /*  for(int i = lastIndex; i >= 0; i -= 1) {
            output += word.charAt(i);
        }
        */
        /* for (int i = (input.length() -1) ; i <= 0; i--) {
         * output += input.charAt(i) } */
        for (int i = 0; i < word.length(); i++) {
            output += word.charAt(lastIndex - i);
        }
        return output;
    }
}
