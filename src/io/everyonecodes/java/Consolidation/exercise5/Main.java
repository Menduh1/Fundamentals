package io.everyonecodes.java.Consolidation.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println(removeOutliers(List.of(3, 5, 1, 3, 9)));
        System.out.println(removeOutliers(List.of(3, 5, 1, 3, 9, 1)));
        System.out.println(removeOutliers(List.of(1, 1, 1)));
        System.out.println(removeOutliers(List.of()));
        System.out.println(removeOutliers(List.of(1, 5, 3)));
        System.out.println(removeOutliers(List.of(1, 5)));
        System.out.println(removeOutliers(List.of(-100, -200, 5, 5)));
    }

    public static List<Integer> removeOutliers(List<Integer> list) {
        List<Integer> copiedList = new ArrayList<>(list);
        if (copiedList.size() < 3) {
            return copiedList;
        }
        removeSmallest(copiedList);
        removeGreatest(copiedList);
        return copiedList;
    }

    public static void removeSmallest(List<Integer> list) {
        int indexOfSmallest = findIndexOfSmallestElement(list);
        list.remove(indexOfSmallest);
    }

    public static void removeGreatest(List<Integer> list) {
        int indexOfGreatest = findIndexOfGreatestElement(list);
        list.remove(indexOfGreatest);
    }

    public static int findIndexOfGreatestElement(List<Integer> list) {
        int indexOfGreatest = 0;
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            int previousGreatestElement = list.get(indexOfGreatest);
            if (element > previousGreatestElement) {
                indexOfGreatest = i;
                //System.out.println(i);
            }
        }
        return indexOfGreatest;
    }

    public static int findIndexOfSmallestElement(List<Integer> list) {
        int indexOfSmallest = 0;
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            int previousSmallestElement = list.get(indexOfSmallest);
            if (element < previousSmallestElement) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
}


        /*
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInput =List.of(1,4,6,8);

       /* for (int i = 0; i < 4; i++) {
            System.out.println("Give a number");
            int number = scanner.nextInt();
            listInput.add(number);
        }*/
// System.out.println(removeOutliers(listInput));
// }
/*
    public static List<Integer> removeOutliers(List<Integer> listInput) {
        List<Integer> copiedList = new ArrayList<>(listInput);
        //System.out.println(copiedList);
        int greatestNumber = 0;
        int number = 0;
        int smallestNumber = 0;
        greatestNumber = greatestNumber;
        for (int i = 0; i < copiedList.size(); i++) {
            number = copiedList.get(i);
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }

        int number1 = 0;
        if (listInput.get(0) < greatestNumber) {
            smallestNumber = listInput.get(0);
            for (int i = 0; i < listInput.size(); i++) {
                number1 = listInput.get(i);
                if (number < smallestNumber) {
                    smallestNumber = number1;
                    //System.out.println(smallestNumber);
                }
            }
            System.out.println("Greatest Number: " + greatestNumber);
            System.out.println("Smallest Number : " + smallestNumber);


        }
        String greatestIntToString = String.valueOf(greatestNumber);
        //System.out.println("got it 1 " + greatestIntToString);
        if (listInput.equals("greatestIntToString")) {
            //System.out.println("got it2");
        }
        System.out.println(greatestIntToString);
        System.out.println(listInput);
        int positionGreatestValue = 0;
        int positionSmallestValue = 0;
        for(int i = 0; i<listInput.size(); i++) {
            if(listInput.get(i)==greatestNumber) {
                positionGreatestValue = i;
                System.out.println("Position greatest value: " + positionGreatestValue);
            }
            if(listInput.get(i) == smallestNumber) {
                positionSmallestValue = i;
                System.out.println("Position smallest value: " + positionSmallestValue);
            }
        }

        // copiedList.get(copiedList.contains(String.valueOf(greatestNumber)));

         if(copiedList.size() > 3) {
            copiedList.remove(positionGreatestValue);
            copiedList.remove(positionSmallestValue);
            System.out.println(copiedList);
        }
        return copiedList;*/