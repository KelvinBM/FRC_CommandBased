// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private PWMSparkMax intakeMotor = new PWMSparkMax(Constants.Intake_Motor_ID);
  
  /** Creates a new Intake. */
  public Intake() {
  
  }

  public void intakeStart(double speed){
    intakeMotor.set(speed);
  }

  public void reverseMotor(double speed){
    intakeMotor.set(-speed);
  }
  
  public void stopMotor() {
    intakeMotor.stopMotor();
  }


  @Override
  public void periodic() {

    

  }
  
}
