package io.everyonecodes.java.Preparation.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        greet("Tom", "Hello"); // here we don't assign separately datatype nor variable
    }
    public static void greet(String name, String greeting) {
        System.out.println(greeting + ", " + name);
        System.out.println("Pleased to meet you.");
    }

}
