package io.everyonecodes.java.t6_classes.set2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// 1st generate instance of class MusicFestival
        // 2nd put them in a list
        MusicFestival festival = new MusicFestival("Nova Rock", new ArrayList<>(List.of("Metallica", "Tenacious D", "Dio")));
        festival.artistNames.add("Meat Loaf");
        festival.artistNames.add("Alice Cooper");

        festival.name += "!!";

        System.out.println("Artists confirmed for the festival:");
        for (String artist : festival.artistNames) {
            System.out.println(artist);
        }


    }
}