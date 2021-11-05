package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise1;

public class Main {
    public static void main(String[] args) {

        // Part A
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Part B
        String number = "0123456789";

        // Part C
        String vw = alphabet.substring(21, 23);
        char eight = number.charAt(8);
        String fourFiveSix = number.substring(4, 7);

        vw = vw.toUpperCase();

        String plateNumber = vw + eight + fourFiveSix;
        System.out.println(plateNumber);
    }
}
        /*
        String englishAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String machineNumbers = "0123456789";
//String plate = englishAlphabet.toUpperCase().substring(21,23) + machineNumbers.toUpperCase().charAt(8)+ machineNumbers.toUpperCase().charAt(4)+ machineNumbers.toUpperCase().charAt(5)+machineNumbers.toUpperCase().charAt(6);
//System.out.println(plate);

        String vw = englishAlphabet.substring(21, 23);
        char eight = machineNumbers.charAt(8);
        String fourFiveSix = machineNumbers.substring(4, 7);

        vw = vw.toUpperCase();
        String plateNumber = vw + eight + fourFiveSix;
        System.out.println(plateNumber);

    }
}*/
