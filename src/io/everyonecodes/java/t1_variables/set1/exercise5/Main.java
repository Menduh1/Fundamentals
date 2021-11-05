package io.everyonecodes.java.t1_variables.set1.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter celsius value:");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}

/*
        System.out.println("Enter celsius value: ");
        Scanner scanner = new Scanner(System.in);
        double valueCelsius = scanner.nextDouble();
        double valueFahrenheit = ((valueCelsius * (9.0 / 5.0)) + 32);
        System.out.println("Fahrenheit: " + valueFahrenheit);*/