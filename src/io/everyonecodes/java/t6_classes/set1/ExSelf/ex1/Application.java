package io.everyonecodes.java.t6_classes.set1.ExSelf.ex1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void findHouse(Street mainStreet) {
        for (House house : mainStreet.houses) {
            System.out.println(house.name + " " + house.tenants);
        }
    }

    public static void main(String[] args) {

        List<String> floors = List.of("ground floor", "first floor", " second floor");

        House houseWhite = new House("Jim", floors, new ArrayList<>(List.of("Tom", "John")), 2020, true);
        House houseBlack = new House("Toms Apartment", floors, List.of("Bill"), 2021, false);

        houseWhite.name = "Mikes Apartment";
        houseWhite.tenants.add("Tina");
        houseWhite.tenants.add("Anja");
        // System.out.println("Name: " + houseWhite.name + " floors  " + houseWhite.floors + " " + houseWhite.tenants + " Established in : " + houseWhite.established + " air conditioner : " + houseWhite.airConditioner);

        List<House> neighbors = List.of(houseWhite, houseBlack); // combination of objects in a list -> only access by listing
        for (House neighbor : neighbors) {
            // System.out.println(neighbor.name + " " + neighbor.floors + " " + neighbor.tenants + " " + neighbor.established + " " + neighbor.airConditioner);
        }
        List<House> houses1 = List.of(new House("Diana's Apartment", floors, List.of("Maggy"), 2015, true));
        Street street = new Street("DeadEndStreet", List.of(new House("Ralphs Apartment", floors, List.of("Richard"), 2012, true)));
        List<House> houses = new ArrayList<>(List.of(houseWhite, houseBlack));
        House house = new House("Janes Apartment", floors, List.of("Maria"), 2010, true);
        houses.add(house);
        house = new House("George", floors, List.of(), 2009, false);
        houses.add(house);
        // System.out.println(neighbors);
        Street mainStreet = new Street("mainStreet", houses);
        Street mainAlley = new Street("mainAlley", houses1);
        findHouse(mainStreet);
        findHouse(mainAlley);
        findHouse(street);
    }
}
