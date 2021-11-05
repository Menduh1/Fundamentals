package io.everyonecodes.java.t5_loops.set1.exercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> groceries = List.of("bread", "butter", "milk", "cheese", "yoghurt");
    // For - Each Loop !
        for (String item : groceries) {
            System.out.println("I need " + item + "."); // each iteration takes next element/value !
            //System.out.println("I need " + item.toUpperCase().charAt(0) + item.substring(1) + ".");
        }
    }
}
