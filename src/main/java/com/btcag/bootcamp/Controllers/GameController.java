package com.btcag.bootcamp.Controllers;


import com.btcag.bootcamp.Enums.Directions;
import com.btcag.bootcamp.Models.Battlefield;
import com.btcag.bootcamp.Models.Robot;
import com.btcag.bootcamp.Service.RobotService;
import com.btcag.bootcamp.Views.*;

import java.util.ArrayList;
import java.util.List;

import static com.btcag.bootcamp.Service.ConnectorDB.dbConnector.connect;
import static com.btcag.bootcamp.Service.ConnectorDB.dbConnector.createTable;


// Board kann aus Feldern bestehen mit eigenschaften, und koordinaten

public class GameController {
    public static void main(String[] args) {
        //connect();
        //createTable();
        IntroScreenView.display();
        Battlefield battlefield = new Battlefield(15, 10);
        String robotname = (AskRobotNameView.display());
        Robot spieler = new Robot(robotname, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, false);
        Robot gegner = new Robot("[Z]", 1, 9, 9, 7, 1, 1, 1, 1, 1, 1, false);
        AskSkillPointView.setStats(spieler);
        AskSkillPointView.display(spieler);
        List<Robot> robots = new ArrayList<>();
        robots.add(spieler);
        robots.add(gegner);
        System.out.println("Sie haben folgenden Robotor ausgewählt: " + spieler.getRobotName());

        BattlefieldView.display(robots, battlefield);
        while (!spieler.isKnockedOut() && !gegner.isKnockedOut()) {
            DisplayWinnerView.display(spieler, gegner);
            int move = 1;
            while (move <= spieler.getMovementspeed() && !spieler.isKnockedOut() && !gegner.isKnockedOut()) {
                Directions direction = MoveRobotView.turn();
                if (Battlefield.validTurn(direction, spieler)) {
                    spieler.setX(spieler.getX() + direction.getX());
                    spieler.setY(spieler.getY() + direction.getY());
                    move += 1;
                } else {
                    System.out.println("Zug ungültig.");
                }
                BattlefieldView.display(robots, battlefield);
                if (RobotService.inRange(spieler, gegner)) {
                    Robot.attack(spieler, gegner);
                    DisplayWinnerView.display(spieler, gegner);
                }
            }
        }

    }

}
