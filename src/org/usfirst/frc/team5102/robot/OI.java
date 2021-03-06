package org.usfirst.frc.team5102.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	
	XboxController driveController = new XboxController(RobotMap.driveControllerPort);
	
	Joystick joystick = new Joystick(0);
	
	Button testButton = new JoystickButton(joystick, 1);
	
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public OI()
	{
		
	}
	
	/**
	 * This method should act as a wrapper for {@link Xbox}
	 * e.g. return driveController.getLeftStick(); 	
	 * 
	 * @return	Should return a double value from the axis.
	 */
	public double getDriveControllerLeftStick()
	{
		double toReturn = 0;
		
		return toReturn;
	}
	
	/**
	 * This method should act as a wrapper for {@link XboxController}
	 * 	e.g. return driveController.getRightStick();
	 * 
	 * @return	Should return a double value from the axis.
	 */
	public double getDriveControllerRigthStick()
	{
		return 0;
	}
	
	
	/** Make an arm xboxController object, too. Then make a "driveControllerLeftStick" equivalent for 
	 * the arm joystick */
	
	
}
