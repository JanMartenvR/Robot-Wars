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

        int y = 0;
        int x = 0;

        while (y < 10){
            while (x < 15){
                System.out.print(" "+ x + " ");
                x++;
                if (x > 14){
                    System.out.println();
                }
            }
            x=0;
            while(x < 15){
                System.out.print("[ ]");
                x++;
            }
            System.out.println();
            y++;
        }
        System.out.println("Der Robotor befindet sich auf:");
    }
}