package frc.Graphing;

import frc.robot.WriteToFile;

import java.util.Scanner;

import static java.io.File.separator;

public class readFromFile {

    static String[] StrArray;
    static String aLine = "";
    static String separator = " ";


    static int time;
    static int yVelocity;
    static int yPosition;
    static int ySetpoint;
    static int yError;
    static int yCurrent;
    static int motorID;

    public static void readFromFile(){
        try (
                Scanner filescan = new Scanner((Readable) WriteToFile.inputfile);){

            while (filescan.hasNext()){
                aLine = filescan.nextLine();
                StrArray = aLine.split(separator);

                time = Integer.parseInt(StrArray[6]);
                yVelocity = Integer.parseInt(StrArray[0]);
                yPosition = Integer.parseInt(StrArray[1]);
                ySetpoint = Integer.parseInt(StrArray[2]);
                yError = Integer.parseInt(StrArray[3]);
                yCurrent = Integer.parseInt(StrArray[4]);
                motorID = Integer.parseInt((StrArray[5]));


            }
        }
    }

}

