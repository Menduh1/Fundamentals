package io.everyonecodes.java.t5_loops.set1.exercise10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = getSomeWords();
        List<String> nicknames = new ArrayList<>();

//    Part C
        for (String word : words) {
            int endOfNickname = word.length() / 2;
            endOfNickname = (int) Math.floor(endOfNickname);
            String nickname = word.substring(0, endOfNickname);
            nicknames.add(nickname);
            System.out.println(nicknames);
        }

    }

    public static List<String> getSomeWords() {
        return List.of("gallery", "conviction", "performance", "diameter", "conservative", "constellation", "communication", "incentive");
    }
}
       /* for (int i = 0; i < words.size(); i++) {
            String elementList = words.get(i);
            halfElement = elementList.substring(0, elementList.length() / 2);
            nicknames.add(halfElement);
        }*/
      /*  for (String word : words) {
            String halfWord = word.substring(0, word.length() / 2);
            nicknames.add(halfWord);
        }
        System.out.println(nicknames);*/