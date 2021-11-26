package io.everyonecodes.java.A0_Preparation.a3_predefMethods_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (names.size() < 3) {
            System.out.println("Give your name, please");
            String name = scanner.nextLine();
            if (name.equals("stop")) {
                break;
            }
            names.add(name);
        }
        String space = "";
        for (int i = 0; i < names.size(); i++) {
            names.get(i).toUpperCase();//.charAt(0);
            space += names.get(i).toUpperCase().charAt(0);
            //System.out.println(space);
        }
        System.out.println(space);
        String output = "";
        for (int j = 0; j <= space.length(); j++) {
            output += space.charAt(Math.abs(space.length() - j));
        }
        System.out.println(output);
    }
}
