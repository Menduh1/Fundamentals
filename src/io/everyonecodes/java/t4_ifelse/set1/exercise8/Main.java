package io.everyonecodes.java.t4_ifelse.set1.exercise8;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//    Uncomment the code below if you want to test whether the output is correct or not.

     //   System.out.println("Does Byte-Greissler have all of Derek's flavors? " + hasDereksFlavors(getAvailableFlavors("Byte-Greissler")));
//        System.out.println("Does Ti-Chy have all of Matilda's flavors? " + hasMatildasFlavors(getAvailableFlavors("Ti-Chy")));
//        System.out.println("Is Byte-Greissler Open? " + isRestaurantOpen("Byte-Greissler"));
//        System.out.println("Is Ti-Chy Open? " + isRestaurantOpen("Ti-Chy"));
//        System.out.println(goToBitFreezeRestaurant());
//    }
    }
    //    Part A

    public static boolean hasDereksFlavors(List<String> availableFlavors) {
        boolean hasVanilla = availableFlavors.contains("vanilla");
        boolean hasStraciatella = availableFlavors.contains("straciatella");
        return hasVanilla && hasStraciatella;
    }

    //    Part B
    public static boolean hasMatildasFlavors(List<String> availableFlavors) {
        boolean hasStrawberry = availableFlavors.contains("strawberry");
        boolean hasChocolate = availableFlavors.contains("chocolate");
        boolean hasLemon = availableFlavors.contains("lemon");
        return hasStrawberry && hasChocolate && hasLemon;
    }

//    Part C

    public static boolean isRestaurantOk(String restaurantName) {
        boolean isOpen = isRestaurantOpen(restaurantName);
        List<String> availableFlavors = getAvailableFlavors(restaurantName);
        boolean hasAllFlavors = hasDereksFlavors(availableFlavors) && hasMatildasFlavors(availableFlavors);
        return isOpen && hasAllFlavors;
    }

    //    Part D
    public static String goToBitFreezeRestaurant() {
        if (isRestaurantOk("Byte-Greissler")) {
            return "We go to Byte-Greissler!";
        }
        if (isRestaurantOk("Ti-Chy")) {
            return "We go to Ti-Chy!";
        }
        return "All Bit-freeze restaurants are bad!";
    }

    //    Available Functions
    public static boolean isRestaurantOpen(String restaurantName) {
//      All restaurants seem to be open at the moment
        return true;
    }

    public static List<String> getAvailableFlavors(String restaurantName) {
        // Returns the list of flavors the two restaurants have.
        // If the restaurant name is unknown, return an empty list
        if (restaurantName.equals("Byte-Greissler")) {
            return List.of("Flavor 1", "Flavor 2", "Flavor 3");
        } else if (restaurantName.equals("Ti-Chy")) {
            return List.of("Flavor 4", "Flavor 5", "Flavor 6", "Flavor 7");
        } else {
            return List.of();
        }
    }

}
        /*

        System.out.println(goToBitFreezeRestaurant());
    }

    public static boolean hasDereksFlavors(List<String> availableFlavors) {
        return availableFlavors.contains("vanilla") && availableFlavors.contains("straciadella");
    }

    public static boolean hasMatildasFlavors(List<String> availableFlavors) {
        return availableFlavors.contains("strawberry") && availableFlavors.contains("chocolate") && availableFlavors.contains("lemon");
    }

    public static boolean isRestaurantOk(String restaurantName) {
        boolean isRestaurantOpen = isRestaurantOpen(restaurantName);
        List<String> availableFlavors = getAvailableFlavors(restaurantName);
        boolean doesDerekWantToGo = hasDereksFlavors(availableFlavors);
        boolean doesMatildaWantToGo = hasMatildasFlavors(availableFlavors);
        return isRestaurantOpen && doesDerekWantToGo && doesMatildaWantToGo;
    }

    public static boolean isRestaurantOpen(String restaurantName) {
//      All restaurants seem to be open at the moment
        return true;
    }

    public static List<String> getAvailableFlavors(String restaurantName) {
        // Returns the list of flavors the two restaurants have.
        // If the restaurant name is unknown, return an empty list
        if (restaurantName.equals("Byte-Greissler")) {
            return List.of("Flavor 1", "Flavor 2", "Flavor 3");  ////!!!!!!!!!! RETURN IN IF BRANCH
        } else if (restaurantName.equals("Ti-Chy")) {
            return List.of("Flavor 4", "Flavor 5", "Flavor 6", "Flavor 7");
        } else {
            return List.of();
        }
    }

    public static String goToBitFreezeRestaurant() {
        String restaurantMessage = "We go to ";
        String byteGreissler = "Byte-Greissler";
        if (isRestaurantOk("Byte-Greissler")) {
            return restaurantMessage + byteGreissler + "!"; // RETURN WITH VARIABLE !!!!
        }
        String tiChy = "Ti-Chy";
        if (isRestaurantOk("Ti-Chy")) {
            return restaurantMessage + tiChy + "!";
        }
        return ("All Bit-freeze restaurants are bad!");

    }
}*/
