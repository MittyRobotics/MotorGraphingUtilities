package frc.Graphing;

import frc.robot.WriteToFile;

import java.util.Arrays;
import java.util.Scanner;

import static java.io.File.separator;
import java.io.*;

public class readFromFile {

    static String[] StrArray;
    static String aLine = "";
    static String separator = " ";


    static int[] motorID = new int[0];
    static int[] time = new int[0];
    static int[] yVelocity = new int[0];
    static int[] yPosition = new int[0];
    static int[] ySetpoint = new int[0];
    static int[] yError = new int[0];
    static int[] yCurrent = new int[0];


    public static void readFromFile(){

        System.out.println("b4");

        try {
            Scanner scnr = new Scanner(WriteToFile.file);

            int j = 0;
            while(scnr.hasNextLine()){

                aLine = scnr.nextLine();
                System.out.println("line " + (j+1) + " :" + aLine);
                StrArray = aLine.split(separator);
                System.out.println("string array 3 = " + Integer.parseInt(StrArray[3]));
                System.out.println("length :: " + motorID.length);

                motorID = Arrays.copyOf(motorID, motorID.length+1);
                motorID[motorID.length-1] = Integer.parseInt((StrArray[0]));

                time = Arrays.copyOf(time, time.length+1);
                time[time.length-1] = Integer.parseInt(StrArray[1]);

                yVelocity = Arrays.copyOf(yVelocity, yVelocity.length+1);
                yVelocity[yVelocity.length-1] = Integer.parseInt(StrArray[2]);

                ySetpoint = Arrays.copyOf(ySetpoint, ySetpoint.length+1);
                ySetpoint[ySetpoint.length-1] = Integer.parseInt(StrArray[3]);

                yPosition = Arrays.copyOf(yPosition, yPosition.length+1);
                yPosition[yPosition.length-1] = Integer.parseInt(StrArray[4]);

                yError = Arrays.copyOf(yError, yError.length+1);
                yError[yError.length-1] = Integer.parseInt(StrArray[5]);

                yCurrent = Arrays.copyOf(yCurrent, yCurrent.length+1);
                yCurrent[yCurrent.length-1] = Integer.parseInt(StrArray[6]);

                j++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

