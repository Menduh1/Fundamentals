package io.everyonecodes.java.A0_Preparation.a6_classes.ex1;

import java.util.List;

public class House {
    String name;
    List<String> floors;
    List<String> tenants;
    int established;
    boolean airConditioner;

    public House(String name, List<String> floors, List<String> tenants, int established, boolean airConditioner) {
        this.name = name;
        this.floors = floors;
        this.tenants = tenants;
        this.established = established;
        this.airConditioner = airConditioner;
    }
}
