package gettingValues;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
    private static DriveTrain ourInstance = new DriveTrain();
    public static DriveTrain getInstance() {
        return ourInstance;
    }

    private DriveTrain() {

    }

    @Override
    protected void initDefaultCommand() {

    }
    WPI_TalonSRX leftTalon = new WPI_TalonSRX(0);
    WPI_TalonSRX rightTalon = new WPI_TalonSRX(1);

    public void tankDrive(double left, double right){
        if (Math.abs(left) > 0.05) {
            leftTalon.set(ControlMode.PercentOutput, left);
        } else {
            leftTalon.set(0);
        }
        if (Math.abs(right) > 0.05) {
            rightTalon.set(ControlMode.PercentOutput, right);
        } else {
            rightTalon.set(0);
        }
    }

}
