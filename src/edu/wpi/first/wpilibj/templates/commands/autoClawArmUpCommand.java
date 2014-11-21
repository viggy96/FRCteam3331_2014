/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author vignesh
 */
public class autoClawArmUpCommand extends CommandBase {
    
    public autoClawArmUpCommand() {
        requires(ClawArmSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        ClawArmSubsystem.init();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        ClawArmSubsystem.clawArmUp();
        setTimeout(3);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        ClawArmSubsystem.init();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        ClawArmSubsystem.init();
    }
}
