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

    public static boolean hasDereksFlavors(List<String> availableFlavors) {//#7
        boolean hasVanilla = availableFlavors.contains("vanilla");
        boolean hasStraciatella = availableFlavors.contains("straciatella");
        return hasVanilla && hasStraciatella;
    }// return true/false

    //    Part B
    public static boolean hasMatildasFlavors(List<String> availableFlavors) {//#6
        boolean hasStrawberry = availableFlavors.contains("strawberry");
        boolean hasChocolate = availableFlavors.contains("chocolate");
        boolean hasLemon = availableFlavors.contains("lemon");
        return hasStrawberry && hasChocolate && hasLemon;
    }//return true/false

//    Part C

    public static boolean isRestaurantOk(String restaurantName) {//#2
        boolean isOpen = isRestaurantOpen(restaurantName);//#3
        List<String> availableFlavors = getAvailableFlavors(restaurantName);//#5
        boolean hasAllFlavors = hasDereksFlavors(availableFlavors) && hasMatildasFlavors(availableFlavors);
        return isOpen && hasAllFlavors;
    }//#8 return true/false

    //    Part D
    public static String goToBitFreezeRestaurant() {
        if (isRestaurantOk("Byte-Greissler")) { // #1 here we start #9
            return "We go to Byte-Greissler!";
        }
        if (isRestaurantOk("Ti-Chy")) {
            return "We go to Ti-Chy!";
        }
        return "All Bit-freeze restaurants are bad!";// if 10 if no flavour match this is the case here return String
    }

    //    Available Functions
    public static boolean isRestaurantOpen(String restaurantName) {//#4
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