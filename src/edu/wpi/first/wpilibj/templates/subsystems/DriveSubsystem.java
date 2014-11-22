
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    RobotDrive drivetrain = RobotMap.drivetrain;
    Joystick leftStick = RobotMap.leftStick, rightStick = RobotMap.rightStick;
    
    public void initDefaultCommand() {
    }
    
    public void init() {
        drivetrain.stopMotor();
        
        drivetrain.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        drivetrain.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        drivetrain.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }
    
    public void autoDrive(double leftValue, double rightValue) {
        drivetrain.tankDrive(leftValue, rightValue);
    }
    
    public void telopDrive() {
        drivetrain.arcadeDrive(leftStick, true);
    }
}

