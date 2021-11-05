package io.everyonecodes.java.t4_ifelse.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        Part A

        List<String> cards = List.of("Screws", "Sparks", "Circuits");

//        Part B
        int numberOfPoints = 13;
        System.out.println("Name a picture.");
        Scanner scanner = new Scanner(System.in);
        String picture = scanner.nextLine();
        if (!cards.contains(picture)) {
            System.out.println("Oops! I don’t have it! That’s " + numberOfPoints + " points. Well played!");
        } else {
            numberOfPoints = numberOfPoints + picture.length();
            if (numberOfPoints >= 20) {
                System.out.println("That’s " + numberOfPoints + " points. Yay! I won!");
            } else {
                System.out.println("That’s " + numberOfPoints + " points. I almost got you there! Well played!");
            }
        }
    }
}

      /*  Scanner scanner = new Scanner(System.in);
        List<String> cards = new ArrayList<>(List.of("Screws", "Sparks", "Circuits"));

        int lengthFirstElement = cards.get(0).length();
        int lengthSecondElement = cards.get(1).length();
        int lengthThirdElement = cards.get(2).length();
        int currentPoints = 13;
        //loop !
        // while (true) {
        System.out.println("Name a picture");
        String nameOfPicture = scanner.nextLine();
        //boolean picture = cards.contains(nameOfPicture);
        //System.out.println(picture);
       // if(nameOfPicture.equals("stop")) {
        //    break;
        //}

        if (nameOfPicture.equals("Screws")) {
            int sumPoints = currentPoints + lengthFirstElement;
            System.out.println("That’s " + sumPoints + " points. I almost got you there! Well played!");
        } else if (nameOfPicture.equals("Circuits")) {
            int sumPoints = currentPoints + lengthThirdElement;
            System.out.println("That’s " + sumPoints + " points. Yay! I won!");

        } else if (nameOfPicture.equals("Sparks")) {
            int sumPoints = currentPoints + lengthSecondElement;
            System.out.println("That's " + sumPoints + " points. I almost got you there! Well played!");
        } else {//if ((nameOfPicture.equals("exit"))) {

            //System.out.println("See you!");
            System.out.println("Oops! I don’t have it! That’s " + currentPoints + " points. Well played!");
        }

    }
}

//}*/
