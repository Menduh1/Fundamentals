package io.everyonecodes.java.t6_classes.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //    Part C
    public static void listMenu(Menu menu) { // class Menu with (RestaurantName + dishes (dish -> name+price))
        System.out.println("These are the available dishes on the menu:");

        for (Dish dish : menu.dishes) {
            System.out.println(dish.name + " for €" + dish.price);
        }
    }

    public static void main(String[] args) {

//        Part D
       //2.nd List of class Menu Dish  //
        List<Dish> dishes = new ArrayList<>();
//List<Dish> dishes1 = new ArrayList<>(/List.of/(new Dish ("Lasagna",7.6), new Dish ("Caesar Salad",5.8)));
//        Part E
      // 1.st Instance of class Dish//
        Dish dish = new Dish("Lasagna", 7.6); // Data class- instance of Dish class
        dishes.add(dish); // properties of Dish handed over to dishes List which again handing over to instance menu ;
        dish = new Dish("Caesar Salad", 5.8); // !! same instance differen properties
        dishes.add(dish);
        dish = new Dish("Fish & Chips", 3.9);
        dishes.add(dish);

//        Part F
        // 3.rd parameter of class Menu insert
        Menu menu = new Menu("everyone eats", dishes); // two instances and list are combined
        // 4.th call method listMenu
        listMenu(menu);

    }
}
