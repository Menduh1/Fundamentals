package io.everyonecodes.java.t2_functions.set1.exercise5;

public class Main {
    public static double calculateWalkingTime(double distance) {
        return distance * 15;
    }

    public static double calculateTramTime(int numberOfStations) {
        return numberOfStations * 4;
    }

    public static double calculateTotalTime(double distanceToTram, int numberOfStations, double distanceToFriend) {
        double timeToTram = calculateWalkingTime(distanceToTram); // function to variable
        double timeForTram = calculateTramTime(numberOfStations); // function in function
        double timeToFriendsHouse = calculateWalkingTime(distanceToFriend); //function in function & nested & variable
        return timeToTram + timeForTram + timeToFriendsHouse;
    }

    public static void main(String[] args) {
        // call function - assign to a variable - parameters are values  - initialising
        double timeCommuting = calculateTotalTime(2.5, 5, 1.2);

        double distanceToTram = 2.5;
        int numberOfStations = 5;
        double distanceToFriend = 1.2;
        // second assignment - parameters are variables
        timeCommuting = calculateTotalTime(distanceToTram, numberOfStations, distanceToFriend);

    }
}
