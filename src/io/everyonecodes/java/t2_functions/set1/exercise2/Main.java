package io.everyonecodes.java.t2_functions.set1.exercise2;

public class Main {
    public static void main(String[] args) {
        buildingHouse();

    }

    public static void buildingHouse() {
        System.out.println("buildingHouse");
        foundation();
        walls();
        doors();
        windows();
        roof();

    }

    public static void foundation() {
        String name = "foundation";
        System.out.println(name);
        foundationGroundFloor();
        foundationFirstFloor();
        foundationSecondFloor();
    }

    public static void foundationGroundFloor() {
        System.out.println("FoundationGroundFloor");
    }

    public static void foundationFirstFloor() {
        System.out.println("FoundationFirstFloor");
    }

    public static void foundationSecondFloor() {
        System.out.println("FoundationSecondFloor");
    }

    public static void walls() {
        String name = "walls";
        System.out.println(name);
        wallsGroundFloor();
        wallsFirstFloor();
        wallsSecondFloor();
    }

    public static void wallsGroundFloor() {
        System.out.println("WallsGroundFloor");
    }

    public static void wallsFirstFloor() {
        System.out.println("WallsFirstFloor");
    }

    public static void wallsSecondFloor() {
        System.out.println("WallsSecondFloor");
    }

    public static void doors() {
        System.out.println("doors");
    }

    public static void windows() {
        System.out.println("windows");
    }

    public static void roof() {
        System.out.println("roof");
    }
}

