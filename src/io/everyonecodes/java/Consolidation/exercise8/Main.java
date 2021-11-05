package io.everyonecodes.java.Consolidation.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Above Average:");

        List<Double> numbers = new ArrayList<>(List.of(3.0, 4.0, 6.0, 1.0, 9.0));
        int aboveAverage = countAboveAverage(numbers);
        System.out.println(numbers + " -> " + aboveAverage);

        numbers = new ArrayList<>(List.of(3.5));
        aboveAverage = countAboveAverage(numbers);
        System.out.println(numbers + " -> " + aboveAverage);

        numbers = new ArrayList<>(List.of(1.5, 7.0, 9.5, 4.0));
        aboveAverage = countAboveAverage(numbers);
        System.out.println(numbers + " -> " + aboveAverage);
    }
    public static double calculateAverage(List<Double> numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static int countAboveAverage(List<Double> numbers) {
        int count = 0;
        double average = calculateAverage(numbers);
        for (double number : numbers) {
            if (number > average) {
                count++;
            }
        }
        return count;
    }

    }
        /*
        Scanner scanner = new Scanner(System.in);
        List<Double> doubleValues = List.of(1.5, 7.0, 9.5, 4.0);
        /*for (int i = 0; i < 3; i++) {
            System.out.println("Enter a double number : ");
            double valueDouble = scanner.nextDouble();

            doubleValues.add(valueDouble);
            // double val = countAboveAverage(List<Double> doubleValues);
            //System.out.println(val);
        }*/
     /*   System.out.println("Elements greater than average: " + countAboveAverage(doubleValues));
        //System.out.println(countAboveAverage(doubleValues));
    //}

    /*public static int countAboveAverage(List<Double> doubleValues) {
        int greaterThanAverage = 0;
        double elementValue = 0;
        elementValue = elementValue;
        doubleValues.size();
        double sum = 0;
        //System.out.println(doubleValues.size());
        for (int i = 0; i < doubleValues.size(); i++) {
            elementValue = doubleValues.get(i) + elementValue; // addition of values in the list!
            //System.out.println(elementValue);
        }
        for (double value : doubleValues) {
            sum = sum + value; // sum of list values !
            //System.out.println(sum);
        }
        double averageValue = elementValue / doubleValues.size();
        // System.out.println(elementValue);
        // System.out.println(averageValue);
        for (double value : doubleValues) {
            // System.out.println(value);
            if (value > averageValue) {
                greaterThanAverage++;
                // System.out.println("Greater than average: " + greaterThanAverage );
            }
        }
        return greaterThanAverage;
    }
}
*/
