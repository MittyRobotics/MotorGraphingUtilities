package frc.robot;
import java.io.*;
public class WriteToFile {

    public static File file = new File("RobotText.txt");

    public static void main()throws IOException {
        // creates the file
        if (!file.exists()) {
            file.createNewFile();
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

        FileWriter writer = new FileWriter(file);


      //  for (int t = 0; t < 10; t++){

            /*
            double time = 10;
            double velocity = Robot.talonList[t].getSelectedSensorVelocity();
            double position = Robot.talonList[t].getSelectedSensorPosition();
            double error = Robot.talonList[t].getClosedLoopError();
            double setpoint = position+error;
            double current = Robot.talonList[t].getOutputCurrent();*/

            //writer.write(t + " " + time + " " + velocity + " " + setpoint + " " + position + " " + error + " " + current + "\n");
      //      writer.write("1 141 161 111 111 111 143\n");
       // }
        writer.write("1 141 161 111 111 111 143\n");
        writer.write("2 141 162 151 121 151 123\n");
        writer.write("4 141 161 111 111 111 143\n");
        writer.write("5 141 161 111 111 111 143\n");


        writer.flush();
        writer.close();




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

