package org.usfirst.frc.team948.robot.commands;

import org.usfirst.frc.team948.robot.Robot;
import org.usfirst.frc.team948.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnToHeading extends Command {

	
	private double desiredHeading;
	private double maxPower;
	private final double P_TERM = 0.05;
    public TurnToHeading(double desiredHeading, double power) {
    	desiredHeading = desiredHeading;
    	power = power;
    	requires(Robot.drive);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double error = this.desiredHeading - RobotMap.navx.getAngle();
    	double currentPower = P_TERM * error;
    	if(currentPower < -this.maxPower) {
    		currentPower = this.maxPower;
    	}
    	else if(currentPower > this.maxPower) {
    		currentPower = this.maxPower;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
