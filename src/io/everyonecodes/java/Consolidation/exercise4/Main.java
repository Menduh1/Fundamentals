package io.everyonecodes.java.Consolidation.exercise4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countTrueValues(List.of(false, true, false, true)));
        System.out.println(countTrueValues(List.of(true, true, false, true)));
        System.out.println(countTrueValues(List.of(false, false)));
        System.out.println(countTrueValues(List.of(true)));
        System.out.println(countTrueValues(List.of()));
    }

    public static int countTrueValues(List<Boolean> list) {
        var result = 0;
        for (boolean value : list) {
            if (value) {
                result++;
            }
        }
        return result;
    }
}
        /*
        List<Boolean> listOfBooleans = List.of(false, true, false, true, true);
        /*for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("True or False : ");
            String trueFalse = scanner.nextLine();
            //int countValues =  countTrueValues(trueFalse);
            listEmpty.add(trueFalse);

        } *///System.out.println(countTrueValues(listEmpty));
        // System.out.println(listEmpty);
      /*  System.out.println("Amount of true elements : " + countTrueValues(listOfBooleans));
    }

    public static int countTrueValues(List<Boolean> listOfBooleans) {
        int elementTrue = 0;
        //int elementFalse = 0;
        for (boolean name : listOfBooleans) {
            if (name) {
                elementTrue++;
            }//else if(name.equals(false)) {
            //  elementFalse+=1;
            //}
            //System.out.println("element : "  + elementTrue);
        }
        return elementTrue;
    }
}*/

