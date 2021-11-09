package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> apparel = List.of("blouse", "sneakers", "scarf", "sandals", "jeans", "shorts", "tank top", "blazer");

        String tankTop = apparel.get(6);
        String trouser = apparel.get(5);
        String sneaker = apparel.get(1);

        System.out.println("I will wear a " + tankTop + ", " + trouser + " and " + sneaker + ".");
    }
    }

