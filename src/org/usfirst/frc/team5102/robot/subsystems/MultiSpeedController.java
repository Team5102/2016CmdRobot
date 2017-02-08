package org.usfirst.frc.team5102.robot.subsystems;
import edu.wpi.first.wpilibj.SpeedController;

public class MultiSpeedController implements SpeedController
{
    private SpeedController[] speedControllers;
    private double speed;

    public MultiSpeedController(SpeedController... speedControllers)
    {
        this.speedControllers = speedControllers;
        this.set(0.0);
    }

    @Override
    public double get()
    {
        return this.speed;
    }

    @Override
    public void set(double speed)
    {
        this.speed = speed;

        for (SpeedController speedController : this.speedControllers)
        {
            speedController.set(speed);
        }
    }

    //@Override
    public void set(double speed, byte syncGroup)
    {
        this.set(speed);
    }

    @Override
    public void pidWrite(double output)
    {
        this.set(output);
    }

    @Override
    public void disable()
    {
        for (SpeedController speedController : this.speedControllers)
        {
            speedController.disable();
        }
    }

	@Override
	public void setInverted(boolean isInverted)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getInverted()
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	public void stopMotor()
	{
		for (SpeedController speedController : this.speedControllers)
        {
            speedController.set(0.0);
        }
	}
}