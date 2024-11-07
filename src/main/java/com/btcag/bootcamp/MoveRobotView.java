package com.btcag.bootcamp;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class MoveRobotView {
    public static void turn(Robot spieler) {
        int moves = 0;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie an in welche Richtung Sie sich bewegen wollen (WASD) X für position halten:");
        String move = scanner.next();
        move = move.toLowerCase(Locale.ROOT);
        if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "s")) {
            spieler.setY(spieler.getY() + 1);
            moves += 1;
        } else if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "a")) {
            spieler.setX(spieler.getX() - 1);
            moves += 1;
        } else if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "w")) {
            spieler.setY(spieler.getY() - 1);
            moves += 1;
        } else if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "d")) {
            spieler.setX(spieler.getX() + 1);
            moves += 1;
        } else if (Objects.equals(move, "x")) {
            moves += 1;
        } else {
            System.out.println("Input ungültig.");
        }
        } while (moves < spieler.getMovementspeed());
    }
}
