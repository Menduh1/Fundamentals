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
        /*
        System.out.println("A book per month");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total number of pages : ");
        double totalNumberOfPage = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Number of Days per month : ");
        double numberOfDaysPerMonth = scanner.nextDouble();
        scanner.nextLine();
        double numberOfPagesPerDay = totalNumberOfPage / numberOfDaysPerMonth;
        System.out.println("Number of Pages per Day : " + numberOfPagesPerDay); *//* int value is 8 changed to double value 8.3333*/

      /*  int numberOfPages = 250;
        int numberOfDays = 30;
        double numberOfPagesPerDay = numberOfPages/numberOfDays;
        System.out.println(numberOfPagesPerDay);
// When dividing an integer by a double, the result is again an integer (even if we store it into a double).
// Thus, the result is not correct, since its decimal values are cut off.
// To fix this, we have to use double values

        double numberOfPagesDouble = 250;
        double numberOfDaysDouble = 30;
        double numberOfPagesPerDayDouble = numberOfPagesDouble/numberOfDays;
        System.out.println(numberOfPagesPerDayDouble);

//Alternatively, we can keep using int values, but we have to use a `cast`or ``type cas``
//This is basically telling the compiler "Use this value as a double"

        double numberOfPagesPerDayWithCast = (double) numberOfPages/numberOfDays;
        System.out.println(numberOfPagesPerDayWithCast);*/