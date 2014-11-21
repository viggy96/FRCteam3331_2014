
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author vignesh
 */
public class AutoCommandGroup extends CommandGroup {
    
    public AutoCommandGroup() {
        addParallel(new autoClawArmDownCommand());
        addParallel(new CompressorCommand());
        addSequential(new autoWinchCommand());
        addSequential(new autoUnwinchCommand());
        addSequential(new openLatchCommand());
        addSequential(new AutoDriveCommand());
        
    }
}
