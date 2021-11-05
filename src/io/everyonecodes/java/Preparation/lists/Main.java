package io.everyonecodes.java.Preparation.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> powerFullPc = new ArrayList<>(getComponent());
        if (isStoreOpen()) {
            while (true) {
                if (lookForComponent(powerFullPc)) {
                    System.out.println("Get the PC!");
                    break;
                } else {
                    System.out.println("Keep searching!");
                }
            }
        }
    }

    public static List<String> getComponent() {
        return List.of("32 RAM", "i7", "1TBSSD"); // Returned List without need of declaration
    }

    public static boolean lookForComponent(List<String> powerFullPc) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What component should the powerful PC have ?");
        String components = scanner.nextLine();
        return powerFullPc.contains(components);
    }

    public static boolean isStoreOpen() {
        Scanner scanner = new Scanner(System.in);
        List<String> openDays = List.of("Monday", "Wednesday", "Friday");
        System.out.println("What day is today?");
        String dayOfWeek = scanner.nextLine();
        return openDays.contains(dayOfWeek);
    }
    public static String goToStore () {
        String message = "Let's go to";
        String storeName = "ComputerWorld";
        if(isStoreOpen()) {
            return message + storeName;
        }else {
            return "Try again another day";
        }
    }
}
