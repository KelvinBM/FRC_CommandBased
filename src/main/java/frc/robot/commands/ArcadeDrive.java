// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase {
  /** Creates a new ArcadeDrive. */
  private final DriveTrain m_driveTrain;
  private final DoubleSupplier m_speedvalue;
  private final DoubleSupplier m_rotatevalue;

  public ArcadeDrive(DriveTrain driveTrain, DoubleSupplier speed, DoubleSupplier rotateVal) {
    
    this.m_driveTrain = driveTrain;
    this.m_rotatevalue = rotateVal;
    this.m_speedvalue = speed;

    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrain.arcadedrive(m_speedvalue.getAsDouble(), m_rotatevalue.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_driveTrain.arcadedrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
    
  }
}
