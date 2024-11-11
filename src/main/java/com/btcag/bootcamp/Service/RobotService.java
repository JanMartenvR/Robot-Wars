package com.btcag.bootcamp.Service;

import com.btcag.bootcamp.Enums.Directions;

public class RobotService {
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
            case 5 -> Directions.NOMOVE;
            default -> Directions.NOMOVE;
        };
    }

}