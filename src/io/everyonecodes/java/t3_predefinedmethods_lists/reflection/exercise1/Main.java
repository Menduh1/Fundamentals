package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise1;

public class Main {
    public static void main(String[] args) {

        // Part A
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Part B
        String number = "0123456789"; // not int but String !!!

        // Part C
        String vw = alphabet.substring(21, 23);
        char eight = number.charAt(8); // now the access is possible
        String fourFiveSix = number.substring(4, 7);

        vw = vw.toUpperCase();

        String plateNumber = vw + eight + fourFiveSix;
        System.out.println(plateNumber);
    }
}
