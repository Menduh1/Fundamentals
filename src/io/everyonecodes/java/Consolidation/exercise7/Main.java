package io.everyonecodes.java.Consolidation.exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Max: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            String stars = "";
            for (int star = 1; star <= i; star++) {
                stars += "*";
            }
            System.out.println(stars);
        }

        for (int i = max - 1; i >= 1; i--) {
            String stars = "";
            for (int star = 1; star <= i; star++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the maximum number of stars : ");
        int stars = scanner.nextInt();
        for (int i = 0; i < stars; i++) {
            String out = "*";
            for (int j = 0; j < i; j++) {
                out += "*";
            }
            System.out.println(out);
        }
        for (int rows = 1; rows < stars; rows++) {
            String out = "*";
            for (int star = 1; star < stars - rows; star++) {
                out += "*";
            }
            System.out.println(out);
        }

       /* System.out.println(output);
        for (int j = 1; j <= stars; j++) {
            output1 += "*";
            // System.out.println(output1);
        }
        System.out.println(output1);*/

    //}
//}
//System.out.println(out);}
        /*for (int i = 0; i<=stars; i++) {
            String output ="";
            for (int j =1; j<=i; j++) {
                output +="*";
            }
            /*for (int k=stars-1; k<=1; k--)
            {
                output ="+";
                System.out.println(output);
            }*/
// System.out.println(out);
// }

           /* for (int i = 0; i<2*stars-1; i++) {
                String output = "*";
                for (int j = 0; j<=i; j++){
                    output+= "+";
                    if(i ==5){
                        for (int l1 =stars; l1==0;l1--){
                            output+="#";
                        }
                    }
                }
                //for (int j =stars-1; j<=i;  j--){
                 //   output+="*";
                //}
                System.out.println(output);
            }*/


//}
/*
        for (int i = 0; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i <= stars; i++) {
            for (int j = stars - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println("");

        }*/







