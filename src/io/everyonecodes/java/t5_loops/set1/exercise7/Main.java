package io.everyonecodes.java.t5_loops.set1.exercise7;

public class Main {
    public static void main(String[] args) {

        int totalPages = 200;
        int currentPageNumber = 1;      // initializing
        while (currentPageNumber <= totalPages) {       // condition
            boolean isCorrectPage = containsQuote(currentPageNumber);
            if (isCorrectPage) {
                System.out.println("Found it! It's on page " + currentPageNumber + "!");
                break;
            }
            currentPageNumber++;    // in/de-crement
            // each iteration 1 add -> currentPageNumber = currentPageNumber;
            // currentPageNumber = currentPageNumber + 1;
            // currentPageNumber = 1 + 1 => 2 + 1 => 3 +1 => 4 + 1 .... 200;
            // for(int i = 1; currentPageNumber <= totalPages ; i++) ... optional for loop instead of while loop
        }
    }

    public static boolean containsQuote(int pageNumber) {
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