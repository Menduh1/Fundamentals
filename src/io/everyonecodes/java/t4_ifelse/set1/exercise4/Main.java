package io.everyonecodes.java.t4_ifelse.set1.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        Part C
        if (isAtHome() && !isGrandmaUsingCableTelephone()) {
            callWithCableTelephone();
        } else {
            callWithCellPhone();
        }
    }

    public static boolean isAtHome() {
        System.out.println("Are we at home?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    //        Part B
    public static boolean isGrandmaUsingCableTelephone() {
        System.out.println("Grandma, are you using the cable telephone?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    //    Available Functions
    public static void callWithCableTelephone() {
        System.out.println("Calling with cable telephone");
    }

    public static void callWithCellPhone() {
        System.out.println("Calling with cell phone");
    }
}

