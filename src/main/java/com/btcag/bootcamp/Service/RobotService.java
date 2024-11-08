package com.btcag.bootcamp.Service;

import com.btcag.bootcamp.Enums.Directions;

public class RobotService {
    public Enum<Directions> fromUserInput(int userchoice){
        switch (userchoice) {
            case 8 :
                return Directions.NORD;
            case 9:
                return Directions.NORDOST;
            case 6 :
                return Directions.OST;
            case 3:
                return Directions.SUEDOST;
            case 2:
                return Directions.SUED;
            case 1 :
                return Directions.SUEDWEST;
            case 4:
                return Directions.WEST;
            case 7:
                return Directions.NORDWEST;
            case 5:
                return Directions.NOMOVE;

        }
        return Directions.NOMOVE;
    }

}
