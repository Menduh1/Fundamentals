package io.everyonecodes.java.t6_classes.set2.exercise2;

import java.util.List;

public class Menu { // Service class
    String restaurantName;
    List<Dish> dishes; // Class in Class with properties of Class Dish
    // with the properties of the Dish class -> name and price instance variables

    public Menu(String restaurantName, List<Dish> dishes) {
        this.restaurantName = restaurantName;
        this.dishes = dishes;
    }
}
