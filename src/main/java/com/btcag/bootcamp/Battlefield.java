package com.btcag.bootcamp;

public class Battlefield {
    private int width;
    private int height;
    private int[][]map;


    private void boardInit() {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                board[y][x] = 0;
            }
        }
    }



}
