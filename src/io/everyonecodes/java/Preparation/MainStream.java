package io.everyonecodes.java.Preparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Warren", 120));
        people.add(new Person("Jeff", 150));
     /*   List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());*/

        List<Person> hundredClub = people.stream()
                .filter(person -> person.billion >= 100)
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());
 /*
       for (Person p : people) {
            hundredClub.add(p);
        }*/
        hundredClub.forEach(person -> System.out.println(person.name));

    }

    static class Person {

        String name;
        int billion;

        public Person(String name, int billion) {
            this.name = name;
            this.billion = billion;
        }
    }
}
