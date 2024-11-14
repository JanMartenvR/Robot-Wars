package com.btcag.bootcamp.Views;

import com.btcag.bootcamp.Models.Robot;

import java.util.Random;

public class DisplayWinnerView {
    public static void display(Robot spieler, Robot gegner) {
        if (spieler.getHp() <= 0) {
            System.out.println(gegner.getRobotName() + " gewinnt!");
            spieler.setKnockedOut(true);
        } else if (gegner.getHp() <= 0) {
            System.out.println(spieler.getRobotName() + " gewinnt!");
            gegner.setKnockedOut(true);
        }
    }
}
