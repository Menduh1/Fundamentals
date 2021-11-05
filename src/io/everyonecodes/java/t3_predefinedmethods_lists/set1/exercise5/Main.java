package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise5;

public class Main {
    public static void main(String[] args) {


        String pint = makeLastCapital("pint-eger");
        System.out.println(pint);
        String guinness = makeLastCapital("GUI-nness");
        System.out.println(guinness);
        String cider = makeLastCapital("cyber-cider");
        System.out.println(cider);
    }

    public static String makeLastCapital(String word) {
        int positionOfLast = word.length() - 1;
        String last = String.valueOf(word.charAt(positionOfLast));
        String beginning = word.substring(0, positionOfLast);
        return beginning + last.toUpperCase();
    }
}
        /*
        String pintEgerLastLetterCapital = makeLastCapital("pint-eger");
        System.out.println(pintEgerLastLetterCapital);
        String guinNesLastLetterCapital = makeLastCapital("GUI-nness");
        System.out.println(guinNesLastLetterCapital);
        String cyberCiderLastLetterCapital = makeLastCapital("cyber-cider");
        System.out.println(cyberCiderLastLetterCapital);
        System.out.println("");
        //  System.out.println(makeLastCapital("pint-eger"));
        //  System.out.println(makeLastCapital("GUI-nness"));
        //  System.out.println(makeLastCapital("cyber-cider"));

        /* Loop -> For -Each - Loop !
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the word: ");
        String word = scanner.nextLine();*/
        /*List<String> makeLastCapitalList1 = new ArrayList<>(List.of(word));
        List<String> makeLastCapitalList = new ArrayList<>(List.of("pint -eger", "GUI-ness", "cyber-cider"));
        for (String capital : makeLastCapitalList1) {
            System.out.println(makeLastCapital(capital));
        }*/

  /*  int positionOfLast = words.length()-1;
    String last = String.valueOf(words.charAt(positionOfLast));
    String beginning = words.substring(0,positionOfLast);
    System.out.println(positionOfLast);
    System.out.println(last.toUpperCase());
    System.out.println(beginning);*/
/*
    }

    public static String makeLastCapital(String word) {

   /* int wordLength = word.length();
    String makeLastCapitalUpperCase = word.toUpperCase().substring((wordLength - 1), (wordLength));
    return word.substring(0, (wordLength - 1)) + makeLastCapitalUpperCase;*/

   /*     int positionOfLast = word.length() - 1;
        String last = String.valueOf(word.charAt(positionOfLast));
        String beginning = word.substring(0, positionOfLast);
        return beginning + last.toUpperCase();

    }

}
*/
