package com.btcag.bootcamp.Views;

import com.btcag.bootcamp.Models.Robot;

import java.util.Scanner;

public class AskSkillPointView {
    public static void setStats(Robot spieler) {
        int spend = 0;
        int skillpoints = 10;
        Scanner scanner = new Scanner(System.in);
        while (spend < skillpoints) {
            System.out.println("Bitte verteilen Sie 10 Skillpoints auf die folgen Attribute Ihres Roboters: \n Bewegungsrate: "+ spieler.getMovementspeed() + "\n Schaden: "+ spieler.getDamage() + "\n Gesundheit: " + spieler.getHp() + "\n Reichweite: " + spieler.getRange());
            System.out.println("Drücken Sie m für Movementspeed, d für Damage, g für Gesundheit und r für Reichweite. Sie können noch "+(skillpoints-spend)+" Punkte verteilen.");
            String input = scanner.next();
            switch (input) {
                case "m" -> {
                    spieler.setMovementspeed(spieler.getMovementspeed() + 1);
                    spend += 1;
                }
                case "d" -> {
                    spieler.setDamage(spieler.getDamage() + 1);
                    spend += 1;
                }
                case "g" -> {
                    spieler.setHp(spieler.getHp() + 1);
                    spend += 1;
                }
                case "r" -> {
                    spieler.setRange(spieler.getRange() + 1);
                    spend += 1;
                }
                default -> System.out.println("Eingabe ungültig.");
            }

        }
    }
    public static void display(Robot spieler) {
        System.out.println("Attribute Ihres Roboters: \n Bewegungsrate: "+ spieler.getMovementspeed() + "\n Schaden: "+ spieler.getDamage() + "\n Gesundheit: " + spieler.getHp() + "\n Reichweite: " + spieler.getRange());
    }
}