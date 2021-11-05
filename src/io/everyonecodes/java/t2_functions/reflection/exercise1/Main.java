package io.everyonecodes.java.t2_functions.reflection.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the side length of your square?");
        double squareLength = scanner.nextDouble();
        System.out.println("Your square has an area of: " + calculateSquareArea(squareLength));
        System.out.println("What's the width of your rectangle?");
        double rectWidth = scanner.nextDouble();
        System.out.println("What's the height of your rectangle?");
        double rectHeight = scanner.nextDouble();
        System.out.println("Your rectangle has an area of: " + calculateRectangleArea(rectWidth, rectHeight));

    } public static double calculateSquareArea(double length) {
        return length * length;
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
}

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the side length of your square?");
        double sideLength = scanner.nextDouble();
        System.out.println("Your square has an area of: " + squareArea(sideLength));
        System.out.println("What's the width of your rectangle?");
        double width = scanner.nextDouble();
        System.out.println("What's the height of your rectangle?");
        double height = scanner.nextDouble();
        System.out.println("Your rectangle has an area of: " + rectangleArea(width, height));
    }

    public static double squareArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }*/