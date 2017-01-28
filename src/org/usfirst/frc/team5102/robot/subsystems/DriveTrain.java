package org.usfirst.frc.team5102.robot.subsystems;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem 
{
	
	public static RobotDrive robotDrive;
	public static Shifter shifter;
	
	public DriveTrain()
	{
    	super("DriveTrain");
    	//requires(); TODO Find if this needs a requirement
	}
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//TODO Set defaultCommand
    	// setDefaultCommand(new MoveWithJoysticks());
    	
    }
}

