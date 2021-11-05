package io.everyonecodes.java.t1_variables.set1.lecture;

public class Main {
    public static void main(String[] args) {
        char firstCharacter3 = getFirstCharacter2("Hello");
        char firstCharacter4 = getFirstCharacter2("");
        System.out.println(firstCharacter3);
        System.out.println(firstCharacter4);
    }

    public static char getFirstCharacter2(String text) {
        char first ='0';
        if(text.length() > 0) {
            first = text.charAt(0);
        }
            return first;
        }
    }

