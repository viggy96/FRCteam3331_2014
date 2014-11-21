
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author vignesh
 */
public class AutoCommandGroup extends CommandGroup {
    
    public AutoCommandGroup() {
        addParallel(new autoWinchCommand());
        addParallel(new autoClawArmDownCommand());
        addSequential(new autoUnwinchCommand());
        addSequential(new openLatchCommand());
        addSequential(new AutoDriveCommand());
        addParallel(new CompressorCommand());
    }
}
