package frc.Graphing;

import frc.robot.WriteToFile;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import frc.Graphing.readFromFile;

import java.io.IOException;

public class CreateDatasets {

    //Velocity Position Setpoint Error Current
    public static boolean[] robotValues = new boolean[] {true, true, true, true, true};

    public static XYDataset createDataset(int number) {

     //   WriteToFile.writeFile();
        System.out.println("BEFORE READ FROM FILE");
        readFromFile.readFromFile();
        System.out.println("AFTER READ FROM FILE");

        XYSeries[] vel = new XYSeries[10];
        XYSeries[] pos = new XYSeries[10];
        XYSeries[] set = new XYSeries[10];
        XYSeries[] err = new XYSeries[10];
        XYSeries[] cur = new XYSeries[10];
        XYSeries[] vel1 = new XYSeries[10];
        XYSeries[] pos1 = new XYSeries[10];
        XYSeries[] set1 = new XYSeries[10];
        XYSeries[] err1 = new XYSeries[10];
        XYSeries[] cur1 = new XYSeries[10];

        for (int Z = 0; Z < 10; Z++) {
            vel[Z] = new XYSeries("Velocity");
        }
        for (int Z = 0; Z < 10; Z++) {
            pos[Z] = new XYSeries("Position");
        }
        for (int Z = 0; Z < 10; Z++) {
            set[Z] = new XYSeries("Setpoint");
        }
        for (int Z = 0; Z < 10; Z++) {
            err[Z] = new XYSeries("Error");
        }
        for (int Z = 0; Z < 10; Z++) {
            cur[Z] = new XYSeries("Current");
        }
        for (int Z = 0; Z < 10; Z++) {
            vel1[Z] = new XYSeries("Velocity");
        }
        for (int Z = 0; Z < 10; Z++) {
            pos1[Z] = new XYSeries("Position");
        }
        for (int Z = 0; Z < 10; Z++) {
            set1[Z] = new XYSeries("Setpoint");
        }
        for (int Z = 0; Z < 10; Z++) {
            err1[Z] = new XYSeries("Error");
        }
        for (int Z = 0; Z < 10; Z++) {
            vel1[Z] = new XYSeries("Current");
        }



        /*
        series[1] = new XYSeries("Velocity");

        XYSeries series1 = new XYSeries("Position");
        XYSeries series2 = new XYSeries("Setpoint");
        XYSeries series3 = new XYSeries("Error");
        XYSeries series4 = new XYSeries("Current");
        XYSeries series5 = new XYSeries("Velocity");
        XYSeries series6 = new XYSeries("Position");
        XYSeries series7 = new XYSeries("Setpoint");
        XYSeries series8 = new XYSeries("Error");
        XYSeries series9 = new XYSeries("Current");
        */
        for (int J = 0; J < 3; J ++){
            vel[readFromFile.motorID[J]].addOrUpdate((readFromFile.time[J]), readFromFile.yVelocity[J]);
            pos[readFromFile.motorID[J]].addOrUpdate((readFromFile.time[J]), readFromFile.yPosition[J]);
            set[readFromFile.motorID[J]].addOrUpdate((readFromFile.time[J]), readFromFile.ySetpoint[J]);
            err[readFromFile.motorID[J]].addOrUpdate((readFromFile.time[J]), readFromFile.yError[J]);
            cur[readFromFile.motorID[J]].addOrUpdate((readFromFile.time[J]), readFromFile.yCurrent[J]);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();

        for (int t = 0; t < 10 ; t++){
            if (number == t){
                if (robotValues[0]){
                    dataset.addSeries(vel[t]);
                }else{dataset.addSeries(vel1[t]);}
                if (robotValues[1]){
                    dataset.addSeries(pos[t]);
                }else{dataset.addSeries(pos1[t]);}
                if (robotValues[2]){
                    dataset.addSeries(set[t]);
                }else{dataset.addSeries(set1[t]);}
                if (robotValues[3]){
                    dataset.addSeries(err[t]);
                }else{dataset.addSeries(err1[t]);}
                if (robotValues[4]){
                    dataset.addSeries(cur[t]);
                }else{dataset.addSeries(cur1[t]);}
            }
        }


        return dataset;
    }


}

