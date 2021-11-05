package io.everyonecodes.java.t6_classes.set1.exercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //        Part B
        Person ben = new Person("Ben", List.of("Arthur", "Charlie", "Tommy")); // Obj.Person variable/reference at same time name of properties "
        Person omri = new Person("Omri", List.of("Gad", "Eli", "Bat"));
//        Part C
        ben.friends.add("Finn");
        ben.friends.add("Ada");
        System.out.println(ben.friends);
    }
}
