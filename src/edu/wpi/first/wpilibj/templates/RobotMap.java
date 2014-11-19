package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {  
    public static final Joystick leftStick = new Joystick(1), rightStick = new Joystick(2); 
    public static final RobotDrive drivetrain = new RobotDrive(1, 2, 3, 4);
    
    public static final Compressor compressor = new Compressor(1, 1); // pressure switch, compressor relay
    public static final DoubleSolenoid clawPiston = new DoubleSolenoid(1, 2); // forward, reverse
    public static final DoubleSolenoid latchPiston = new DoubleSolenoid(5, 6); // forward, reverse 
    
    public static final Jaguar leftArmMotor = new Jaguar(5);
    public static final Jaguar rightArmMotor = new Jaguar(6);
    
    public static final Jaguar winchMotor = new Jaguar(7);
}
