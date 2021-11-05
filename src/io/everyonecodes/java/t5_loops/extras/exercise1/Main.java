package io.everyonecodes.java.t5_loops.extras.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {/*
        int pointIsAdult = 0;
        int pointIsWearingAHat = 0;
        int pointIsBringingAPet = 0;
        int pointHasChildren = 0;
        int totalVisitor = 10;
        int totalVisitorPercentAdult = 0;
        int totalVisitorPercentPet = 0;
        int totalVisitorPercentHat = 0;
        int totalVisitorPercentChildren = 0;

        List<String> getVisitorNames = getVisitorsList();
        System.out.println(getVisitorNames);


        for (int i = 0; i < 2; i++) {
            String getElement = getVisitorNames.get(i);
            if (isAdult()) {
                pointIsAdult++;
                totalVisitorPercentAdult = (pointIsAdult * 100) / totalVisitor;
            }
            if (isBringingAPet()) {
                pointIsBringingAPet++;
                totalVisitorPercentPet = (pointIsBringingAPet * 100) / totalVisitor;
            }
            if (isWearingAHat()) {
                pointIsWearingAHat++;
                totalVisitorPercentHat = (pointIsWearingAHat * 100) / totalVisitor;
            }
            if (hasChildren()) {
                pointHasChildren++;
                totalVisitorPercentChildren = (pointHasChildren * 100) / totalVisitor;
            }
        }
        System.out.println("From those, " + pointIsAdult + " (" + totalVisitorPercentAdult + "%) were adults.");
        System.out.println("From those, " + pointIsBringingAPet + " (" + totalVisitorPercentPet + "%) were bringing a pet");
        System.out.println("From those,  " + pointIsWearingAHat + " (" + totalVisitorPercentHat + "%) were wearing a hat.");
        System.out.println("From those,  " + pointHasChildren + " (" + totalVisitorPercentChildren + "%) were parents.");
    }

    public static boolean hasChildren() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have children?");
        return scanner.nextBoolean();
*/

        /*List<String> visitors = new ArrayList<>(getVisitorsList());

        List<String> visitorsWithHat = new ArrayList<>();
        List<String> visitorsWithPet = new ArrayList<>();
        List<String> visitorsAreAdult = new ArrayList<>();
        List<String> visitorsAreParents = new ArrayList<>();

        System.out.println("Event organizer's statistics:");
        int numberOfVisitors = visitors.size();

        for (String visitor : visitors) {
            if (isWearingAHat()) {
                visitorsWithHat.add(visitor);
            }
            if (isBringingAPet()) {
                visitorsWithPet.add(visitor);
            }
            if (isAdult()) {
                visitorsAreAdult.add(visitor);
            }
            if (hasChildren()) {
                visitorsAreParents.add(visitor);
            }
        }

        int visitorsWearingHat = visitorsWithHat.size();
        int visitorsBringingPet = visitorsWithPet.size();
        int visitorsAdult = visitorsAreAdult.size();
        int visitorsParents = visitorsAreParents.size();

        System.out.println("A total of " + numberOfVisitors + " visitors attended the event.");
        System.out.println("From those, " + visitorsWearingHat + " (" + calculatePercentage(numberOfVisitors, visitorsWearingHat) + "%) " + "were wearing a hat.");
        System.out.println("From those, " + visitorsBringingPet + " (" + calculatePercentage(numberOfVisitors, visitorsBringingPet) + "%) were bringing a " + "pet.");
        System.out.println("From those, " + visitorsAdult + " (" + calculatePercentage(numberOfVisitors, visitorsAdult) + "%) were " + "adults.");
        System.out.println("From those, " + visitorsParents + " (" + calculatePercentage(numberOfVisitors, visitorsParents) + "%) " + "were parents.");
    }

    public static int calculatePercentage(int numberTotal, int number) {
        return ((number * 100) / numberTotal);
    }

    public static boolean isWearingAHat() {
        System.out.println("Are you wearing a hat?");
        Random isRandomHat = new Random();
        return isRandomHat.nextBoolean();
    }

    public static boolean isBringingAPet() {
        System.out.println("Are you bringing a pet?");
        Random isRandomPet = new Random();
        return isRandomPet.nextBoolean();
    }

    public static boolean isAdult() {
        System.out.println("How old are you?");
        Random randomAdult = new Random();
        return randomAdult.nextBoolean();
    }

    private static boolean hasChildren() {
        System.out.println("Do you have kids?");
        Random randomKid = new Random();
        return randomKid.nextBoolean();
    }
*/

        int countPet = 0;
        double countPetInPercent = 0;
        int countHat = 0;
        double countHatInPercent = 0;
        int countAdult = 0;
        double countAdultInPercent = 0;
        int countHasChildren = 0;
        double countHasChildrenInPercent = 0;
        List<String> visitorsList = getVisitorsList();
        //System.out.println(visitorsList);

        for (String visitor : visitorsList) {
            System.out.println(visitor);
            if (isBringingAPet()) {
                countPet++;
                countPetInPercent++;
            }
            if (isWearingAHat()) {
                countHat++;
                countHatInPercent++;
            }
            if (isAdult()) {
                countAdult++;
                countAdultInPercent++;
            }
            if (hasChildren()) {
                countHasChildren++;
                countHasChildrenInPercent++;
            }

        }
        System.out.println("A total of " + visitorsList.size() + " visitors attended the event.");
        System.out.println("From those, " + countPet + " (" + ((countPetInPercent * 100) / (visitorsList.size())) + " %) were bringing a pet." + " From those, " + countHat + " (" + ((countHatInPercent * 100) / (visitorsList.size())) + " %) were wearing a hat." + " From those, " + countAdult + " (" + ((countAdultInPercent * 100) / (visitorsList.size())) + " %) were adults." + " From those,  " + countHasChildren + " (" + ((countHasChildrenInPercent * 100) / (visitorsList.size())) + " %) were parents");

    }

    public static boolean hasChildren() {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have children?");
        return scanner.nextBoolean();*/
        Random random = new Random();
        return random.nextBoolean();
    }

    public static List<String> getVisitorsList() {
        List<String> guests = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            guests.add("Guest" + i);
        }
        return guests;
    }

    public static boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        Random random = new Random();
        return random.nextBoolean();
    }

    public static boolean isBringingAPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you bringing a pet?");
        Random random = new Random();
        return random.nextBoolean();

    }

    public static boolean isAdult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        //int age = scanner.nextInt();
        Random random = new Random();
        return random.nextBoolean();
        //return age >=18;
    }

}
