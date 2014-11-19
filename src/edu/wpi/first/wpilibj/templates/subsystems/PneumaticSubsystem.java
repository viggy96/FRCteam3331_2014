
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author vignesh
 */
public class PneumaticSubsystem extends Subsystem {

    Compressor compressor = RobotMap.compressor;
    DoubleSolenoid clawPiston = RobotMap.clawPiston, latchPiston = RobotMap.latchPiston;
    boolean finished = false;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void init() {
        clawPiston.set(DoubleSolenoid.Value.kOff);
        latchPiston.set(DoubleSolenoid.Value.kOff);
    }
    
    public void initState() {
        finished = false;
    }
    
    public void compressor() {
        if (compressor.getPressureSwitchValue() == false) compressor.start();
        else compressor.stop();
    }
    
    public void openClaw() {
        clawPiston.set(DoubleSolenoid.Value.kForward);
        finished = true;
    }
    
    public void closeClaw() {
        clawPiston.set(DoubleSolenoid.Value.kReverse);
        finished = true;
    }
    
    public void closeLatch() {
        latchPiston.set(DoubleSolenoid.Value.kForward);
        finished = true;
    }
    
    public void openLatch() {
        latchPiston.set(DoubleSolenoid.Value.kReverse);
        finished = true;
    }
    
    public boolean state() {
        return finished;
    }
}
