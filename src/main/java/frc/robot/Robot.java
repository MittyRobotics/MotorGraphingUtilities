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
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.PWMTalonSRX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Joystick m_leftStick;
  private Joystick m_rightStick;

  static WPI_TalonSRX[] talonList;

  @Override
  public void robotInit() {
    m_myRobot = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);

    talonList[0] = new WPI_TalonSRX(0);
    talonList[1] = new WPI_TalonSRX(1);
    talonList[2] = new WPI_TalonSRX(2);
    talonList[3] = new WPI_TalonSRX(3);
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

    try {
      WriteToFile.main();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

