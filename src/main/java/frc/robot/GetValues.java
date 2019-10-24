package frc.robot;

public class GetValues {

    public double getVelocity (int motorNumber){
        return 10*motorNumber;
    }

    public double getPosition (int motorNumber){
        return 15*motorNumber;
    }

    public double getSetpoint (int motorNumber){
        return 15*motorNumber;
    }

    public double getError (int motorNumber){
        return 15*motorNumber;
    }

    public double getCurrent (int motorNumber){
        return 15*motorNumber;
    }
}

