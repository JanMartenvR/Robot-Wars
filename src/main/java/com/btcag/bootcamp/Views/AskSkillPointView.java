package com.btcag.bootcamp.Views;

import com.btcag.bootcamp.Models.Robot;

import java.util.Scanner;

public class AskSkillPointView {
    public static void setStats(Robot spieler) {
        int spend = 0;
        int skillpoints = 10;
        Scanner scanner = new Scanner(System.in);
        char[] points = new char[10];
        while (spend < skillpoints) {
            System.out.println("Bitte verteilen Sie 10 Skillpoints auf die folgen Attribute Ihres Roboters: \n Bewegungsrate: "+ spieler.getMovementspeed() + "\n Schaden: "+ spieler.getDamage() + "\n Gesundheit: " + spieler.getHp() + "\n Reichweite: " + spieler.getRange());
            System.out.println("Drücken Sie m für Movementspeed, d für Damage, g für Gesundheit und r für Reichweite: ");
            String input = scanner.next();
            input.charAt(spend) = points[spend];
            spend += 1;
        }
    }
    public static void display(Robot spieler) {
        System.out.println("Attribute Ihres Roboters: \n Bewegungsrate: "+ spieler.getMovementspeed() + "\n Schaden: "+ spieler.getDamage() + "\n Gesundheit: " + spieler.getHp() + "\n Reichweite: " + spieler.getRange());
    }
}