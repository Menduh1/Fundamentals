package io.everyonecodes.java.t6_classes.set1.exercise6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Part B
        // one datatype
        List<String> ingredients = List.of("salt", "eggs", "ham", "bread");
        List<String> instructionSteps = List.of(
                "Fry bacon in pan",
                "Put bacon on plate",
                "Break egg and put it in hot pan",
                "Wait a few minutes until the egg white is actually white",
                "Put egg and bread on plate",
                "Salt egg"
        );
        Recipe hamAndEggs = new Recipe("Ham & Eggs", 10, ingredients, instructionSteps); // different datatype
    }
}
