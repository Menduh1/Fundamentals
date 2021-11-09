package io.everyonecodes.java.t2_functions.set1.exercise4;

public class Main {
    public static void main(String[] args) {

        double cost1 = calculateTaxiCost(12); // assigning function to a variable ESSENTIAL !!!
        double cost2 = calculateTaxiCost(7);// otherwise, function would be called everytime !!!
        double cost3 = calculateTaxiCost(23);
        System.out.println(cost1);
        System.out.println(cost2);
        System.out.println(cost3);
    }

    public static double calculateTaxiCost(double numberOfMinutes) {
        double initialCost = 2.50;
        double costPerMinute = 1.15;
        return initialCost + (costPerMinute * numberOfMinutes);
    }
}

    /*
    public static double calculateTaxiCost(double min) {
        double initialCost = 2.5;
        double costPerMinute = 1.15;
        return (costPerMinute * min) + initialCost;
        //return 1.15*min+2.5; also possible !
    }*/