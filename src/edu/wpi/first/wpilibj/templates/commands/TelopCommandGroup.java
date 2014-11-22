
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author vignesh
 */
public class TelopCommandGroup extends CommandGroup {
    
    public TelopCommandGroup() {
        addParallel(new TelopDriveCommand());
        addParallel(new CompressorCommand());
    }
}
