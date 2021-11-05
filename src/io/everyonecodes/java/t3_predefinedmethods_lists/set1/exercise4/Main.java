package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise4;

public class Main {
    public static void main(String[] args) {

        String title1 = "The beauty and the beast";
        String title2 = "Gardening is a great thing";
        String title3 = "The ‘Diodes for Everyone’ robo-political party loses participation";
        String title4 = "The most impressive concert of all time";

        String the = title1.substring(0, 4); // including the space after
        String robo = title3.substring(26, 31); // including the - character
        String beauty = title1.substring(4, 11); // including the space after
        String isAGreatThing = title2.substring(10, 26);
        String forWord = title3.substring(11, 16); // including the space before and after
        String party = title3.substring(41, 47); // including the space after
        String time = title4.substring(35, 39);

        String designTitle = the + robo + beauty + isAGreatThing + forWord + party + time;
        System.out.println(designTitle);


    }
}
        /*
        String magazineTitel1 = "The beauty and the beast";
        String magazineTitel2 = "Gardening is a great thing";
        String magazineTitel3 = "The ‘Diodes for Everyone’ robo-political party loses participation";
        String magazineTitel4 = "The most impressive concert of all time";
        String titelMagazine = magazineTitel1.substring(0, 4) + magazineTitel3.substring(26, 31) + magazineTitel1.substring(4, 11) + magazineTitel2.substring(10, 26) + magazineTitel3.substring(11, 16) + magazineTitel3.substring(41, 47) + magazineTitel4.substring(35, 39);
        System.out.println(titelMagazine);
    }*/

