package frc.robot;
import java.io.*;
import java.util.ArrayList;
import frc.robot.Robot.*;
import frc.Graphing.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class WriteToFile {

    public static File file = new File("/home/lvuser/RobotText.txt");

    /*
    public static int[] motorID = new int[0];

    private static final int BUFFER_SIZE = 4096;

     */

    public static void main() throws IOException {
        // creates the file

        /*
        String ftpUrl = "ftp://%s:%s@%s/%s;type=i";
        String host = "www.myserver.com";
        String user = "tom";
        String pass = "secret";
        String filePath = "E:/Work/Project.zip";
        String uploadPath = "/MyProjects/archive/Project.zip";

        ftpUrl = String.format(ftpUrl, user, pass, host, uploadPath);
        System.out.println("Upload URL: " + ftpUrl);

         */




        // creates a FileWriter Object
        if (!file.exists()) {
            file.createNewFile();
        } else {
            file.delete();
            file.createNewFile();
            System.out.println("FILE ALREADY EXISTS");
        }

        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        /*writer.write("1 1 32 092 234 243 11\n");
        writer.write("1 2 87 789 1111 7564 78\n");
        writer.write("4 2 232 242 4214 241 41\n");
        writer.write("2 3 098 2 34 1244 124 4\n");
        writer.write("3 4 1242 0182 546 2413 41\n");
        writer.flush();
        writer.close();

         */


        for (int t = 1; t < 2; t++){


            double time = 10;

            ArrayList<Double> velocity = Robot.velocityList;
            ArrayList<Double> position = Robot.positionList;
            ArrayList<Double> error = Robot.errorList;
            ArrayList<Double> setpoint = Robot.setpointList;
            ArrayList<Double> current = Robot.currentList;

            for (int n = 0; n < velocity.size(); n++) {
                writer.write(t + " " + n + " " + velocity.get(n) + " " + setpoint.get(n) + " " + position.get(n) + " " + error.get(n) + " " + current.get(n) + "\n");
            }




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

