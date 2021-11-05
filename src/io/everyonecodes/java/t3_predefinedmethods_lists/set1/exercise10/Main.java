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

    public static void cleanOneDish(List<String> dirtyDishes, List<String> cleanDishes) {
        String dish = getTop(dirtyDishes);
        removeTop(dirtyDishes);
        clean(dish);
        putTop(cleanDishes, dish);
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
        /*
        List<String> dirtyDishes = new ArrayList<>(List.of("plate1", "plate2", "plate3"));

        List<String> cleanDishes = new ArrayList<>();

        cleanAndMoveDishes(dirtyDishes, cleanDishes);
        cleanAndMoveDishes(dirtyDishes, cleanDishes);
        cleanAndMoveDishes(dirtyDishes, cleanDishes);
        System.out.println(cleanDishes);

    }

    public static void cleanAndMoveDishes(List<String> dirtyDishes, List<String> cleanDishes) {
        String dish = getTop(dirtyDishes);
        removeTop(dirtyDishes);
        clean(dish);
        putTop(cleanDishes, dish);
    }

    public static String getTop(List<String> dishes) {
        return dishes.get(dishes.size() - 1);
    }

    public static String removeTop(List<String> dishes) {
        return dishes.remove(dishes.size() - 1);
    }

    public static void putTop(List<String> dishes, String dish) {
        dishes.add(dish);
    }

    public static void clean(String dish) {
        System.out.println("Cleaned dish: " + dish);
    }
}*/

