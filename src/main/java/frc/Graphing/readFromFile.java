package frc.Graphing;

import frc.robot.WriteToFile;

import java.util.Scanner;

import static java.io.File.separator;
import java.io.*;

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

    public static void readFromFile() throws IOException{

        int j = 0;
        System.out.println("b4");

        FileReader fr = new FileReader(WriteToFile.file);
        char[] a = new char[50];
        fr.read(a);   // reads the content to the array

        for(char c : a)
            System.out.print(c);   // prints the characters one by one
        fr.close();

        /*
        Scanner filescan = new Scanner((Readable) WriteToFile.file);
        System.out.println("inside the scanning tunnel oooo");
        while (filescan.hasNext()){

            aLine = filescan.nextLine();
          //  System.out.println(aLine);
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

         */





    }

}

