package com.btcag.bootcamp.Models;

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
    private boolean knockedOut;

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

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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


    public Robot(String robotName, int damageZone, int x, int y, int hp, int energy, int shield, int movementspeed, int damage, int range, int accuracy, boolean knockedOut) {
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
        this.knockedOut = knockedOut;
    }

    public void move() {

    }

    public static void attack(Robot spieler, Robot gegner) {
        gegner.setHp(gegner.getHp() - spieler.getDamage());
    }

}
