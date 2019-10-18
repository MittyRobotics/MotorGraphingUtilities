package frc.Graphing;

import frc.robot.WriteToFile;

import java.util.Scanner;

import static java.io.File.separator;

public class readFromFile {

    static String[] StrArray;
    static String aLine = "";
    static String separator = " ";


    static int[] time;
    static int[] yVelocity;
    static int[] yPosition;
    static int[] ySetpoint;
    static int[] yError;
    static int[] yCurrent;
    static int[] motorID;

    public static void readFromFile(){

        int j = 0;

        try (
                Scanner filescan = new Scanner((Readable) WriteToFile.inputfile);){

            while (filescan.hasNext()){

                aLine = filescan.nextLine();
                StrArray = aLine.split(separator);

                motorID[j] = Integer.parseInt((StrArray[0]));
                time[j] = Integer.parseInt(StrArray[1]);
                yVelocity[j] = Integer.parseInt(StrArray[2]);
                ySetpoint[j] = Integer.parseInt(StrArray[3]);
                yPosition[j] = Integer.parseInt(StrArray[4]);
                yError[j] = Integer.parseInt(StrArray[5]);
                yCurrent[j] = Integer.parseInt(StrArray[6]);

                j++;

            }
        }
    }

}

