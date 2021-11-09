package io.everyonecodes.java.t4_ifelse.set1.exercise7;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //    Part B
        List<String> ingredientsOfMostFamousCake = getIngredientsOfMostFamousCake(); // list with Strings : [Custard,..]
        // List<String> ingredientsOfMostFamousCake = List.of{"Custard", ...}
        //    Part C
        String answer = lookForIngredient(ingredientsOfMostFamousCake); // return String !!
        System.out.println(answer);
    }

        //    Part A
        public static String lookForIngredient(List<String> ingredients) {
        System.out.println("What particular ingredient are you looking for?");
        Scanner scanner = new Scanner(System.in);
        String ingredient = scanner.nextLine();

        if (ingredients.contains(ingredient)) {
            return "That ingredient is indeed included in the cake.";
        } else {
            return "That ingredient is not included in the cake.";
        }
    }

    //    Available Functions
    public static List<String> getIngredientsOfMostFamousCake() {
        return List.of("Custard", "Chocolate", "Strawberries", "Cream");
    }
}

