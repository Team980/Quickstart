package com.team980.quickstart;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * This class should not be modified in any way, except to change the Robot class!
 */
public final class Main {

    private Main() {
    }

    /**
     * Main initialization function. Do not perform any initialization here.
     * If you change your main robot class, change the parameter type.
     */
    public static void main(String... args) {
        RobotBase.startRobot(Robot::new);
    }
}