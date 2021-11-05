package io.everyonecodes.java.t1_variables.set1.exercise3;

public class Main {
    public static void main(String[] args) {
        double numberOfPlants = 3 + 10;
        double numberOfMachines = 1;
        double numberOfWateringMachinesToBuy = (numberOfPlants / 4) - numberOfMachines;
        System.out.println(numberOfWateringMachinesToBuy);

        // Part B
        double price = 20;
        double cost = numberOfWateringMachinesToBuy * price;
        double finalCost = cost * 0.8;
        System.out.println(finalCost);

    }
}        /*
        double existingPlants = 3;
        double buyingPlants = 10;
        double allPlants = existingPlants + buyingPlants;
        double existingMachines = 1;
        double numberOfWateringMachinesToBuy = (allPlants / 4) - existingMachines;
        double finalCost = numberOfWateringMachinesToBuy * (20 * 0.8);

        System.out.println("John`s Garden System ");
        System.out.println("All Plants : " + allPlants);
        System.out.println("NumberOfWateringMachinesToBuy: " + numberOfWateringMachinesToBuy);
        System.out.println("FinalCost: " + finalCost);*/
