package io.everyonecodes.java.t1_variables.reflection.exercise1;

public class Main {
    public static void main(String[] args) {

        // Real life problem:
        // Not having enough money to pay while buying groceries with a friend.

        double amountToPay = 17;
        double amountIHave = 12;
        double amountToAskMyFriendFor = amountToPay - amountIHave;
        System.out.println("Could I please borrow " + amountToAskMyFriendFor + " Euros?");
    }
}
   /*     int apple = 3;
        int pear = 4;
        int appleCostPerUnit = 3;
        int pearCostPerUnit = 4;
        int costApple = apple * appleCostPerUnit;
        int costPear = pear * pearCostPerUnit;
        int costTotal = costApple + costPear;
        System.out.println("apple " + apple + " kg " + "cost per Kilo 3 € " + "=> cost apple " + costApple);
        System.out.println("pear  " + pear + " kg " + "cost per Kilo 4€ " + "=> cost pear " + costPear);
        System.out.println("cost Total " + costTotal);*/