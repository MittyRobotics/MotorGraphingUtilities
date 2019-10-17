package frc.Graphing;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class CreateDatasets {

    //Velocity Position Setpoint Error Current
    public static boolean[] robotValues = new boolean[] {true, true, true, true, true};

    public static XYDataset createDataset(int number) {

        XYSeries series = new XYSeries("Velocity");
        XYSeries series1 = new XYSeries("Position");
        XYSeries series2 = new XYSeries("Setpoint");
        XYSeries series3 = new XYSeries("Error");
        XYSeries series4 = new XYSeries("Current");
        XYSeries series5 = new XYSeries("Velocity");
        XYSeries series6 = new XYSeries("Position");
        XYSeries series7 = new XYSeries("Setpoint");
        XYSeries series8 = new XYSeries("Error");
        XYSeries series9 = new XYSeries("Current");


        if (number == 1){ //TODO replace with getting values from file later

            series.addOrUpdate(18, 567);
            series.addOrUpdate(20, 612);
            series.addOrUpdate(25, 800);
            series.addOrUpdate(30, 980);
            series.addOrUpdate(40, 112);
            series.addOrUpdate(50, 324);

            series1.add(18, 537);
            series1.add(20, 612);
            series1.add(25, 800);
            series1.add(30, 980);
            series1.add(40, 141);
            series1.add(50, 235);

            series2.add(10, 241);
            series2.add(20, 160);
            series2.add(35, 123);
            series2.add(40, 594);
            series2.add(45, 687);
            series2.add(50, 84);

            series3.add(12, 743);
            series3.add(23, 845);
            series3.add(28, 234);
            series3.add(34, 643);
            series3.add(45, 123);
            series3.add(50, 52);

            series4.add(18, 235);
            series4.add(20, 123);
            series4.add(25, 254);
            series4.add(30, 654);
            series4.add(40, 21);
            series4.add(50, 234);

        }

        if (number == 2){ //TODO replace with getting values from file later

            series.addOrUpdate(18, 123);
            series.addOrUpdate(20, 874);
            series.addOrUpdate(25, 234);
            series.addOrUpdate(30, 91);
            series.addOrUpdate(40, 101);
            series.addOrUpdate(50, 2002);

            series1.add(18, 134);
            series1.add(20, 244);
            series1.add(25, 948);
            series1.add(30, 2091);
            series1.add(40, 1092);
            series1.add(50, 2452);

            series2.add(18, 233);
            series2.add(20, 344);
            series2.add(25, 244);
            series2.add(30, 534);
            series2.add(40, 24);
            series2.add(50, 243);

            series3.add(18, 123);
            series3.add(20, 432);
            series3.add(25, 54);
            series3.add(30, 12);
            series3.add(40, 67);
            series3.add(50, 645);

            series4.add(18, 323);
            series4.add(20, 643);
            series4.add(25, 64);
            series4.add(30, 836);
            series4.add(40, 123);
            series4.add(50, 943);

        }

        if (number > 2){ //TODO replace with getting values from file later

            series.addOrUpdate(18, 123);
            series.addOrUpdate(20, 874);
            series.addOrUpdate(25, 234);
            series.addOrUpdate(30, 91);
            series.addOrUpdate(40, 101);
            series.addOrUpdate(50, 2002);

            series1.add(18, 134);
            series1.add(20, 244);
            series1.add(25, 948);
            series1.add(30, 2091);
            series1.add(40, 1092);
            series1.add(50, 2452);

            series2.add(18, 233);
            series2.add(20, 344);
            series2.add(25, 244);
            series2.add(30, 534);
            series2.add(40, 24);
            series2.add(50, 223);

            series3.add(18, 123);
            series3.add(20, 432);
            series3.add(25, 54);
            series3.add(30, 12);
            series3.add(40, 67);
            series3.add(50, 645);

            series4.add(18, 323);
            series4.add(20, 643);
            series4.add(25, 64);
            series4.add(30, 836);
            series4.add(40, 123);
            series4.add(50, 943);

            series5.add(18, 323);
            series5.add(20, 643);
            series5.add(25, 64);
            series5.add(30, 836);
            series5.add(40, 123);
            series5.add(50, 943);

        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        if (robotValues[0]){
            dataset.addSeries(series);
        }else{dataset.addSeries(series5);}
        if (robotValues[1]){
            dataset.addSeries(series1);
        }else{dataset.addSeries(series6);}
        if (robotValues[2]){
            dataset.addSeries(series2);
        }else{dataset.addSeries(series7);}
        if (robotValues[3]){
            dataset.addSeries(series3);
        }else{dataset.addSeries(series8);}
        if (robotValues[4]){
            dataset.addSeries(series4);
        }else{dataset.addSeries(series9);}


        return dataset;
    }


}
