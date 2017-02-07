package org.usfirst.frc.team5102.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem 
{
	public static RobotDrive robotDrive;

	
	leftDriveMotors = new MultiSpeedController(
			new Talon(RobotMap.leftDriveMotor1),
			new Talon(RobotMap.leftDriveMotor2),
			new Talon(RobotMap.leftDriveMotor3));
	
	rightDriveMotors = new MultiSpeedController(
			new Talon(RobotMap.rightDriveMotor1),
			new Talon(RobotMap.rightDriveMotor2),
			new Talon(RobotMap.rightDriveMotor3));
	robotDrive = new RobotDrive(leftDriveMotors, rightDriveMotors);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	


    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	
    }
}

