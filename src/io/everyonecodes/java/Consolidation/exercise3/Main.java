package io.everyonecodes.java.Consolidation.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Max: ");
        int max = scanner.nextInt();
        if (max < 1) {
            max = 1;
        } else if (max > 9) {
            max = 9;
        }

        // Alternatively to the if/else statement, we could've done:
//        max = Math.max(1, max);
//        max = Math.min(9, max);

        for (int row = 1; row <= max; row++) {

            for (int space = 0; space < max - row; space++) {
                System.out.print(" ");
            }

            for (int digit = 1; digit <= row; digit++) {
                System.out.print(digit);
            }
            System.out.println(); // Print an empty line
        }
    }

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maximum width of the triangle : ");
        int width = scanner.nextInt();
        if (width > 9) {
            width = 9;
        } else if (width < 1) {
            width = 1;
        }

        for (int i = 0; i <= width; i++) {
            int numberOfSpaces = width - i;
            String output = "";
            for (int j = 0; j < numberOfSpaces; j++) {
                output += "*";
                // equivalent to output = output + "*";
                // "" + * -> *; * + * -> ** + * -> *** + * -> **** + * -> *****;
            }
            for (int k = 1; k <= i; k++) {
                output += k;
                // equivalent to output = output + k -> "" + 1 -> *1 ; * + 2 ->*2 ; * + 3 -> *3 -> *4; *5
            }
            System.out.println(output);
        }
/*
        for (int i = 0; i <= width; i++) {
            int numberOfSpaces = width - i;
            String output = "";
            for (int j = 0; j < numberOfSpaces; j++) {
                output += "*"; // equivalent to output = output + "*";
            }
            System.out.println(output);
        }
            for (int i = 1; i <= width; i++) {
               // int numberOfSpaces = width - i;
                //  System.out.println(i);
                String output = "";
                for (int j = 1; j <= i; j++) { // zahlen loop
                    output += "*";
                    // System.out.println(output);
                }
                System.out.println(output);
            }*/

       /* //System.out.println(width);
        for (int i = 1; i <= width; i++) {
            int numberOfSpaces = width - i;
            //  System.out.println(i);
            String output = "";
            for (int j = 0; j < numberOfSpaces; j++) {
                output += " "; //"*"
                // System.out.println(output);
            }
            for (int j = 1; j <= i; j++) { // zahlen loop
                output += j;
                // System.out.println(output);
            }
            System.out.println(output);
        }*/

//        width = Math.min(9, width);
//        width = Math.max(1, width);
        // for loop



}