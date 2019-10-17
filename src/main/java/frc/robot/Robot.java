/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

<<<<<<< HEAD
import edu.wpi.first.wpilibj.PWMTalonSRX;

import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> 83d09049e20699dfd8ff65105384ffe555a538ff
public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Joystick m_leftStick;
  private Joystick m_rightStick;

  static PWMTalonSRX[] talonList;

  @Override
  public void robotInit() {
    m_myRobot = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);

    talonList[0] = new PWMTalonSRX(0);
    talonList[1] = new PWMTalonSRX(1);
    talonList[2] = new PWMTalonSRX(2);
    talonList[3] = new PWMTalonSRX(3);
    talonList[4] = new PWMTalonSRX(10);
    talonList[5] = new PWMTalonSRX(11);
    talonList[6] = new PWMTalonSRX(12);
    talonList[7] = new PWMTalonSRX(13);
    talonList[8] = new PWMTalonSRX(20);
    talonList[9] = new PWMTalonSRX(21);

  }

  @Override
  public void teleopPeriodic() {
    m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
  }
}
