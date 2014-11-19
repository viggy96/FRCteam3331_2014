
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.clawArmDownCommand;
import edu.wpi.first.wpilibj.templates.commands.clawArmUpCommand;
import edu.wpi.first.wpilibj.templates.commands.closeClawCommand;
import edu.wpi.first.wpilibj.templates.commands.closeLatchCommand;
import edu.wpi.first.wpilibj.templates.commands.openClawCommand;
import edu.wpi.first.wpilibj.templates.commands.openLatchCommand;
import edu.wpi.first.wpilibj.templates.commands.unwinchCommand;
import edu.wpi.first.wpilibj.templates.commands.winchCommand;
import edu.wpi.first.wpilibj.templates.subsystems.PneumaticSubsystem;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick leftStick = RobotMap.leftStick, rightStick = RobotMap.rightStick;
    Button trigger = new JoystickButton(leftStick, 1),
            clawUp = new JoystickButton(leftStick, 3),
            clawDown = new JoystickButton(leftStick, 2),
            clawOpen = new JoystickButton(leftStick, 4),
            clawClose = new JoystickButton(leftStick, 5),
            latchClose = new JoystickButton(rightStick, 6),
            winch = new JoystickButton(rightStick, 11),
            unwinch = new JoystickButton(rightStick, 10);
    
    public OI() {
        trigger.whenPressed(new openLatchCommand());
        latchClose.whenPressed(new closeLatchCommand());
        
        clawUp.whileHeld(new clawArmUpCommand());
        clawDown.whileHeld(new clawArmDownCommand());
        clawOpen.whenPressed(new openClawCommand());
        clawClose.whenPressed(new closeClawCommand());
        
        winch.whileHeld(new winchCommand());
        unwinch.whileHeld(new unwinchCommand());
    }
    
    // button.whenPressed(new ExampleCommand());
    // button.whileHeld(new ExampleCommand());
    // button.whenReleased(new ExampleCommand());
}

