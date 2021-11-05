package io.everyonecodes.java.t6_classes.set2.exercise5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
// 3rd generate obj. -> input list and name -> multiple datatypes
        Audience audience = new Audience(getFansInMusicFestival(), "");
        updateMood(audience); // by calling a function  we can pass values or variables to the function parameter in the parentheses  here we pass instance audience of class Audiences
        System.out.println("The audience’s mood is " + audience.mood);
    }

    public static void updateMood(Audience audience) {
        int numberOfDancingFans = 0;
        for (Fan fan : audience.fans) {
            if (fan.isDancing) {
                numberOfDancingFans += 1;
            }
        }
        double percentage = (double) (numberOfDancingFans * 100) / audience.fans.size();
        if (percentage > 90) {
            audience.mood = "amazing";
        } else if (percentage >= 60) {
            audience.mood = "great";
        } else {
            audience.mood = "awful";
        }
    }

    // here multiple instances are created
    // 1st generate obj. of class Fan
    // 2nd put in a list
    public static List<Fan> getFansInMusicFestival() {
        return List.of(
                new Fan("Joe", true),
                new Fan("Jack", false),
                new Fan("Lisa", true),
                new Fan("Sarah", true),
                new Fan("Samantha", true),
                new Fan("Gill", false),
                new Fan("Laura", true),
                new Fan("John", true)
        );
    }
}
// test public static Audience audience -> return audience
// new Audience (new ArrayLis....*/