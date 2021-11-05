package io.everyonecodes.java.t8_evaluation.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> vehicles = new ArrayList<>(List.of("plane ", "car", "train"));
        List<Double> travelTimes = new ArrayList<>();
        for (String vehicle : vehicles) {
            System.out.println("Please enter the distance to your travel destination (in km) when you go by " + vehicle + ":");
            double distance = scanner.nextDouble();
            System.out.println("How fast is the " + vehicle + " (in km/h)?");
            double speed = scanner.nextDouble();
            double calculateTime = calculateTravelTime(distance, speed);
            System.out.println("It would take you " + calculateTime + " hours to reach your destination by plane.");
            travelTimes.add(calculateTime);
        }
        int indexOfShortestTravelTime = findIndexOfSmallest(travelTimes);
        System.out.println("It would be fastest to go by " + vehicles.get(indexOfShortestTravelTime) + ", which would take " +
                travelTimes.get(indexOfShortestTravelTime) + " hours.");
    }

    public static double calculateTravelTime(double distance, double speed) {
        return distance / speed;
    }

    public static int findIndexOfSmallest(List<Double> lists) {
        int indexOfSmallest = 0;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) < lists.get(indexOfSmallest)) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
}
