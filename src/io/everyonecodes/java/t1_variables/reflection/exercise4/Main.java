package io.everyonecodes.java.t1_variables.reflection.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favorite TV show?");
        String tvShowName = scanner.nextLine();
        System.out.println("How many seasons are there in total?");
        int numberOfSeasons = scanner.nextInt();
        System.out.println("How many episodes does each season have?");
        int numberOfEpisodesPerSeason = scanner.nextInt();
        System.out.println("How long is each episode, in minutes?");
        int numberOfMinutesPerEpisode = scanner.nextInt();
        System.out.println("How many full seasons have you already watched?");
        int numberOfSeasonsWatched = scanner.nextInt();
        System.out.println("For the last season you started watching, how many episodes have you already watched?");
        int numberOfEpisodesWatched = scanner.nextInt();
        int numberOfSeasonsLeft = numberOfSeasons - numberOfSeasonsWatched;
        int numberOfEpisodesLeft = (numberOfSeasonsLeft * numberOfEpisodesPerSeason) - numberOfEpisodesWatched;
        int numberOfMinutesLeft = numberOfEpisodesLeft * numberOfMinutesPerEpisode;
        System.out.println("You still have to watch for " + numberOfMinutesLeft + " minutes to finish " + tvShowName + "!");
 }
}       /* Scanner scanner = new Scanner(System.in);
        System.out.println("What`s your favorite TV show?");
        String favoriteTVShow = scanner.nextLine();
        System.out.println("How many season are there in total?");
        int totalNumberOfSeason = scanner.nextInt();

        System.out.println("How many episodes does each season have?");
        int amountOfEpisodes = scanner.nextInt();


        System.out.println("How long is each episode, in minutes?");
        int lengthOfEpisodesMin = scanner.nextInt();


        System.out.println("How many full season have you already watched?");
        int numberOfFullSeasonWatched = scanner.nextInt();


        System.out.println("For the last season you started watching, how many episodes have you already watched?");
        int lastSeasonWatchedEpisodes = scanner.nextInt();

        System.out.println("" + lastSeasonWatchedEpisodes);

        int totalMinutesAllWatched = (numberOfFullSeasonWatched - totalNumberOfSeason) * (lastSeasonWatchedEpisodes - amountOfEpisodes) * lengthOfEpisodesMin;

        System.out.println("You still have to watch for " + totalMinutesAllWatched + " minutes to finish" + favoriteTVShow + "!");
  */
