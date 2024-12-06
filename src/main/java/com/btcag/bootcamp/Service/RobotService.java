package com.btcag.bootcamp.Service;

import com.btcag.bootcamp.Enums.Directions;
import com.btcag.bootcamp.Interfaces.IRobotService;
import com.btcag.bootcamp.Models.Robot;
import com.btcag.bootcamp.Entities.Robot;

public class RobotService implements IRobotService {
    public static Enum<Directions> fromUserInput(int userChoice){
        return switch (userChoice) {
            case 8 -> Directions.NORD;
            case 9 -> Directions.NORDOST;
            case 6 -> Directions.OST;
            case 3 -> Directions.SUEDOST;
            case 2 -> Directions.SUED;
            case 1 -> Directions.SUEDWEST;
            case 4 -> Directions.WEST;
            case 7 -> Directions.NORDWEST;
            default -> Directions.NOMOVE;
        };
    }
    public static boolean inRange(Robot spieler, Robot gegner) {
        if (spieler.getX() + spieler.getRange() >= gegner.getX()
        && gegner.getX() >= spieler.getX()
        && (spieler.getY() + spieler.getRange() >= gegner.getY()
                && gegner.getY() >= spieler.getY())) {
            return true;
        } else if ((spieler.getX() + spieler.getRange() >= gegner.getX()
                && gegner.getX() >= spieler.getX())
                && (spieler.getY() - spieler.getRange() <= gegner.getY()
                && gegner.getY() <= spieler.getY())) {
            return true;
        } else if ((spieler.getX() - spieler.getRange() <= gegner.getX()
                && gegner.getX() <= spieler.getX())
                && (spieler.getY() + spieler.getRange() >= gegner.getY()
                && gegner.getY() >= spieler.getY())) {
            return true;
        } else if ((spieler.getX() - spieler.getRange() <= gegner.getX()
                && gegner.getX() <= spieler.getX())
                && (spieler.getY() - spieler.getRange() <= gegner.getY()
                && gegner.getY() <= spieler.getY())) {
            return true;
        }
        return false;
    }


    @Override
    public Robot[] robotList() {
        //Muss man nicht wenigstens die SpielId mitgeben?
        return new Robot[0];
    }

    @Override
    public Robot robotID(int robotId) {
        return new Robot();
    }

    @Override
    public Robot createRobot(String name, int health, int damage, int range, int movementRate) {
        return new Robot();
    }

}
