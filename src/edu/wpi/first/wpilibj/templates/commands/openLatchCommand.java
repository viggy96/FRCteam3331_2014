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
public class openLatchCommand extends CommandBase {
    
    public openLatchCommand() {
        requires(PneumaticSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        PneumaticSubsystem.initState();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        PneumaticSubsystem.openLatch();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return PneumaticSubsystem.state();
    }

    // Called once after isFinished returns true
    protected void end() {
        PneumaticSubsystem.initState();
        PneumaticSubsystem.compressor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        PneumaticSubsystem.compressor();
    }
}
