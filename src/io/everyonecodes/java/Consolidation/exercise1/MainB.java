package io.everyonecodes.java.Consolidation.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> allInputs = new ArrayList<>(); //#1 outside the loop

        while (true) {
            System.out.println("Enter a number or type stop:");
            String input = scanner.nextLine();
            if (input.equals("stop")) { // stop immediately #2
                break;
            }
            int inputAsInt = Integer.parseInt(input); // cast String in Int
            allInputs.add(inputAsInt);//#3 add to list allInputs the input from scan
        }

        if (allInputs.size() > 0) {// #4 check if list is empty
            int greatestNumber = findGreatestNumber(allInputs);//#5
            System.out.println("Greatest: " + greatestNumber);
        } else {
            System.out.println("No number was entered.");
        }
    }

    public static int findGreatestNumber(List<Integer> numbers) {
        int greatestNumber = numbers.get(0);// compare with itself -> first number is first number at index 0 in list
        for (int number : numbers) {// first number is either greatest or smallest number
            if (number > greatestNumber) { // looks at index 0 and compares number from list if so save this as index
                greatestNumber = number;// 1 > 1 -> false , 2> 1 -> true 2; 3>2 -> 3 .....
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