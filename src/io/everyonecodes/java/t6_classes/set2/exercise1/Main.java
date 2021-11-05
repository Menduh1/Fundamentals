package io.everyonecodes.java.t6_classes.set2.exercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Part B
        List<Product> products = getProductsToPurchase();
        // multiple instances in the list !!!
//               List<Product> products = List.of(new Product("apple", 2),new Product("orange",3);
// normal create one instance:  Product product = new Product("apple",2);
//        Part C
        double totalPrice = 0;
        for (Product product : products) {
            double pricePerUnit = getPricePerUnit(product); // here is the handing over of list getProductsToPurchase so the access of units is possible
            double productPrice = pricePerUnit * product.amount; // two functions are interacting here -> if condition differentiated between choices
            totalPrice += productPrice;
        }

    }

    //    Available Functions
    //    Generate here multiple instances !! -> source of generating
    public static List<Product> getProductsToPurchase() { // return Product as List !! class Product in a List
//        Returns a list of products to buy
        return List.of(
                new Product("apple", 2),
                new Product("orange", 3),
                new Product("beer", 4),
                new Product("tacos", 20)
        );
    }

    public static double getPricePerUnit(Product product) { // input is a Class with instance product ; both already existing
        if (product.name.equals("apple")) {
            return 0.5;
        } else if (product.name.equals("orange")) {
            return 0.7;
        } else if (product.name.equals("beer")) {
            return 1.4;
        } else if (product.name.equals("tacos")) {
            return 0.3;
        } else {
            return -1;
        }
    }
}
