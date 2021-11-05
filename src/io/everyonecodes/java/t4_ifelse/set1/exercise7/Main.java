package io.everyonecodes.java.t4_ifelse.set1.exercise7;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //    Part B
        List<String> ingredientsOfMostFamousCake = getIngredientsOfMostFamousCake();

        //    Part C
        String answer = lookForIngredient(ingredientsOfMostFamousCake);
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

//  List<String> ingredientsOfMostFamousCake = new ArrayList<>(getIngredientsOfMostFamousCake());
// loop!
// while (true) {/*  Scanner scanner = new Scanner(System.in);
//            System.out.println("Do you wand to exit ?");
//
//           boolean exit = scanner.nextBoolean();
//            if (exit) {
//                break;*/
      /*  if (lookForIngredient(ingredientsOfMostFamousCake)) {
            System.out.println("That ingredient is indeed included in the cake.");
        } //else if (!lookForIngredient(ingredientsOfMostFamousCake))// {
        else {
            System.out.println("That ingredient is not included in the cake.");
        }
    }

    public static boolean lookForIngredient(List<String> ingredientsOfMostFamousCake) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What particular ingredient are you looking for?");
        String listIngredients = scanner.nextLine();
        return ingredientsOfMostFamousCake.contains(listIngredients);
    }

    public static List<String> getIngredientsOfMostFamousCake() {
        return List.of("Custard", "Chocolate", "Strawberries", "Cream");
    }
}*/

