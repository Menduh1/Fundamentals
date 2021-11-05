package io.everyonecodes.java.t1_variables.reflection.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter fahrenheit value:");
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("Celsius: " + celsius);
    }
}
  /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value ");
        double fahrenheitValue = scanner.nextDouble();
        double fahrenheitToCelsius = (5 * (fahrenheitValue - 32)) / 9;
        System.out.println("Celsius " + fahrenheitToCelsius);*/