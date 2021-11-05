package io.everyonecodes.java.t1_variables.set1.exercise8;

public class Main {
    public static void main(String[] args) {

        double a = 1.000001;
        double b = 0.000001;
        double expectedResult = 1;
        double subtraction = a - b;

        System.out.println(subtraction);
        System.out.println(expectedResult);
    }
}
 /*  double aVar = 1.000001;
        double bVar = 0.000001;
        double cVar = 1.0;
        double dSubAminB = aVar - bVar;

        System.out.println("Variable c: " + cVar);
        System.out.println("Sub a - b " + dSubAminB); // Erwartet war 1 jedoch Ausgabe 0.9 -> Rundungsfehler!

// double values are not 100% precise. The result of the subtraction is very close to 1,  but not exactly 1.
// it´s not possible to represent accurate numbers with double values.
// which is why they should not be used for example money, or other applications where precise values are important.*/