package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Part A
        List<String> dirtyDishes = new ArrayList<>(List.of("plate1", "plate2", "plate3"));

        // Part B
        List<String> cleanDishes = new ArrayList<>();

        // Part F
        cleanOneDish(dirtyDishes, cleanDishes);
        cleanOneDish(dirtyDishes, cleanDishes);
        cleanOneDish(dirtyDishes, cleanDishes);

        System.out.println(cleanDishes);
    }

    public static void cleanOneDish(List<String> dirtyDishes, List<String> cleanDishes) {// parameter two lists !!!
        String dish = getTop(dirtyDishes); // function in a function - function to variable assignment // return : String dish =  plate3
        removeTop(dirtyDishes); // no assignment -> plate 3 removed from dirtyDishes
        clean(dish); // function call -> print : "cleaned dish:" plate 3!!
        putTop(cleanDishes, dish);// add plate3 to cleanDishes
    }

    // Part C
    public static String getTop(List<String> dishes) {
        return dishes.get(dishes.size() - 1);
    }

    // Part D
    public static void removeTop(List<String> dishes) {
        dishes.remove(dishes.size() - 1);
    }

    // Part E
    public static void putTop(List<String> dishes, String dish) {
        dishes.add(dish);
    }

    public static void clean(String dish) {
        System.out.println("Cleaned dish: " + dish);
    }
    }
