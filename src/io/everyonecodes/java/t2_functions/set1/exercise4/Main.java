package io.everyonecodes.java.t2_functions.set1.exercise4;

public class Main {
    public static void main(String[] args) {

        double cost1 = calculateTaxiCost(12);
        double cost2 = calculateTaxiCost(7);
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
       /* double min = 12;

        double costToPayCustomer1 = calculateTaxiCost(min);
        System.out.println("Cost to pay customer 1 : " + costToPayCustomer1);

        double costToPayCustomer2 = calculateTaxiCost(7);
        System.out.println("Cost to pay customer 2 : " + costToPayCustomer2);

        double costToPayCustomer3 = calculateTaxiCost(23);
        System.out.println("Cost to pay customer 3 : " + costToPayCustomer3);

        //System.out.println(calculateTaxiCost(10)); //shorter way to print result no need for variables definition.

    }
    public static double calculateTaxiCost(double min) {
        double initialCost = 2.5;
        double costPerMinute = 1.15;
        return (costPerMinute * min) + initialCost;
        //return 1.15*min+2.5; also possible !
    }*/