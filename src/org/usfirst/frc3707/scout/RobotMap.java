// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3707.scout;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftMotor;
    public static SpeedController driveTrainrightMotor;
    public static RobotDrive driveTrainRobotDrive21;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftMotor = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "leftMotor", (Talon) driveTrainleftMotor);
        
        driveTrainrightMotor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "rightMotor", (Talon) driveTrainrightMotor);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainleftMotor, driveTrainrightMotor);
        
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
