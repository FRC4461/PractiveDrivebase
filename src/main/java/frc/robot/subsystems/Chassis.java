/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {

    private final TalonSRX talon1 = new TalonSRX(Constants.DriveBase.talon1);
    private final TalonSRX talon2 = new TalonSRX(Constants.DriveBase.talon2);
    private final TalonSRX talon3 = new TalonSRX(Constants.DriveBase.talon3);
    private final TalonSRX talon4 = new TalonSRX(Constants.DriveBase.talon4);


    public void drive(double leftSpeed, double rightSpeed){
        talon1.set(ControlMode.PercentOutput, -leftSpeed);
        talon2.set(ControlMode.PercentOutput, -leftSpeed);
        talon3.set(ControlMode.PercentOutput, rightSpeed);
        talon4.set(ControlMode.PercentOutput, rightSpeed);
    }
}
