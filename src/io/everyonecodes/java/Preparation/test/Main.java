package io.everyonecodes.java.Preparation.test;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        test(List.of(0, 1, 2, 3), 3);
        test(List.of(-1, 0, 2, 3), 3);
        test(List.of(1, 1, 1), 1);

    }

    public static void test(List<Integer> input, int expectedOutput) {
        int result = findGreatestNumber(input);
        if (result == expectedOutput) {
            System.out.println("Test succeeded");
        } else {
            System.out.println("Test failed, expected output is: " + expectedOutput + "result is: " + result);
        }
    }

    public static int findGreatestNumber(List<Integer> list) {
        int greatest = list.get(0);
        int i = 0;
        while (i < list.size()) {
            int number = list.get(i);
            if (number > greatest) {
                greatest = number;
            }
            i++;
        }
        return greatest;
    }

}
