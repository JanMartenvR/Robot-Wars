package com.btcag.bootcamp;

import java.util.Objects;

public class Battlefield {
    private int width;
    private int height;
    private int[][]map;

    public Battlefield(int width, int height) {
        this.width = width;
        this.height = height;
        this.map = new int[width][height];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    private void boardInit() {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                map[y][x] = 0;
            }
        }
    }

    public static boolean validTurn(String move, int pos_X, int pos_Y) {
        if (Objects.equals(move, "s") && pos_Y + 1 <= 9) {
            return true;
        } else if (Objects.equals(move, "a") && pos_X - 1 >= 0) {
            return true;
        } else if (Objects.equals(move, "w") && pos_Y - 1 >= 0) {
            return true;
        } else if (Objects.equals(move, "d") && pos_X + 1 <= 14) {
            return true;
        } else if (Objects.equals(move, "x")) {
            return true;
        } else {
            return false;
        }
    }



}
