package frc.robot;
import java.io.*;
import java.util.ArrayList;

public class WriteToFile {

    public static File file;

    public static int[] motorID = new int[0];

    public static void msain() throws IOException{
        file = new File(
//            "C:\\Users\\natpi\\Documents\\GitHub\\MotorGraphingUtilities\\src\\main\\java\\" +
                "RobotText.txt");
//         creates the file
        if (file.exists()) {
            System.out.println("FILE EXISTS");
           // file.createNewFile();
        }

        /*
        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write("1 1 32 092 234 243 11\n");
        writer.write("1 2 87 789 1111 7564 78\n");
        writer.write("4 2 232 242 4214 241 41\n");
        writer.write("2 3 098 2 34 1244 124 4\n");
        writer.write("3 4 1242 0182 546 2413 41\n");
        writer.flush();
        writer.close();
        */


        // code to write robot values to file (work in progress)

        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("FAIL");
            e.printStackTrace();
        }


        for (int t = 0; t < 1; t++){


            double time = 10;

            ArrayList<Double> velocity = Robot.velocityList;
            ArrayList<Double> position = Robot.positionList;
            ArrayList<Double> error = Robot.errorList;
            ArrayList<Double> setpoint = Robot.setpointList;
            ArrayList<Double> current = Robot.currentList;

            for (int n = 0; n <= velocity.size(); n++) {
                try {
                    writer.write(t + " " + time + " " + velocity.get(n) + " " + setpoint.get(n) + " " + position.get(n) + " " + error.get(n) + " " + current.get(n) + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            /*
            double velocity = Robot.talonList[t].getSelectedSensorVelocity();
            double position = Robot.talonList[t].getSelectedSensorPosition();
            double error = Robot.talonList[t].getClosedLoopError();
            double setpoint = position+error;
            double current = Robot.talonList[t].getOutputCurrent();

             */

            //writer.write(t + " " + time + " " + velocity + " " + setpoint + " " + position + " " + error + " " + current + "\n");
        }
/*
        for (int J = 0; J < 4; J++){
            writer.write(J + " " + J*2 + " " + "161 111 111 111 143\n");
            writer.write(J + " " + J*3 + " " + "161 111 111 111 143\n");
            writer.write(J + " " + J*4 + " " + "161 111 111 111 143\n");
            writer.write(J + " " + J*5 + " " + "161 111 111 111 143\n");
        }

 */

        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




       /*
        // Creates a FileReader Object
        FileReader fr = new FileReader(file);
        char [] a = new char[50];
        fr.read(a);   // reads the content to the array

        for(char c : a)
            System.out.print(c);   // prints the characters one by one
        fr.close();

        */
    }
}

