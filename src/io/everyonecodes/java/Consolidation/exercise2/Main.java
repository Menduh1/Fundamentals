package io.everyonecodes.java.Consolidation.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What should I do with the numbers from 1 to " + number + "?");
        String operation = scanner.nextLine();
        String resultString = "Result: ";
        if (operation.equals("add")) {
            System.out.println(resultString + addAllNumbers(number));
        } else if (operation.equals("multiply")) {
            System.out.println(resultString + calculateFactorial(number));
        } else {
            System.out.println("Unsupported operation.");
        }
    }


    public static int addAllNumbers(int maximum) {
        int start = 0;
        for (int i = 1; i <= maximum; i++) {
            start += i;
        }
        return start;
    }

    public static int calculateFactorial(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            start *= i;
        }
        return start;
    }
}
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("What should I do with the numbers from 1 to " + number + "?");
        scanner.nextLine();
        String addOrMultiply = scanner.nextLine();

        int numberInitial = 1;
        int numberInitial1 = 1;
        int sum = 0;
        int multiply1 = 1;
        // while (true) {
        if (addOrMultiply.equals("add")) {
            while (numberInitial <= number) {
                sum += numberInitial; // 0+1 ; 1+2; 3+3; 6+4; 10+5;15+6; 21+7;28+8;36+9;45+10; 55 (numberInitial==number);
                numberInitial++; // 1,2,3,4,5,6,7... <=number;
            }
            System.out.println("Result : " + sum);
            // if (numberInitial > number) {
            //      break;
            //  }
        } else if (addOrMultiply.equals("multiply")) {
            while (numberInitial1 <= number) {
                multiply1 *= (numberInitial1); // 1*1; 1*2; 2*3; 6*4; 24*5; 120*6; 720*7; 5040*8; 40320*9; 362880*10; 36288ß0
                numberInitial1++; // 1,2,3,4.. numberInitial == number;
            }
            System.out.println("Result : " + multiply1);

        }
   */

//}

       /*System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What should I do with the numbers from 1 to " + number + "?");
        String addOrMultiply = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            numbers.add(i);
        }
        if (addOrMultiply.equals("add")) {
            int addtionResult = 0;
            for (int addNumber : numbers) {
                addtionResult = addtionResult + addNumber;
            }
            System.out.println("Result: " + addtionResult);
        } else if (addOrMultiply.equals("multiply")) {
            int multiplicationResult = 1;
            for (int multiplyNumber : numbers) {
                multiplicationResult = multiplicationResult * multiplyNumber;
            }
            System.out.println("Result: " + multiplicationResult);
        }*/


