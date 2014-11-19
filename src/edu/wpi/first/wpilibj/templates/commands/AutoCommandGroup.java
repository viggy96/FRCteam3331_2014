
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author vignesh
 */
public class AutoCommandGroup extends CommandGroup {
    
    public AutoCommandGroup() {
        addParallel(new autowinchCommand());
        addParallel(new autoClawArmDownCommand());
        addSequential(new openLatchCommand());
        addSequential(new AutoDriveCommand());
        addParallel(new CompressorCommand());
    }
}
