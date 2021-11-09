package io.everyonecodes.java.t2_functions.set1.exercise6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        buyBusTicket();
        buyBusTicket();
        buyBusTicket();

        // LOOP the Calls -> upcoming chapter
       /* for (int i = 0; i <= 2; i++) {
            buyBusTicket();
        }*/
    }

    public static void buyBusTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println(name + ", which bus seat do you want?");
        int seatNumber = scanner.nextInt();
        System.out.println("Ok, attempting to book the ticket...");
        boolean success = bookBusTicket(name, seatNumber); // function call - parameters are variables - assignment to boolean
        System.out.println(success);
    }

    public static boolean bookBusTicket(String name, int seatName) {
        // This will just return a random boolean
        Random random = new Random();
        return random.nextBoolean();
    }
}
        // System.out.println(bookBusTicket(name,seatName)); // direct call and print without variable assignment!
// problem is function call every time !!!!!
