package com.btcag.bootcamp.Interfaces;

import com.btcag.bootcamp.Entities.Robot;

public interface IRobotService {
    Robot[] robotList();
    Robot robotID(int robotId);
    Robot createRobot(String name, int health, int damage, int range, int movementRate);
}
