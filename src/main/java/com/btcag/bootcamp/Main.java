package com.btcag.bootcamp;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        intro();

        String roboName = roboName();
        System.out.println("Sie haben folgenden Robotor ausgewählt: " + roboName);


        int[][] board = new int[10][15];
        int pos_X = 0;
        int pos_Y = 0;
        int enemy_X = 9;
        int enemy_Y = 9;
        String enemyName = "[Z]";
        printBoard(board, pos_X, pos_Y, roboName, enemy_X, enemy_Y, enemyName);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte geben Sie an in welche Richtung Sie sich bewegen wollen (WASD) X für position halten:");
            String move = scanner.next();
            move = move.toLowerCase(Locale.ROOT);
            if (validTurn(move, pos_X, pos_Y) && Objects.equals(move, "s")) {
                pos_Y++;
                System.out.println(printBoard(board, pos_X, pos_Y, roboName, enemy_X, enemy_Y, enemyName));
            } else if (validTurn(move, pos_X, pos_Y) && Objects.equals(move, "a")) {
                pos_X--;
                System.out.println(printBoard(board, pos_X, pos_Y, roboName, enemy_X, enemy_Y, enemyName));
            } else if (validTurn(move, pos_X, pos_Y) && Objects.equals(move, "w")) {
                pos_Y--;
                System.out.println(printBoard(board, pos_X, pos_Y, roboName, enemy_X, enemy_Y, enemyName));
            } else if (validTurn(move, pos_X, pos_Y) && Objects.equals(move, "d")) {
                pos_X++;
                System.out.println(printBoard(board, pos_X, pos_Y, roboName, enemy_X, enemy_Y, enemyName));
            } else if (Objects.equals(move, "x")) {
                System.out.println(printBoard(board, pos_X, pos_Y, roboName, enemy_X, enemy_Y, enemyName));
            } else {
                System.out.println("Input ungültig.");
            }
        }

    }
    public static boolean validTurn(String move, int pos_X, int pos_Y) {
        if (Objects.equals(move, "s") && pos_Y + 1 <= 9) {
            return true;
        } else if (Objects.equals(move, "a") && pos_X - 1 >= 0) {
            return true;
        } else if (Objects.equals(move, "w") && pos_Y - 1 >= 0) {
            return true;
        } else if (Objects.equals(move, "d") && pos_X + 1 <= 14) {
            return true;
        } else if (Objects.equals(move, "x")) {
            return true;
        } else {
            return false;
        }
    }
    public static void intro () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Namen ein:");
        String name = scanner.nextLine();
        System.out.println("     ,     ,");
        System.out.println("    [o]---[o]");
        System.out.println("       \\_/");
        System.out.println("     .-'-'-.");
        System.out.println("    /       \\");
        System.out.println("   |  |   |  |      " + "Willkommen bei Robo-Wars " + name + "!");
        System.out.println("   |  |   |  |");
        System.out.println("    \\_______/");
        System.out.println("       | |");
        System.out.println("       | |");
        System.out.println("      /   \\");
    }
    public static Boolean kampf(String roboName, String enemyName) {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 1) {
            System.out.print(roboName);
            return true;
        } else {
            System.out.print(enemyName);
            return false;
        }
    }
    public static String printBoard(int[][]board, int pos_X, int pos_Y, String roboName, int enemy_X, int enemy_Y, String enemyName) {
        String win = "";
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (pos_X == enemy_X && pos_Y == enemy_Y) {
                    if(kampf(roboName, enemyName)) {
                        win = roboName + " gewinnt!";
                    } else {
                        win = roboName + " verliert!";
                    }
                } else if (x == pos_X && y == pos_Y) {
                    System.out.print(roboName);
                } else if (x == enemy_X && y == enemy_Y) {
                    System.out.print(enemyName);
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        return win;
    }
    public static String roboName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte wählen Sie Ihren Roboter aus:");
        System.out.println("Geben Sie 1 ein für X");
        System.out.println("Geben Sie 2 ein für #");
        System.out.println("Geben Sie 3 ein für $");

        int roboAuswahl = 0;
        while (roboAuswahl <= 0 || roboAuswahl >= 4) {
            roboAuswahl = scanner.nextInt();
        }

        if (roboAuswahl == 1) {
            return "[X]";
        } else if (roboAuswahl == 2) {
            return "[#]";
        } else {
            return "[$]";
        }

    }


}