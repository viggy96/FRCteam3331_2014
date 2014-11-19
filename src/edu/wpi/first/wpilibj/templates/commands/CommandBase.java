package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.subsystems.ClawArmSubsystem;
import edu.wpi.first.wpilibj.templates.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.templates.subsystems.PneumaticSubsystem;
import edu.wpi.first.wpilibj.templates.subsystems.WinchSubsystem;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static DriveSubsystem DriveSubsystem = new DriveSubsystem();
    public static PneumaticSubsystem PneumaticSubsystem = new PneumaticSubsystem();
    public static WinchSubsystem WinchSubsystem = new WinchSubsystem();
    public static ClawArmSubsystem ClawArmSubsystem = new ClawArmSubsystem();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        DriveSubsystem.init();
        PneumaticSubsystem.init();
        WinchSubsystem.init();
        ClawArmSubsystem.init();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData("Drive Subsystem", DriveSubsystem);
        SmartDashboard.putData("Pneumatic Subsystem", PneumaticSubsystem);
        SmartDashboard.putData("Winch System", WinchSubsystem);
        SmartDashboard.putData("Claw Arm Subsystem", ClawArmSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
