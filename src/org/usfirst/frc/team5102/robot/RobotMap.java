package org.usfirst.frc.team5102.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	/** Used for init'ing the drive XboxController */
	public static final int driveControllerPort = 0;

	/** Used for init'ing the arm XboxController. */
	public static final int armControllerPort = 1;

	//Drive
	public static final int leftDriveMotor1 = 0;
	public static final int leftDriveMotor2 = 1;
	public static final int leftDriveMotor3 = 2;
	public static final int rightDriveMotor1 = 3;
	public static final int rightDriveMotor2 = 4;
	public static final int rightDriveMotor3 = 5;
	
	// TODO: Keep adding everything to here.
	
}
