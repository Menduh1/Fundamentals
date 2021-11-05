package io.everyonecodes.java.t6_classes.reflection.exercise1;

import java.util.List;

public class TravelDiary {
    String country;
    int yearOfLastVisit;
    List<String> places;

    public TravelDiary(String country, int yearOfLastVisit, List<String> places) {
        this.country = country;
        this.yearOfLastVisit = yearOfLastVisit;
        this.places = places;
    }
}
