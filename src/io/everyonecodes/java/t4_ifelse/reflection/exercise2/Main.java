package io.everyonecodes.java.t4_ifelse.reflection.exercise2;

import java.util.List;
import java.util.Scanner;

import static io.everyonecodes.java.t4_ifelse.set1.exercise4.Main.isAtHome;

public class Main {
    public static void main(String[] args) {
        greetSomeone();
    }

    public static void greetSomeone() {
        List<String> names = List.of("Derek", "Matilda", "Hansel");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Woof is this person’s name?");
        String name = scanner.nextLine();
        if (isAtHome() || names.contains(name)) {
            System.out.println("Hi there, " + name + "!");
        } else {
            System.out.println(name);
        }
    }
}
