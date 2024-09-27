package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        intro();

        String roboName = roboName();
        System.out.println("Sie haben folgenden Robotor ausgewählt: " + roboName);


        int breite = 15;
        int hoehe = 10;
        int pos_X = 14;
        int pos_Y = 9;

        printBoard(breite, hoehe, pos_X, pos_Y, roboName);

    }
    public static void intro () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Namen ein:");
        String name = scanner.nextLine();
        System.out.println("     ,     ,");
        System.out.println("    [o]---[o]");
        System.out.println("       \\_/");
        System.out.println("     .-'-'-.");
        System.out.println("    /       \\");
        System.out.println("   |  |   |  |      " + "Wilkommen bei Robo-Wars " + name + "!");
        System.out.println("   |  |   |  |");
        System.out.println("    \\_______/");
        System.out.println("       | |");
        System.out.println("       | |");
        System.out.println("      /   \\");
    }
    public static void printBoard(int breite, int hoehe, int pos_X, int pos_Y, String roboName) {

        for (int y = 0; y < hoehe; y++) {
            for (int x = 0; x < breite; x++) {
                if (x == pos_X && y == pos_Y) {
                    System.out.print(roboName);
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
    public static String roboName () {
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