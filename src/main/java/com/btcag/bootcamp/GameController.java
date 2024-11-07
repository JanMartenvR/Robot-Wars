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
            MoveRobotView.turn(spieler);
            if (spieler.getX() == gegner.getX() && spieler.getY() == gegner.getY()) {
                DisplayWinnerView.display(spieler, gegner);
                break;
            }
            BattlefieldView.display(robots, battlefield);
        }

    }

}