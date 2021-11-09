package io.everyonecodes.java.t5_loops.set1.exercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //        Part A
        List<Integer> money = getMoneyNumbersFromHanselsFriends(); // function  called + assigned to a list // money is plural
        // List<Integer> maney = List.of(1,2,3,4,5)
//        Part B
        int total = 0;
        for (int amount : money) {
            total += amount;
        }
        System.out.println("I have a total of " + total + " Euro");
    }

    public static List<Integer> getMoneyNumbersFromHanselsFriends() {
//    Let's pretend Hansel has 5 friends where each one is more generous than the next...
        return List.of(1, 2, 3, 4, 5);
    }
}    ///!!!!!!!!!!!!!!!!!!!!!!!
        /*int sum = 0;
        int i = 0;
        while (i < sizeList) { // condition is true 0 < 5
            sum += getMoneyNumbersFromHanselsFriends().get(i); // function return value : 1,2,3,4,5 -> 0 + 1 -> sum
            i++;*/
///!!!!!!!!!!!!!!!!!!!!!!
/*
        List<Integer> moneyFriends = getMoneyNumbersFromHanselsFriends();
        int totalMoney = 0;
        for (int money : moneyFriends) {
            totalMoney += money;

        }
        System.out.println("The total Money is: " + totalMoney + "€.");*/
/*
        List<Integer> moneyFriendsOfHansels = getMoneyNumbersFromHanselsFriends();
        int sum = 0;
        for (int money : moneyFriendsOfHansels) {
            sum += money;
        }  System.out.println("He has in total: " + sum);*/

        /*
        int sum = 0;
        for (int i = 0; i < getMoneyNumbersFromHanselsFriends().size(); i++){
        sum += getMoneyNumbersFromHanselsFriends().get(i)
        };*/

// totalMoney++ -> totalMoney = totalMoney + 1 !!! -> totalMoney = 0 + 1 -> 1 + 1 -> 2 + 1 -> 3 + 1 -> 4 + 1 -> 5
// equal to totalMoney => totalMoney = totalMoney + money ;
// totalMoney = totalMoney => totalMoney     = 0; 1; 3; 6; 10; -> initial value overwrite! generate newValue -> newValue = intialValue; -> newValue = oldValue
// totalMoney + money => 0 + 1 -> totalMoney = 1; 3; 6; 10; 15; -> newValue(overwrite) + nextValue -> newValue
// System.out.println(totalMoney);