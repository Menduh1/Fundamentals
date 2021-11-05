package io.everyonecodes.java.Consolidation.exercise9;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int playerLocationX = 1;
    private static int playerLocationY = 1;
    private static int foodLocationX = 1;
    private static int foodLocationY = 1;
    private static int width = 40;
    private static int height = 10;
    private static Random random = new Random();
    public static void main(String[] args) {
        var startTime = new Date().getTime();
        var gameTimeInMilliseconds = 100000;
        var score = 0;
        var scanner = new Scanner(System.in);
        updateFoodLocation();
        var moveSpeed = 1;
        var horizontalWallCharacter = "-";
        var verticalWallCharacter = "|";
        var playerCharacter = "*";
        var emptySpaceCharacter = " ";
        var foodCharacter = "o";
        while (true) {
            // Render
            System.out.println("Score: " + score);
            System.out.println("Time left: " + (gameTimeInMilliseconds - (new Date().getTime() - startTime)));
            for (var y = 0; y < height; y++) {
                for (var x = 0; x < width; x++) {
                    if (y == 0 || y == height - 1) { // Top and bottom wall
                        System.out.print(horizontalWallCharacter);
                    } else if (x == 0 || x == width - 1) { // Left and right wall
                        System.out.print(verticalWallCharacter);
                    } else if (x == playerLocationX && y == playerLocationY) {
                        System.out.print(playerCharacter);
                    } else if (x == foodLocationX && y == foodLocationY) {
                        System.out.print(foodCharacter);
                    } else {
                        System.out.print(emptySpaceCharacter);
                    }
                }
                System.out.println();
            }

            // Process input
            System.out.println("Where to move next?");
            var input = scanner.nextLine();
            if ((new Date().getTime() - startTime) > gameTimeInMilliseconds) {
                System.out.println("Time's up! Your final score is: " + score);
                break;
            } else if (input.equals("w")) {
                if (playerLocationY > 1) {
                    playerLocationY -= moveSpeed;
                }
            } else if (input.equals("s")) {
                if (playerLocationY < height - 2) {
                    playerLocationY += moveSpeed;
                }
            } else if (input.equals("a")) {
                if (playerLocationX > 1) {
                    playerLocationX -= moveSpeed;
                }
            } else if (input.equals("d")) {
                if (playerLocationX < width - 2) {
                    playerLocationX += moveSpeed;
                }
            } else if (input.equals("exit")) {
                break;
            }
            if (foodLocationX == playerLocationX && foodLocationY == playerLocationY) {
                updateFoodLocation();
                score += 1;
            }
        }
    }
    private static void updateFoodLocation() {
        while (foodLocationX == playerLocationX && foodLocationY == playerLocationY) {
            foodLocationX = 1 + (random.nextInt(width - 2));
            foodLocationY = 1 + (random.nextInt(height - 2));
        }
    }
}
