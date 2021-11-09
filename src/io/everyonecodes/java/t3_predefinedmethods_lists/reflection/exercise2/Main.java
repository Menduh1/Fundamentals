package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Part A
        List<String> items = new ArrayList<>();

        // Part B
        items.add("egg");
        items.add("egg");
        items.add("bread");
        items.add("milk");

        // Part C
        String egg = items.get(0);
        String bread = items.get(2);
        items.remove(0);
        items.remove(0);
        items.remove(0);
        items.add(egg);
        items.add(egg);
        items.add(bread);
        System.out.println(items);
    }


}

      /*  //loop !
        for (int i = 0; i <= items.size(); i++) {
            items.remove(0);
            //System.out.println(items);
        } items.add("egg");
        items.add("egg");
        items.add("bread");
        System.out.println(items);*/

