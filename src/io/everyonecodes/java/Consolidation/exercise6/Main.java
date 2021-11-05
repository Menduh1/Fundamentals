package io.everyonecodes.java.Consolidation.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter operation:");
            String operation = scanner.nextLine();
            if (operation.equals("stop")) {
                break;
            }
            System.out.println("Enter the left side:");
            double leftSide = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter the right side:");
            double rightSide = scanner.nextDouble();
            scanner.nextLine();
            double result = 0;
            if (operation.equals("add")) {
                result = leftSide + rightSide;
            } else if (operation.equals("multiply")) {
                result = leftSide * rightSide;
            } else if (operation.equals("subtract")) {
                result = leftSide - rightSide;
            } else if (operation.equals("divide")) {
                result = leftSide / rightSide;
            } else {
                System.out.println("Unsupported operation.");
            }
            System.out.println("Result: " + result);
        }
    }
}
/*
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operation: ");
            String operation = scanner.nextLine();
            if (operation.equals("add")) {
                System.out.println("Enter the left side: ");
                double left = scanner.nextInt();
                System.out.println("Enter the right side: ");
                double right = scanner.nextInt();
                double result = left + right;
                System.out.println("Result: " + result);
            } else if (operation.equals("multiply")) {
                System.out.println("Enter the left side: ");
                double left = scanner.nextInt();
                System.out.println("Enter the right side: ");
                double right = scanner.nextInt();
                double result = left * right;
                System.out.println("Result: " + result);
            } else if (operation.equals("subtract")) {
                System.out.println("Enter the left side: ");
                double left = scanner.nextInt();
                System.out.println("Enter the right side: ");
                double right = scanner.nextInt();
                double result = left - right;
                System.out.println("Result: " + result);
            } else if (operation.equals("divide")) {
                System.out.println("Enter the left side: ");
                double left = scanner.nextInt();
                System.out.println("Enter the right side: ");
                double right = scanner.nextInt();
                double result = left / right;
                System.out.println("Result: " + result);
            } else if (operation.equals("stop")) {
                break;
            }
        }
    }
}*/
