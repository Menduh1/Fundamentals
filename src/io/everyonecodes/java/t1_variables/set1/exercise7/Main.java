package io.everyonecodes.java.t1_variables.set1.exercise7;

public class Main {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 1000;
        int value3 = 1000000;
        /* int value4 = 10000000000; value to high*/
        int value4 = 2111111111; /*typed several values and recognized that max is between 2 and 3 billion -> then asked google */
        int valueMax = 2147483647 + 1;
        System.out.println("Max Integer Value: " + valueMax); /* integer wechselt von max auf min bei der Überschreitung*/
// 10 Billion cause overflows
        int maxInt = Integer.MAX_VALUE;
        maxInt = maxInt + 1;
        System.out.println(maxInt);
// when we add 1 to the maximum value of an interger, we "loop around", and get the minimum possible integer;

        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt);
    }
}
