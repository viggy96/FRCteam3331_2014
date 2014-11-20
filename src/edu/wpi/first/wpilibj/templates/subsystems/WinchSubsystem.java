
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 */
public class WinchSubsystem extends Subsystem {
    
    Jaguar winchMotor = RobotMap.winchMotor;
    DigitalInput catapultSwitch = RobotMap.catapultSwitch;
    
    public void initDefaultCommand() {
        winchMotor.stopMotor();
    }
    
    public void init() {
        winchMotor.stopMotor();
    }
    
    public void winch() {
        winchMotor.set(1);
    }
    
    public void unwinch() {
        winchMotor.set(-1);
    }
}

