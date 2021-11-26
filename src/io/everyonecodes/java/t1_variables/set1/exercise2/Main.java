    package io.everyonecodes.java.t1_variables.set1.exercise2;

    public class Main {
        public static void main(String[] args) {
            // Real life problem
            // Figure out the right amount of protein and calories a person has to eat a day to increase muscle mass optimally.

            // Solution
            double proteinGrams = 1.2;
            double weightInKilograms = 68;
            double amountOfProteinGramsPerDay = weightInKilograms * proteinGrams;
            System.out.println("You need to eat " + amountOfProteinGramsPerDay + " grams of protein per day.");
        }

    }