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
        while ( roboAuswahl <= 0 || roboAuswahl >= 4){
            roboAuswahl = scanner.nextInt();
        }
        char roboName = 'X';
        if (roboAuswahl == 2){
            roboName = '#';
        } else if (roboAuswahl == 3) {
            roboName = '$';
        } else {
            roboName = 'X';
        }
        System.out.println("Sie haben folgenden Robotor ausgewählt: " + roboName);

        int y = 1;
        int x = 1;
        int pos_x = 3;
        int pos_y = 7;

        while (y < 11){
            x=1;
            //Ausgeben des Robotors
            while(y==pos_y){
                while(x==pos_x){
                    System.out.print("("+roboName+")");
                    x++;
                    break;
                }
                break;
            }
            //Ausgeben der Zeilen
            while(x < 16){
                System.out.print("[ ]");
                x++;
            }
            // Zeilenumbruch
            System.out.println();
            y++;
        }


        System.out.println("Der Robotor befindet sich auf: x = "+pos_x+ " und y = "+pos_y);
    }
}