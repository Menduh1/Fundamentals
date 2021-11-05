package io.everyonecodes.java.t6_classes.reflection.exercise2;

import io.everyonecodes.java.t6_classes.set2.exercise3.Shape;

import java.util.List;

import static io.everyonecodes.java.t6_classes.set2.exercise3.Main.countShape;

public class Main {
    public static void main(String[] args) {
        // 2nd put in a list
        List<Shape> shapes = getPaintingShapes();
        int total = countFavouriteShapes(shapes);
        System.out.println("My favourite shapes appear " + total + "  times!");
    }

    public static int countFavouriteShapes(List<Shape> shapes) {
        Shape redSquare = new Shape("square", "red");
        Shape greenTriangle = new Shape("triangle", "green");
        int numberOfRedSquares = countShape(shapes, redSquare);
        int numberOfGreenTriangles = countShape(shapes, greenTriangle);
        return numberOfRedSquares + numberOfGreenTriangles;

    }
// 1st generate obj.of class Shape
    // 2nd put in a list
    public static List<Shape> getPaintingShapes() {
        return List.of(
                new Shape("circle", "blue"),
                new Shape("circle", "red"),
                new Shape("triangle", "green"),
                new Shape("circle", "blue"),
                new Shape("rectangle", "yellow"),
                new Shape("circle", "blue"),
                new Shape("square", "red"),
                new Shape("rectangle", "blue"),
                new Shape("square", "red"),
                new Shape("triangle", "green"),
                new Shape("circle", "blue"),
                new Shape("rectangle", "yellow"),
                new Shape("triangle", "green"),
                new Shape("square", "red")
        );
    }

}
