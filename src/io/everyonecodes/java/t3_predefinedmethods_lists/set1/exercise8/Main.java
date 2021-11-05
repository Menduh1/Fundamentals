package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cups = new ArrayList<>(List.of("empty cup ", "empty cup ", "cup with ball"));

      /*  cups.add(cups.remove(1));
        cups.add(cups.remove(1));
        cups.add(cups.remove(0));
        cups.add(cups.remove(0));
*/
        cups.remove(0);
        cups.add("empty cup");
        System.out.println(cups);

        cups.remove(1);
        cups.add("cup with ball");
        System.out.println(cups);

        cups.remove(0);
        cups.remove(0);
        cups.add("empty cup");
        cups.add("empty cup");
        System.out.println(cups);

    }
}
