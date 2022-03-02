// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  private final PWMSparkMax leftMotor1 = new PWMSparkMax(Constants.Left_Motor_1_ID);
  private final PWMSparkMax leftMotor2 = new PWMSparkMax(Constants.Left_Motor_2_ID);
  private final PWMSparkMax rightMotor1 = new PWMSparkMax(Constants.Right_Motor_1_ID);
  private final PWMSparkMax rightMotor2 = new PWMSparkMax(Constants.Right_Motor_2_ID);

  private MotorControllerGroup left = new MotorControllerGroup(leftMotor1, leftMotor2);
  private MotorControllerGroup right = new MotorControllerGroup(rightMotor1, rightMotor2);

  private final DifferentialDrive m_drive = new DifferentialDrive(left, right);

  public DriveTrain() {
    
  }


  public void arcadedrive(double moveV, double rotateV){
    m_drive.arcadeDrive( moveV, rotateV);

  }


  public void motorStop(double speed){
    
    
    leftMotor1.stopMotor();
    leftMotor2.stopMotor();
    rightMotor1.stopMotor();
    rightMotor2.stopMotor();

    
  }





  @Override
  public void periodic() {
    // This method will be called once per scheduler run
 
  }


  public void arcadeDrive(double speed) {
  }
}