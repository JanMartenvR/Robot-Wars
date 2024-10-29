package com.btcag.bootcamp;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Start {
    public static int[][] board = new int[10][15];

    public static void main(String[] args) {
        intro();
        Roboter spieler = new Roboter("x",1,1,1,1,1,1,1,1,1,1);
        Roboter gegner = new Roboter("[Z]",1,9,9,1,1,1,1,1,1,1);
        spieler.setRobotName(roboNames());

        System.out.println("Sie haben folgenden Robotor ausgewählt: " + spieler.getRobotName());
        boardInit();
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

    public static void turn(Roboter spieler) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie an in welche Richtung Sie sich bewegen wollen (WASD) X für position halten:");
        String move = scanner.next();
        move = move.toLowerCase(Locale.ROOT);
        if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "s")) {
            spieler.setY(spieler.getY()+ spieler.getMovementspeed());
        } else if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "a")) {
            spieler.setX(spieler.getX()- spieler.getMovementspeed());
        } else if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "w")) {
            spieler.setY(spieler.getY()- spieler.getMovementspeed());
        } else if (validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "d")) {
            spieler.setX(spieler.getX()+ spieler.getMovementspeed());
        } else if (Objects.equals(move, "x")) {

        } else {
            System.out.println("Input ungültig.");
        }
    }

    public static void boardInit() {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                board[y][x] = 0;
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

    public static void intro() {
        String name;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Bitte gebe einen Namen ein (3-15 Zeichen):");
            name = scanner.nextLine();
        } while (name.length() <= 2 || name.length() >= 16);


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

    public static void kampf(Roboter spieler, Roboter gegner) {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 1) {
            System.out.print(spieler.getRobotName() + " gewinnt!");
        } else {
            System.out.print(gegner.getRobotName() + " gewinnt!");
        }
    }

    public static void printBoard(Roboter spieler, Roboter gegner) {

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

    public static String roboNames() {
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