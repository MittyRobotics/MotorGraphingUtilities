/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import frc.robot.WriteToFile;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.PWMTalonSRX;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Robot extends TimedRobot {


  private Joystick m_leftStick;
  private Joystick m_rightStick;


  public static ArrayList<Double> velocityList = new ArrayList<Double>();
  public static ArrayList<Double> positionList = new ArrayList<Double>();
  public static ArrayList<Double> errorList = new ArrayList<Double>();
  public static ArrayList<Double> setpointList = new ArrayList<Double>();
  public static ArrayList<Double> currentList = new ArrayList<Double>();



  static WPI_TalonSRX[] talonList = new WPI_TalonSRX[1];

  int printvalue = 0;

  CANSparkMax leftSpark1 = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax leftSpark2 = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax rightSpark1 = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax rightSpark2 = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);



    @Override
    public void robotInit() {




    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);

    talonList[0] = new WPI_TalonSRX(1);



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
     /* try {
        WriteToFile.main();
      } catch (IOException e) {
        e.printStackTrace();
      }

      */
    }
    @Override
    public void teleopPeriodic() {
      //this code will run once per loop in teleop mode, dont do anything here unless you want it to loop

//    System.out.println("In teleop periodic loop");
//    try {
//      WriteToFile.main();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//        CANPIDController controller = new CANPIDController(leftSpark);
//        controller.setP(0);
//        controller.setI(0);
//        controller.setD(0);
        double velocity = leftSpark1.getEncoder().getVelocity();
        double position = leftSpark1.getEncoder().getPosition();
//        double error = controller.getSmartMotionAllowedClosedLoopError(0);
        double error = 0;
        double setpoint = position+error;
        double current = leftSpark1.getOutputCurrent();

//        double velocity = talonList[0].getSelectedSensorVelocity();
//        double position = talonList[0].getSelectedSensorPosition();
//        double error = talonList[0].getClosedLoopError();
//        double setpoint = position+error;
//        double current = talonList[0].getOutputCurrent();

        velocityList.add(velocity);
        positionList.add(position);
        errorList.add(error);
        setpointList.add(setpoint);
        currentList.add(current);


        System.out.println("Velocity: " + velocityList.get(printvalue));
        System.out.println("Position: " + positionList.get(printvalue));
        System.out.println("Error: " + errorList.get(printvalue));
        System.out.println("Setpoint: " + setpointList.get(printvalue));
        System.out.println("Current: " + currentList.get(printvalue));


        // talonList[1].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, m_leftStick.getY());

        if (0.05 < Math.abs(m_leftStick.getY())) {
            leftSpark1.set(m_leftStick.getY()/3);
            leftSpark2.set(m_leftStick.getY()/3);
            //talonList[0].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, (m_leftStick.getY()/3));
          //System.out.println(talonList[0].getSelectedSensorVelocity());
        } else {
            leftSpark1.stopMotor();
            leftSpark2.stopMotor();
            //  talonList[0].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
       //   talonList[1].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
        }

        if (0.05 < Math.abs(m_rightStick.getY())) {
            rightSpark1.set(m_rightStick.getY()/3);
            rightSpark2.set(m_rightStick.getY()/3);
            //talonList[0].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, (m_leftStick.getY()/3));
            //System.out.println(talonList[0].getSelectedSensorVelocity());
        } else {
            rightSpark1.stopMotor();
            rightSpark2.stopMotor();
            //  talonList[0].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
            //   talonList[1].set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
        }
        printvalue = printvalue + 1;

        if (m_leftStick.getTriggerPressed()) {
          try {
            System.out.println("TRIGGER PRESSED");
            WriteToFile.main();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
  }
}

