package io.everyonecodes.java.Consolidation.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> allInputs = new ArrayList<>();

        while (true) {
            System.out.println("Enter a number or type stop:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int inputAsInt = Integer.parseInt(input);
            allInputs.add(inputAsInt);
        }

        if (allInputs.size() > 0) {
            int greatestNumber = findGreatestNumber(allInputs);
            System.out.println("Greatest: " + greatestNumber);
        } else {
            System.out.println("No number was entered.");
        }
    }

    public static int findGreatestNumber(List<Integer> numbers) {
        int greatestNumber = numbers.get(0);
        for (int number : numbers) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }
        return greatestNumber;
    }
}

        /*String userInput = "";
        List<Integer> numbers = new ArrayList<>();
        while (!userInput.equals("stop")) {
            System.out.println("Enter a number or type stop:");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
            if (!userInput.equals("stop")) {
                Integer number=Integer.valueOf(userInput);
                numbers.add(number);
            }
        }
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers.get(0));



        System.out.println(askForNumber());*/


        /*Scanner scanner = new Scanner(System.in);
        int newNumber = 0;
        newNumber = newNumber;
        boolean stop = false;
        String result = "Greatest :";
        while (!stop) {

            System.out.println("Enter a number or type stop: ");
            int number = scanner.nextInt();
            String stop = String.valueOf(number);

            if (number > newNumber) {
                newNumber = number;
            }
            System.out.println(newNumber);
            if (stop.equals("stop")) {
                System.out.println(newNumber);
                //trueFalse = false;
            }

        }
        System.out.println("Greatest number: " + newNumber);*/