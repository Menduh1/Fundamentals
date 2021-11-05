package io.everyonecodes.java.t7_evaluation.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Lisa", "Joe"));
        Scanner scanner = new Scanner(System.in);
        for (String name : names) {
            System.out.println("Hi " + name + " , could you please tell me your weight in kg?");
            double weight = scanner.nextDouble();
            System.out.println("Thank you, what is your height in cm?");
            double height = scanner.nextDouble();
            double bmi = calculateBodyMassIndex(weight, height);// speed up running time by assigning function to a variable - we call the function and pass multiple variables as input to the parameters -> parameterlist
            // input datatype is same as output datatype
            System.out.println("I see, your BMI is " + bmi + ".");

            double underWeightThreshold = 18.5;
            double normalWeightThreshold = 24.5;
            double overWeightThreshold = 29.9;

            if (bmi < underWeightThreshold) {
                System.out.println("That makes you underweight.");
            } else if (bmi <= normalWeightThreshold) {
                System.out.println("You have a normal body weight.");
            } else if (bmi <= overWeightThreshold) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("Unfortunately, I have to tell you that you're obese."
                );
            }
        }

    }

    public static double calculateBodyMassIndex(double weight, double height) {
        return weight / ((height / 100) * (height / 100));
    }
}

