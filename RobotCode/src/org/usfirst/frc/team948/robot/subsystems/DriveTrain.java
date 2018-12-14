/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team948.robot.subsystems;

import org.usfirst.frc.team948.robot.RobotMap;
import org.usfirst.frc.team948.robot.commands.ManualDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		 setDefaultCommand(new ManualDrive());
	}

	public void drive(double leftPower, double rightPower) {
		RobotMap.backLeft.set(leftPower);
		RobotMap.backRight.set(leftPower);
		RobotMap.frontLeft.set(rightPower);
		RobotMap.frontRight.set(rightPower);	}
	public void stop() {
		RobotMap.backLeft.disable();
		RobotMap.backRight.disable();
		RobotMap.frontLeft.disable();
		RobotMap.frontRight.disable();

	}
}

