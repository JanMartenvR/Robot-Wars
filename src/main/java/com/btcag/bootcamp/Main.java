package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("Bitte wählen Sie Ihren Roboter aus:");
        System.out.println("Geben Sie 1 ein für X");
        System.out.println("Geben Sie 2 ein für #");
        System.out.println("Geben Sie 3 ein für $");

        int roboAuswahl = 0;
        while (roboAuswahl <= 0 || roboAuswahl >= 4) {
            roboAuswahl = scanner.nextInt();
        }
        String roboName = "X";
        int schleifencontrolle = 1;
        while (roboAuswahl * schleifencontrolle == 1) {
            roboName = "[X]";
            schleifencontrolle = 0;
        }
        while (roboAuswahl * schleifencontrolle == 2) {
            roboName = "[#]";
            schleifencontrolle = 0;
        }
        while (roboAuswahl * schleifencontrolle == 3) {
            roboName = "[$]";
            schleifencontrolle = 0;
        }
        System.out.println("Sie haben folgenden Robotor ausgewählt: " + roboName);

        int breite = 15;
        int hoehe = 10;
        //Angabe von Position -1
        int pos_X = 14;
        int pos_Y = 9;
        String feld = "[ ]";

        int schleifenzaehler_hoehe = 0;
        while (schleifenzaehler_hoehe < hoehe) {
            int schleifenzaehler_breite = 0;
            while (schleifenzaehler_breite < breite) {
                feld = "[ ]";
                //Berechnung einer Variablen für die Position des Roboters
                int figur_pos = pos_Y * breite + pos_X;
                //Berechnung einer Variablen welche die aktuelle Position mitzählt
                int aktuelle_pos = schleifenzaehler_hoehe * breite + schleifenzaehler_breite;

                //Wenn die Schleife an der Position des Robotors angekommen ist, wird das zudruckende Objekt mit dem Robotor ersetzt.
                while (aktuelle_pos == figur_pos) {
                    feld = roboName;
                    aktuelle_pos++;
                }

                System.out.print(feld);
                schleifenzaehler_breite++;
            }
            System.out.println();
            schleifenzaehler_hoehe++;
        }


    }


}