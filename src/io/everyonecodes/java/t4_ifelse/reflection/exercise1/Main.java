package io.everyonecodes.java.t4_ifelse.reflection.exercise1;

import java.util.List;
import java.util.Scanner;

public class Main {
    //    Part B

    public static void main(String[] args) {
        System.out.println("How expensive is this cell phone?");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Which brand is it?");
        String brand = scanner.nextLine();
        if (shouldBuyPhone(price, brand)) { // function returns true/false
            System.out.println("I will buy this one, thanks!");
        } else {
            System.out.println("Can you show me another one?");
        }
    }
    //    Part A
    public static boolean shouldBuyPhone(int price, String brand) {
        int minimumPrice = 150;
        int maximumPrice = 600;
        List<String> brands = List.of("cLular", "Hawaii", "SunSong");
        boolean isPriceInRange = price >= minimumPrice && price <= maximumPrice;
        return isPriceInRange && brands.contains(brand);
        // return (price >= 150 && price <= 600 && (brands.contains(brand)));
    }
}
