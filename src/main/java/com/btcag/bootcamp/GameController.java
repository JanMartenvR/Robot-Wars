package com.btcag.bootcamp;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

//Reader Klasse für Nutzereingaben
// Board kann aus Feldern bestehen mit eigenschaften, und koordinaten

public class GameController {
    public static int[][] board = new int[10][15];

    public static void main(String[] args) {
        IntroScreenView.display();
        Robot spieler = new Robot("x", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        Robot gegner = new Robot("[Z]", 1, 9, 9, 1, 1, 1, 1, 1, 1, 1);
        spieler.setRobotName(AskRobotNameView.display());

        System.out.println("Sie haben folgenden Robotor ausgewählt: " + spieler.getRobotName());,

        printBoard(spieler, gegner);
        while (true) {
            turn(spieler);
            if (spieler.getX() == gegner.getX() && spieler.getY() == gegner.getY()) {
                kampf(spieler, gegner);
                break;
            }
            printBoard(spieler, gegner);
        }

    }

    public static void turn(Robot spieler) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie an in welche Richtung Sie sich bewegen wollen (WASD) X für position halten:");
        String move = scanner.next();
        move = move.toLowerCase(Locale.ROOT);
        if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "s")) {
            spieler.setY(spieler.getY() + spieler.getMovementspeed());
        } else if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "a")) {
            spieler.setX(spieler.getX() - spieler.getMovementspeed());
        } else if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "w")) {
            spieler.setY(spieler.getY() - spieler.getMovementspeed());
        } else if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "d")) {
            spieler.setX(spieler.getX() + spieler.getMovementspeed());
        } else if (Objects.equals(move, "x")) {

        } else {
            System.out.println("Input ungültig.");
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



    public static void kampf(Robot spieler, Robot gegner) {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 1) {
            System.out.print(spieler.getRobotName() + " gewinnt!");
        } else {
            System.out.print(gegner.getRobotName() + " gewinnt!");
        }
    }

    public static void printBoard(Robot spieler, Robot gegner) {

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (x == spieler.getX() && y == spieler.getY()) {
                    System.out.print(spieler.getRobotName());
                } else if (x == gegner.getX() && y == gegner.getY()) {
                    System.out.print(gegner.getRobotName());
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }

    }

}