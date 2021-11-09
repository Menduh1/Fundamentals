package io.everyonecodes.java.t1_variables.set1.exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfPages = 250;
        int numberOfDays = 30;
        double numberOfPagesPerDay = numberOfPages / numberOfDays;
        System.out.println(numberOfPagesPerDay);
        // When dividing an integer by a double, the result is again an integer (even if we store it into a double).
        // Thus, the result is not correct, since its decimal values are cut off.
        // To fix this, we have to use double values:

        double numberOfPagesDouble = 250;
        double numberOfDaysDouble = 30;
        double numberOfPagesPerDayDouble = numberOfPagesDouble / numberOfDaysDouble;
        System.out.println(numberOfPagesPerDayDouble);

        // Alternatively, we can keep using int values, but we have to use a 'cast' or 'type cast'.
        // This is basically telling the compiler "Use this value as a double":

        double numberOfPagesPerDayWithCast = (double) numberOfPages / numberOfDays;
        System.out.println(numberOfPagesPerDayWithCast);

    }
}