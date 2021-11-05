package io.everyonecodes.java.t6_classes.set2.exercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
// 2nd put in a List
        List<Shape> signs = getTrafficSignsFromHomeToWork();
        int count = countStops(signs);
        System.out.println("There are " + count + " stop signs from my home to work!");

    }

    //    Part B
    public static int countShape(List<Shape> shapes, Shape exampleShape) {
        int count = 0;
        for (Shape shape : shapes) {
            if (shape.name.equals(exampleShape.name) && (shape.color.equals(exampleShape.color))) {
                count++;
            }
        }
        return count;
    }

    //    Part C
    public static int countStops(List<Shape> shapes) { // similar -> functions -> ref->ex2 : join function
        Shape stopSign = new Shape("octagon", "red");
        return countShape(shapes, stopSign);
    }

    //    Available Functions
    // 1.st generate Shape
    // 2.nd put in a List
    public static List<Shape> getTrafficSignsFromHomeToWork() { // class Shape in a List -> uses of blueprint
        return List.of(
                new Shape("octagon", "red"),
                new Shape("triangle", "red"),
                new Shape("circle", "white"),
                new Shape("circle", "blue"),
                new Shape("octagon", "red")
        );
    }
}
