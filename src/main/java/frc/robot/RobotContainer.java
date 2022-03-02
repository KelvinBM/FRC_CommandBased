// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Intake.IntakeReverse;
import frc.robot.commands.Intake.IntakeStart;
import frc.robot.commands.Intake.IntakeStop;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {




  private final DriveTrain m_drive = new DriveTrain();
  XboxController userController = new XboxController(1);
  private Intake intake;
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    //declaring buttons
    final JoystickButton a_Button = new JoystickButton(userController, Constants.A_BUTTON);
    final JoystickButton x_Button = new JoystickButton(userController, Constants.X_BUTTON);
    final JoystickButton y_Button = new JoystickButton(userController, Constants.Y_BUTTON);
    final JoystickButton b_Button = new JoystickButton(userController, Constants.B_BUTTON);

    //Button Maping
    a_Button.toggleWhenPressed(new IntakeStart(0.7, intake));
    x_Button.toggleWhenPressed(new IntakeReverse(0.7, intake));
    
   

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
