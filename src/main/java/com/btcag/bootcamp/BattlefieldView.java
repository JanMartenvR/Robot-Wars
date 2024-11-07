package com.btcag.bootcamp;

public class BattlefieldView {

    public static void display(robots Robot[], battlefield) {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (x == spieler.getX() && y == spieler.getY()) {
                    System.out.print(spieler.getRobotName());
                } else if (x == gegner.getX() && y == gegner.getY()) {
                    System.out.print(gegner.getRobotName());
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}
