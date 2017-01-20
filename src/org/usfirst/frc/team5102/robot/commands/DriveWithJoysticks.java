package org.usfirst.frc.team5102.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5102.robot.Robot;

/**
 *	TODO: We still need to make our other commands. For example, we have an Arm class 
 *	that doesn't have any commands yet. Think something like a "MoveArm" command.
 */
public class DriveWithJoysticks extends Command 
{
	public DriveWithJoysticks() 
	{
		// Use requires() here to declare subsystem dependencies
		requires(DriveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() 
	{
	
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() 
	{
		// TODO: Grab the values from OI class. This is where we'll take advantage of our
		// 'getDriveControllerLeftStick'; e.g. robotDrive/DriveTrain object calls arcadeDrive() here.
		// http://wpilib.screenstepslive.com/s/3120/m/7882/l/85166-driving-the-robot-with-tank-drive-and-joysticks
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() 
	{
		return false;
	}

	// Called once after isFinished returns true
	// Maybe check the roundtime here? TODO
	@Override
	protected void end() 
	{
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted()
	{
	
	}
}
