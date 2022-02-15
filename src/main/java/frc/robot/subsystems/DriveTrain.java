// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  private final PWMSparkMax leftMotor1 = new PWMSparkMax(Constants.Left_Motor_1);
  private final PWMSparkMax leftMotor2 = new PWMSparkMax(Constants.Left_Motor_2);
  private final PWMSparkMax rightMotor1 = new PWMSparkMax(Constants.Right_Motor_1);
  private final PWMSparkMax rightMotor2 = new PWMSparkMax(Constants.Right_Motor_2);


  private final DifferentialDrive m_drive = new DifferentialDrive(,);

  public DriveTrain() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //double speed = -userController.getRawAxis(1)* 0.6;
    //double turn = userController.getRawAxis(4)* 0.3;

    //double left = speed + turn;
    //double right = speed - turn;
  }

  public void rightSpeed(double s){
    rightMotor1.set(-Constants.SPEED);
    rightMotor2.set(-Constants.SPEED);

  }

  public void leftSpeed(double s){
   leftMotor1.set(Constants.SPEED);
   leftMotor2.set(Constants.SPEED);
  }

  public static void arcadeDrive(double moveVal, double rotateVal){
    DriveTrain.arcadeDrive(moveVal,rotateVal);

  }

}