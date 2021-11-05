package io.everyonecodes.java.t6_classes.set1.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Part B
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, you've reached roboPhone tech-support!");
        System.out.println("Could you please tell me the brand of your phone.");
        String brand = scanner.nextLine();
        System.out.println("Thank you. Have you tried turning it off and on again?");
        boolean turnedOnAndOffAgain = scanner.nextBoolean();

//        Part C
        Phone customerPhone = new Phone(brand, turnedOnAndOffAgain);

    }
}
