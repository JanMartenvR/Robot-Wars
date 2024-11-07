package com.btcag.bootcamp;

import java.util.Random;

public class DisplayWinnerView {
    public static void display(Robot spieler, Robot gegner) {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 1) {
            System.out.print(spieler.getRobotName() + " gewinnt!");
        } else {
            System.out.print(gegner.getRobotName() + " gewinnt!");
        }
    }
}
