/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.WriteToFile;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.PWMTalonSRX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Robot extends TimedRobot {
  private Joystick m_leftStick;
  private Joystick m_rightStick;

  static WPI_TalonSRX[] talonList = new WPI_TalonSRX[1];

  @Override
  public void robotInit() {
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);

    talonList[0] = new WPI_TalonSRX(0);
    //talonList[1] = new WPI_TalonSRX(1);
    //talonList[2] = new WPI_TalonSRX(12);
    //talonList[3] = new WPI_TalonSRX(13);
    /*talonList[4] = new WPI_TalonSRX(10);
    talonList[5] = new WPI_TalonSRX(11);
    talonList[6] = new WPI_TalonSRX(12);
    talonList[7] = new WPI_TalonSRX(13);
    talonList[8] = new WPI_TalonSRX(20);
    talonList[9] = new WPI_TalonSRX(21);*/
  }

  @Override
  public void teleopInit(){
    //write your stuff here, it will execute once when the robot is enabled in teleop mode
  }
  @Override
  public void teleopPeriodic(){
    //this code will run once per loop in teleop mode, dont do anything here unless you want it to loop

//    try {
//      WriteToFile.main();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    if (0.05 < Math.abs(m_leftStick.getY())) {
      talonList[0].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, m_leftStick.getY());
      //System.out.println(talonList[0].getSelectedSensorVelocity());

      double velocity = Robot.talonList[0].getSelectedSensorVelocity();
      double position = Robot.talonList[0].getSelectedSensorPosition();
      double error = Robot.talonList[0].getClosedLoopError();
      double setpoint = position+error;
      double current = Robot.talonList[0].getOutputCurrent();

      System.out.println("Velocity: " + velocity);
      System.out.println("Position: " + position);
      System.out.println("Error: " + error);
      System.out.println("Setpoint: " + setpoint);
      System.out.println("Current: " + current);

     // talonList[1].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, m_leftStick.getY());
    } else {
      talonList[0].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
   //   talonList[1].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
    }
  }
}

