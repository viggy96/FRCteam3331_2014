
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author bradmiller
 */
public class TelopDriveCommand extends CommandBase {
    
    public TelopDriveCommand() {
       requires(DriveSubsystem); 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        DriveSubsystem.init();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {   
        DriveSubsystem.telopDrive();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        //DriveSubsystem.telopDrive();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        DriveSubsystem.telopDrive();
    }
}
