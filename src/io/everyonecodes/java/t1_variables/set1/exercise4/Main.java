package io.everyonecodes.java.t1_variables.set1.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Part A
        System.out.println("Tell me your first number");
        int first = scanner.nextInt();
        System.out.println("Tell me your second number");
        int second = scanner.nextInt();
        int sum = first + second;
        System.out.println("The sum is " + sum);

        // Part B
        System.out.println("Tell me your first number");
        double firstDouble = scanner.nextDouble();
        System.out.println("Tell me your second number");
        double secondDouble = scanner.nextDouble();
        System.out.println("Tell me your third number");
        double thirdDouble = scanner.nextDouble();
        double multiplication = firstDouble * secondDouble * thirdDouble;
        System.out.println("The result of the multiplication is " + multiplication);
    }
}
  /*
        System.out.println("Part A");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("Tell me your second number ");
        int secondNumber = scanner.nextInt();
        int sumNumbers = firstNumber + secondNumber;
        System.out.println("The sum is " + sumNumbers);

        System.out.println("Part B ");

        System.out.println("Tell me your first number");
        int firstNumber1 = scanner.nextInt();
        System.out.println("Tell me your second number");
        int secondNumber2 = scanner.nextInt();
        System.out.println("Tell me your third number");
        int thirdNumber3 = scanner.nextInt();
        int multiplicationNumbers123 = firstNumber1 * secondNumber2 * thirdNumber3;
        System.out.println("The result of the multiplication is " + multiplicationNumbers123);
*/