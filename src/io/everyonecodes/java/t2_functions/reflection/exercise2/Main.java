package io.everyonecodes.java.t2_functions.reflection.exercise2;

public class Main {
    public static void main(String[] args) {
        String name = join("John", "Smith", "");
        System.out.println(name);
        String items = joinWithSemicolon("Milk", "Butter");
        System.out.println(items);
        String names = joinWithComma("Joe", "Jack");
        System.out.println(names);

    }

    public static String join(String left, String right, String delimiter) {
        return left + delimiter + right;
    }

    public static String joinWithSemicolon(String left, String right) {
        return join(left, right, ";");// call of function in function with more parameters (signature) than the origin
    }

    public static String joinWithComma(String left, String right) {
        return join(left, right, ",");
    }
}
