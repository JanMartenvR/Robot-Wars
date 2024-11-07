package com.btcag.bootcamp;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//Reader Klasse für Nutzereingaben
// Board kann aus Feldern bestehen mit eigenschaften, und koordinaten

public class GameController {
    public static int[][] board = new int[10][15];

    public static void main(String[] args) {
        IntroScreenView.display();
        Battlefield battlefield = new Battlefield(15, 10);
        Robot spieler = new Robot("x", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        Robot gegner = new Robot("[Z]", 1, 9, 9, 1, 1, 1, 1, 1, 1, 1);
        spieler.setRobotName(AskRobotNameView.display());
        List<Robot> robots = new ArrayList<>();
        robots.add(spieler);
        robots.add(gegner);

        System.out.println("Sie haben folgenden Robotor ausgewählt: " + spieler.getRobotName());

        BattlefieldView.display(robots, battlefield);
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

}