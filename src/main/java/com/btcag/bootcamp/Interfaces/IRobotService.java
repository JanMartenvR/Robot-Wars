package com.btcag.bootcamp.Interfaces;

import com.btcag.bootcamp.Models.Robot;

public interface IRobotService {
    Robot[] robotList();
    int robotID();
    void createRobot(String name, int health, int damage, int range, int movementRate);
}
