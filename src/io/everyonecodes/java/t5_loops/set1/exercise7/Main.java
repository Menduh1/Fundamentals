package io.everyonecodes.java.t5_loops.set1.exercise7;

public class Main {
    public static void main(String[] args) {

        int totalPages = 200;
        int currentPageNumber = 1;      // initializing
        while (currentPageNumber <= totalPages) {       // condition: 1 <= 200 - true //#1
            boolean isCorrectPage = containsQuote(currentPageNumber); //#3 true = 42 ; return true
            if (isCorrectPage) {//#4 true
                System.out.println("Found it! It's on page " + currentPageNumber + "!");
                break; // exit if condition and loop !!
            }
            currentPageNumber++;    // in/de-crement
            // each iteration 1 add -> currentPageNumber = currentPageNumber;
            // currentPageNumber = currentPageNumber + 1;
            // currentPageNumber = 1 + 1 => 2 + 1 => 3 +1 => 4 + 1 .... 200;
            // for(int i = 1; currentPageNumber <= totalPages ; i++) ... optional for loop instead of while loop
        }
    }

    public static boolean containsQuote(int pageNumber) {//#2
        // It so happens that the quote was on page 42! Go figure!
        return pageNumber == 42;
    }
}
       /* int pageNumber = 0;
        while (pageNumber<200) {
            if (containsQuote(pageNumber)) {
                System.out.println("Found it! It’s on page " + pageNumber + "!");
                break;
            }
            pageNumber = pageNumber + 1;
        }*/
       /* for(int pageNumber =1; pageNumber<=200; pageNumber++) {
            if(containsQuote(pageNumber)) {
                System.out.println("Found it! It’s on page " + pageNumber + "!");
                break;
            }
        }*/