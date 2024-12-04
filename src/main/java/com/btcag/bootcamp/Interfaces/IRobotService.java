package com.btcag.bootcamp.Interfaces;

import com.btcag.bootcamp.Models.Robot;

public interface IRobotService {
    int[] robotList();
    int robotID();
    Robot createRobot();
}
