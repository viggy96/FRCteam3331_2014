/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author vignesh
 */
public class ClawArmSubsystem extends Subsystem {
    Jaguar leftArmMotor = RobotMap.leftArmMotor, rightArmMotor = RobotMap.rightArmMotor;
    
    public void initDefaultCommand() {
        leftArmMotor.stopMotor();
        rightArmMotor.stopMotor();
    }
    
    public void init() {
        leftArmMotor.stopMotor();
        rightArmMotor.stopMotor();
    }
    
    
    public void clawArmUp() {
        leftArmMotor.set(-0.75);
        rightArmMotor.set(-0.75);
    }
    
    public void clawArmDown() {
        leftArmMotor.set(0.75);
        rightArmMotor.set(0.75);
    }
}
