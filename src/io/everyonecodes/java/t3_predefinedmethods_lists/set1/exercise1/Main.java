package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise1;

public class Main {
    public static void main(String[] args) {
        double totalBill = 13.4;
        double totalBillWithTip = totalBill * 1.1;
        double splitAmount = Math.ceil(totalBillWithTip / 2);
        System.out.println(splitAmount);

        System.out.println(splitBill(15, 3, 10));
    }

    public static double splitBill(double totalAmount, double numberOfPeople, double tipPercentage) {
        double tipAmount = totalAmount * tipPercentage / 100;
        return Math.ceil((totalAmount + tipAmount) / numberOfPeople);
    }
    }
       /* double totalBill = 13.4;
        double totalBillWithTip = totalBill * 1.1;
        double splitAmount = Math.ceil(totalBillWithTip / 2);
        System.out.println(splitAmount);
        System.out.println(splitBill(20, 2, 10));

    }

    public static double splitBill(double totalAmount, double numberOfPeople, double tipPercentage) {

        double tipAmount = totalAmount * tipPercentage / 100;
        return Math.ceil((totalAmount + tipAmount) / numberOfPeople); // Ceil -> aufrunden! round -> auf/ab ->.5
    }*/

    /*double eachToPay = (13.40 * 1.1) / 2;
    double roundToPay = Math.ceil(eachToPay);
    System.out.println(roundToPay);
    System.out.println(eachPersonToPay(20, 2, 10));
}

public static double eachPersonToPay(double amount, double numberOfPeople, double tipPercentage) {

    return Math.round(((amount * tipPercentage) / 100) + amount) / numberOfPeople;
}
}*/

