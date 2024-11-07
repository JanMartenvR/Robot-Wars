package com.btcag.bootcamp;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class MoveRobotView {
    public static void turn(Robot spieler) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie an in welche Richtung Sie sich bewegen wollen (WASD) X für position halten:");
        String move = scanner.next();
        move = move.toLowerCase(Locale.ROOT);
        if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "s")) {
            spieler.setY(spieler.getY() + spieler.getMovementspeed());
        } else if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "a")) {
            spieler.setX(spieler.getX() - spieler.getMovementspeed());
        } else if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "w")) {
            spieler.setY(spieler.getY() - spieler.getMovementspeed());
        } else if (Battlefield.validTurn(move, spieler.getX(), spieler.getY()) && Objects.equals(move, "d")) {
            spieler.setX(spieler.getX() + spieler.getMovementspeed());
        } else if (Objects.equals(move, "x")) {

        } else {
            System.out.println("Input ungültig.");
        }
    }
}
