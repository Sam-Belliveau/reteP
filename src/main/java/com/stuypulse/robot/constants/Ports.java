/************************ PROJECT PHIL ************************/
/* Copyright (c) 2023 StuyPulse Robotics. All rights reserved.*/
/* This work is licensed under the terms of the MIT license.  */
/**************************************************************/

package com.stuypulse.robot.constants;

/** This file contains the different ports of motors, solenoids and sensors */
public interface Ports {
    public interface Gamepad {
        int DRIVER = 0;
        int OPERATOR = 1;
        int DEBUGGER = 2;
    }

    public interface Swerve {
        public interface FrontRight {
            int DRIVE = 10;
            int TURN = 11;
        }

        public interface FrontLeft {
            int DRIVE = 12;
            int TURN = 13;
        }
        
        public interface BackLeft {
            int DRIVE = 14;
            int TURN = 15;
        }
        
        public interface BackRight {
            int DRIVE = 16;
            int TURN = 17;
        }
    }

    public interface Arm {
        int LEFT = 20;
        int RIGHT = 21;
    }

    public interface Elevator {
        int LEFT = 30;
        int RIGHT = 31;
    }

    public interface Wrist {
        int MOTOR = 40;
    }

    public interface Intake {
        int MOTOR = 50;
    }
}
