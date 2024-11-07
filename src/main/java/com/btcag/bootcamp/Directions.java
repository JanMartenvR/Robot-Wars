package com.btcag.bootcamp;

public enum Directions {
    NORD(0,-1),
    NORDOST(1,-1),
    OST(1,0),
    SUEDOST(1,1),
    SUED(0,1),
    SUEDWEST(-1,1),
    WEST(-1,0),
    NORDWEST(-1,-1);

    private final int x;
    private final int y;


    Directions(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
