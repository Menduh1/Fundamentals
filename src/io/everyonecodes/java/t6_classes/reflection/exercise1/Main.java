package io.everyonecodes.java.t6_classes.reflection.exercise1;

import java.util.ArrayList;
import java.util.List;
// public is an access - specifier
public class Main {
    // static is a modifier
    public static void main(String[] args) {
        // 1st generate obj. of class TravelDiary
        // 2nd put it in a list
        TravelDiary diaryFrance = new TravelDiary("France", 2017, new ArrayList<>(List.of("Paris")));
        TravelDiary diaryFinland = new TravelDiary("Finland", 2012, new ArrayList<>(List.of("Helsinki", "Tampere")));
        diaryFrance.yearOfLastVisit = 2019;
        diaryFrance.places.add("Marseille");
        List<TravelDiary> diaries = (List.of(diaryFinland, diaryFrance)); // !!!!!! Class in List -> instances of Class in List !!!
        printSummary(diaries);
    }
    public static void printSummary(List<TravelDiary> diaries) {
        {
            for (TravelDiary diary : diaries) {
                if (diary.places.size() > 0) { // PLACE.size only here accessible
                    System.out.println("I visited " + diary.country + " in " + diary.yearOfLastVisit);

                }
            }
        }
    }
}
