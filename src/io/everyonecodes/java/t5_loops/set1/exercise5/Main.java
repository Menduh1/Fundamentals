package io.everyonecodes.java.t5_loops.set1.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //    Part A
    public static void greetGuests(List<String> guests) {
        for (String guest : guests) {
            System.out.println("Hi " + guest + ", nice to see you!");
        }
    }

    public static void main(String[] args) {


//        Part B
        List<String> guests = getGuestNames();

        // Part A - Greeting !!!
        // greetGuests(guests);
//        Part C
        int numberOfVIPTickets = 10;
        for (int i = 0; i < numberOfVIPTickets; i++) {
            String vipGuest = guests.get(i);
            giveVIPTicket(vipGuest);
        }

//        Part D
        sayGoodbye(guests);
    }

    public static void sayGoodbye(List<String> guests) {
        for (String guest : guests) {
            System.out.println("Goodbye " + guest + ", it’s been a pleasure to see you!");
        }
    }

    //        Available Functions
    public static List<String> getGuestNames() {
        List<String> guests = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            guests.add("Guest" + i); // i -> by each iteration add 1 -> i = i + 1 -> i = 0 +1 ; i = 1 + 1 = 2; ...until <11 (10)
        }
        return guests;
    }

    public static void giveVIPTicket(String guest) {
        System.out.println(guest + " received a VIP ticket.");
    }
}

/*
    public static void main(String[] args) {

        List<String> guest = getGuestNames();
        //System.out.println(guest);

        guest.remove(0);
        guest.add("Matilda");
        guest.remove(0);
        guest.add("Hansel");
        guest.remove(0);
        guest.add("Derek");

        for (int i=0; i < 7; i++)
        {
            guest.remove(0);
            int beginn = 4 + i;
            guest.add("Guest" + beginn );
        }
        System.out.println(guest);
        String guestElement = guest.get(0);

        for (int i = 0; i < guest.size(); i++) {
            String guestList = guest.get(i);
            giveVIPTicket(guestList);
        }
        greetGuests(guest);
        sayGoodbye(guest);
    }

    public static void giveVIPTicket(String guest) {
        System.out.println(guest + " received a VIP ticket.");
    }

    public static List<String> greetGuests(List<String> guest) {
        // guesList = getGuestNames();
        for (int i = 0; i < guest.size(); i++) {
            System.out.println("Hi " + guest.get(i) + ", nice to see you!");
        }
        return guest;
    }

    public static List<String> getGuestNames() {
        List<String> guests = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            guests.add("Guest" + i);
        }
        return guests;
    }

    public static List<String> sayGoodbye(List<String> guest) {
        // guesList = getGuestNames();
        for (int i = 0; i < guest.size(); i++) {
            System.out.println("Goodbye, " + guest.get(i) + ", it’s been a pleasure to see you!");
        }
        return guest;
    }
}*/
