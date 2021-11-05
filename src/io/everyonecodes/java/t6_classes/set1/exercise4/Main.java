package io.everyonecodes.java.t6_classes.set1.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        Part
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color is your car?");
        String color = scanner.nextLine();
        System.out.println("What year was your car built?");
        int yearBuilt = scanner.nextInt();

//        Part C
        Car userCar = new Car(color, yearBuilt);

//        Part D
        Car mercedes = new Car("black", 2018);
        Car citroen = new Car("yellow", 2004);
    }
}