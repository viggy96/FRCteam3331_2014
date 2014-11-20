/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author vignesh
 */
public class autowinchCommand extends CommandBase {
    boolean finished = false;
    DigitalInput catapultSwitch = RobotMap.catapultSwitch;
    
    public autowinchCommand() {
        requires(WinchSubsystem);
        requires(PneumaticSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        WinchSubsystem.init();
        finished = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        WinchSubsystem.winch();
	finished = catapultSwitch.get();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
        PneumaticSubsystem.closeLatch();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
