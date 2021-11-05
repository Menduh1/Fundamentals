package io.everyonecodes.java.Preparation.exercises;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your age ?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Whats your name ?");
        String name = scanner.nextLine();
        System.out.println("Whats your weight ?");
        double weight = scanner.nextDouble();
        System.out.println("Are you a boy?");
        boolean gender = scanner.nextBoolean();
        System.out.println("What is the side ?");
        double side = scanner.nextDouble();
        System.out.println("What is the height ?");
        double height = scanner.nextDouble();*/

        // List<String> names = List.of("john", "anna", "victor", "andy");

        /*  for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i).toUpperCase().charAt(0));
        }*/
       /* String space = "";
        for (String name : names) {
            space += name.toUpperCase().charAt(0);

        }
        System.out.println(space);
        System.out.println("");
        /*for (String name : names) {
            System.out.println(name.toUpperCase().charAt(0) + name.substring(1));
        }*/
        //System.out.println(firstLetterInUpperCase(names));
       /* boolean playerOne = true;
        boolean playerTwo = true;
        boolean rock = true;
        boolean stone = true;
        boolean scissors = true;*/
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Name Player 1 ");
        String namePlayerOne = scanner.nextLine();
        System.out.println("Name of Player 2");
        String namePlayerTwo = scanner.nextLine();*/

      /*  while (true) {
            System.out.println("Enter stop");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }


            if (namePlayerOne.equals("paper") && namePlayerTwo.equals("scissors")) {
                System.out.println("Player 2 wins");
            } else if (namePlayerOne.equals("rock") && namePlayerTwo.equals("paper")) {
                System.out.println("Player 1 wins");
            } else if (namePlayerOne.equals("scissors") && namePlayerOne.equals("rock")) {
                System.out.println("Player 2 wins");
            } else {
                System.out.println("tie");
            }

        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long is the Fibonacci sequence");
        int fibonacci = scanner.nextInt();

        int firstNumber = 0;
        //System.out.println(firstNumber);
        int secondNumber = 1;
        // System.out.println(secondNumber);

        for (int i = 0; i < fibonacci; i++) {
            int newNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = newNumber;
            System.out.println(newNumber);
        }
    }

    public static double calculateCircumferenceSquare(double side) {
        return calculateCircumferenceRectangle(side, side);

    }

    public static double calculateCircumferenceRectangle(double side, double height) {
        return 2 * (height * side);
    }

    public static String firstLetterInUpperCase(List<String> names) {
        String firstElementUpperCase = "";
        for (int i = 0; i < names.size(); i++) {
            String firstElement = names.get(i);
            firstElementUpperCase = firstElement.toUpperCase().substring(0, 1);
            System.out.print(firstElementUpperCase);
        }
        return firstElementUpperCase;
    }
}
