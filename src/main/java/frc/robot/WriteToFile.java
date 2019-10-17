package frc.robot;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static FileWriter inputfile;
    {
        try {
            inputfile = new FileWriter ("C:/Users/U1/Documents/GitHub/MotorGraphingUtilities/RobotText" +
                    "" +
                    "" +
                    "" +
                    "" +
                    "" +
                    "txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile (){

        //Velocity Position Setpoint Error Current Time

        int t;

        for (t = 0; t < 10; t++){

            double velocity = Robot.talonList[t].get();
            double position = Robot.talonList[t].get();
            double setpoint = Robot.talonList[t].get();
            double error = Robot.talonList[t].get();
            double current = Robot.talonList[t].get();


            BufferedWriter writer = new BufferedWriter(inputfile);

            try {
                writer.write(t + " " + velocity + " " + position + " " + setpoint + " " + error + " " + current);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
