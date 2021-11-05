package io.everyonecodes.java.t6_classes.set1.exercise6;

import java.util.List;

public class Recipe {
    String name;
    int minutesToPrepare;
    List<String> ingredients; // one datatype
    List<String> instructionSteps;

    public Recipe(String name, int minutesToPrepare, List<String> ingredients, List<String> instructionSteps) {
        this.name = name;
        this.minutesToPrepare = minutesToPrepare;
        this.ingredients = ingredients;
        this.instructionSteps = instructionSteps;
    }
}

