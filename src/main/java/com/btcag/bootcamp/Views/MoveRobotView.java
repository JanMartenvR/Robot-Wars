package com.btcag.bootcamp.Views;

import com.btcag.bootcamp.Enums.Directions;
import com.btcag.bootcamp.Models.Battlefield;
import com.btcag.bootcamp.Models.Robot;
import com.btcag.bootcamp.Service.RobotService;

import java.util.Objects;
import java.util.Scanner;

public class MoveRobotView {
    public static Directions turn() {
        Scanner scanner = new Scanner(System.in);
        Directions direction;
        System.out.println("Bitte geben Sie an in welche Richtung Sie sich bewegen wollen (NUMPad) 5 für position halten:");
        do {
        direction = (Directions) RobotService.fromUserInput(scanner.nextInt());
        } while (null == direction);
        return direction;
    }
}