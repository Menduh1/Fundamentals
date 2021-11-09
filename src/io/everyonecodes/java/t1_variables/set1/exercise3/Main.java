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
}