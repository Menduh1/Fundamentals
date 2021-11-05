package io.everyonecodes.java.t2_functions.set1.exercise5;

public class Main {
    public static double calculateWalkingTime(double distance) {
        return distance * 15;
    }

    public static double calculateTramTime(int numberOfStations) {
        return numberOfStations * 4;
    }

    public static double calculateTotalTime(double distanceToTram, int numberOfStations, double distanceToFriend) {
        double timeToTram = calculateWalkingTime(distanceToTram);
        double timeForTram = calculateTramTime(numberOfStations);
        double timeToFriendsHouse = calculateWalkingTime(distanceToFriend);
        return timeToTram + timeForTram + timeToFriendsHouse;
    }

    public static void main(String[] args) {
        double timeCommuting = calculateTotalTime(2.5, 5, 1.2);

        double distanceToTram = 2.5;
        int numberOfStations = 5;
        double distanceToFriend = 1.2;

        timeCommuting = calculateTotalTime(distanceToTram, numberOfStations, distanceToFriend);

    }
}
        /*
        double timeCommuting = calculateTotalTime(2.5, 5, 1.2);
        double walkingDistanceToStationInKm = 2.5;
        int numberOfStations = 5;
        double walkingDistanceToFriendInKm = 1.2;
        timeCommuting = calculateTotalTime(walkingDistanceToStationInKm, numberOfStations, walkingDistanceToFriendInKm);
        //  System.out.println("Total time for commuting: " + timeCommuting + " minutes.");
    }

    public static double calculateWalkingTime(double walkingDistanceToStationInKm) {
        //double walkingSpeedInMinutesPerKm = 15; only when needed
        return walkingDistanceToStationInKm * 15; //
    }

    public static double calculateTramTime(int numberOfStations) {
        return 4 * numberOfStations;
    }

    public static double calculateTotalTime(double walkingDistanceToStationInKm, int numberOfStations, double walkingDistanceToFriendInKm) {

        double walkingTime = calculateWalkingTime(walkingDistanceToStationInKm) + (walkingDistanceToFriendInKm * 15);
        double tramTime = calculateTramTime(numberOfStations);
        return walkingTime + tramTime;
    }*/