package io.everyonecodes.java.t5_loops.set1.exercise4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Matilda", "Derek", "Hansel");
        int total = 0;
        for (String name : names) {
            total += name.length();
        }
        System.out.println("That will be " + total + " € please!");
    }
}

/*
        int sum = 0;
        int i = 0;
        while (i < names.size()){
            sum += names.get(i).length();
            i++;
        }
        System.out.println(sum);
*/

        /*
        for (int i = 0; i < names.size(); i++) {
            PriceTotal += names.get(i).length();
        }
        System.out.println("You need to pay a total price of: " + PriceTotal);
*/

// PriceTotal = PriceTotal + name.length(); // equivalent
// PriceTotal++ -> PriceTotal = PriceTotal + 1 !!!
// PriceTotal = 0 initialise !
// PriceTotal = PriceTotal -> overwrite initial value by newValue; newValue = initialValue -> newValue = oldValue; otherwise need to define again explicit outside loop
// PriceTotal(newValue) + name.length();
// PriceTotal = 0 + 7 -> PriceTotal = 7 -> PriceTotal = 7 + 5 -> PriceTotal = 12 -> PriceTotal = 12 + 6 = 18;
