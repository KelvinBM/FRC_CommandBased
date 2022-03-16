// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

public class Taxi extends CommandBase {

  private DriveTrain driveTrain;
  private double speed;
  private double time;

  /** Creates a new Taxi. */
  public Taxi(DriveTrain driveTrain, double speed, double time) {
    this.driveTrain = driveTrain;
    this.speed = speed;
    this.time = time;
    
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //driveTrain.arcadeDrive(speed);
    
      time = Timer.getFPGATimestamp();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    while(time >= 0){
      driveTrain.arcadeDrive(speed);
      time--; 
    }
    driveTrain.motorStop(0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}