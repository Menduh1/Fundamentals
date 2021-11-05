package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise6;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> bingoBalls = getBingoNumbersShuffled();

        int ball = bingoBalls.get(0);
        bingoBalls.remove(0);
        System.out.println("And the next number is... " + ball + "!");
    }

    public static List<Integer> getBingoNumbersShuffled() {
        // Creates a list from 1 to 75 and shuffles it
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(75)
                .collect(Collectors.toList());
        Collections.shuffle(numbers);
        return numbers;
    }
    }
        /*
        List<Integer> getBingoBalls = (getBingoNumbersShuffled());
        int firstNumber = getBingoBalls.get(0);
        getBingoBalls.remove(0);
        System.out.println("And the next number is... " + firstNumber + "!");
    }
    public static List<Integer> getBingoNumbersShuffled() {
        // Creates a list from 1 to 75 and shuffles it
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(75)
                .collect(Collectors.toList());
        Collections.shuffle(numbers);
        System.out.println(numbers);
        numbers.remove(numbers);
        return numbers;
    }
}*/

