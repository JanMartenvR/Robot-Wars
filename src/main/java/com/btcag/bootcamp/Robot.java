package com.btcag.bootcamp;

public class Robot {
    private String robotName;
    private int x;
    private int y;
    private Coordinates coords;
    private int hp;
    private int energy;
    private int shield;
    private int movementspeed;
    private int damage;
    private int range;
    private int damageZone;
    private int accuracy;

    public Coordinates getCoords() {
        return coords;
    }

    public void setCoords(Coordinates coords) {
        this.coords = coords;
    }

    public String getRobotName() {
        return this.robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMovementspeed() {
        return movementspeed;
    }

    public void setMovementspeed(int movementspeed) {
        this.movementspeed = movementspeed;
    }

    public Robot(String robotName, int damageZone, int x, int y, int hp, int energy, int shield, int movementspeed, int damage, int range, int accuracy) {
        this.robotName = robotName;
        this.damageZone = damageZone;
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.energy = energy;
        this.shield = shield;
        this.movementspeed = movementspeed;
        this.damage = damage;
        this.range = range;
        this.accuracy = accuracy;
    }

    public void move() {

    }

    public void attack() {

    }

}
