package Graphing;

//import javafx.scene.chart.Chart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Tanay Birader (That's why it works)

public class OutputGraph extends JFrame {

    public static int number = 1;

    // Colors
    private Color TkoTeal = new Color(90, 199, 217);
    private Color Grey = new Color(78, 78, 78);

    //Velocity Position Setpoint Error Current
    private boolean[] robotValues = new boolean[] {true, true, true, true, true};

    // Chart Locations and Names
    private int[] Chart1 = new int[] { 15, 15, 15, 15, 1};    //1
    private int[] Chart2 = new int[] { 15, 15, 15, 15, 2};    //2
    private int[] Chart3 = new int[] { 15, 15, 15, 15, 3};    //3
    private int[] Chart4 = new int[] { 15, 15, 15, 15, 4};    //4
    private int[] Chart5 = new int[] { 15, 15, 15, 15, 5};    //5
    private int[] Chart6 = new int[] { 15, 15, 15, 15, 6};    //6
    private int[] Chart7 = new int[] { 15, 15, 15, 15, 7};    //7
    private int[] Chart8 = new int[] { 15, 15, 15, 15, 8};    //8
    private int[] Chart9 = new int[] { 15, 15, 15, 15, 9};    //9
    private int[] Chart10 = new int[] { 15, 15, 15, 15, 10};  //10

    /*private int[] directory = new int[] { 0, 0, 0, 0, 3};         //3
    private int[] UI = new int[] { 0, 0, 0, 0, 4};                //4*/

    private int motorCount = 1;
    private int maxMotor = 10;

    public OutputGraph(int number) {
        initUI(number);
    }

    private void initUI(int number) {

        //Creating all 10 datasets
        //TODO change the values of everything after 2
        XYDataset dataset1 = createDataset(Chart1[4]);
        JFreeChart Panel1 = createChart(dataset1, Chart1[4]);
        XYDataset dataset2 = createDataset(Chart2[4]);
        JFreeChart Panel2 = createChart(dataset2, Chart2[4]);
        XYDataset dataset3 = createDataset(Chart3[4]);
        JFreeChart Panel3 = createChart(dataset3, Chart3[4]);
        XYDataset dataset4 = createDataset(Chart4[4]);
        JFreeChart Panel4 = createChart(dataset4, Chart4[4]);
        XYDataset dataset5 = createDataset(Chart5[4]);
        JFreeChart Panel5 = createChart(dataset5, Chart5[4]);
        XYDataset dataset6 = createDataset(Chart6[4]);
        JFreeChart Panel6 = createChart(dataset6, Chart6[4]);
        XYDataset dataset7 = createDataset(Chart7[4]);
        JFreeChart Panel7 = createChart(dataset7, Chart7[4]);
        XYDataset dataset8 = createDataset(Chart8[4]);
        JFreeChart Panel8 = createChart(dataset8, Chart8[4]);
        XYDataset dataset9 = createDataset(Chart9[4]);
        JFreeChart Panel9 = createChart(dataset9, Chart9[4]);
        XYDataset dataset10 = createDataset(Chart10[4]);
        JFreeChart Panel10 = createChart(dataset10, Chart10[4]);

        if (number == 1){
            ChartPanel Charts1 = new ChartPanel(Panel1);
            Charts1.setBorder(BorderFactory.createEmptyBorder(Chart1[0], Chart1[1], Chart1[2], Chart1[3]));
            Charts1.setForeground(TkoTeal);
            Charts1.setBackground(Grey);
            add(Charts1);
        }

        if (number == 2){
            ChartPanel Charts2 = new ChartPanel(Panel2);
            Charts2.setBorder(BorderFactory.createEmptyBorder(Chart2[0], Chart2[1], Chart2[2], Chart2[3]));
            Charts2.setForeground(TkoTeal);
            Charts2.setBackground(Grey);
            add(Charts2);
        }

        if (number == 3){
            ChartPanel Charts3 = new ChartPanel(Panel3);
            Charts3.setBorder(BorderFactory.createEmptyBorder(Chart3[0], Chart3[1], Chart3[2], Chart3[3]));
            Charts3.setForeground(TkoTeal);
            Charts3.setBackground(Grey);
            add(Charts3);
        }

        if (number == 4){
            ChartPanel Charts4 = new ChartPanel(Panel4);
            Charts4.setBorder(BorderFactory.createEmptyBorder(Chart4[0], Chart4[1], Chart4[2], Chart4[3]));
            Charts4.setForeground(TkoTeal);
            Charts4.setBackground(Grey);
            add(Charts4);
        }

        if (number == 5){
            ChartPanel Charts5 = new ChartPanel(Panel5);
            Charts5.setBorder(BorderFactory.createEmptyBorder(Chart5[0], Chart5[1], Chart5[2], Chart5[3]));
            Charts5.setForeground(TkoTeal);
            Charts5.setBackground(Grey);
            add(Charts5);
        }

        if (number == 6){
            ChartPanel Charts6 = new ChartPanel(Panel6);
            Charts6.setBorder(BorderFactory.createEmptyBorder(Chart6[0], Chart6[1], Chart6[2], Chart6[3]));
            Charts6.setForeground(TkoTeal);
            Charts6.setBackground(Grey);
            add(Charts6);
        }

        if (number == 7){
            ChartPanel Charts7 = new ChartPanel(Panel7);
            Charts7.setBorder(BorderFactory.createEmptyBorder(Chart7[0], Chart7[1], Chart7[2], Chart7[3]));
            Charts7.setForeground(TkoTeal);
            Charts7.setBackground(Grey);
            add(Charts7);
        }

        if (number == 8){
            ChartPanel Charts8 = new ChartPanel(Panel8);
            Charts8.setBorder(BorderFactory.createEmptyBorder(Chart8[0], Chart8[1], Chart8[2], Chart8[3]));
            Charts8.setForeground(TkoTeal);
            Charts8.setBackground(Grey);
            add(Charts8);
        }

        if (number == 9){
            ChartPanel Charts9 = new ChartPanel(Panel9);
            Charts9.setBorder(BorderFactory.createEmptyBorder(Chart9[0], Chart9[1], Chart9[2], Chart9[3]));
            Charts9.setForeground(TkoTeal);
            Charts9.setBackground(Grey);
            add(Charts9);
        }

        if (number == 10){
            ChartPanel Charts10 = new ChartPanel(Panel10);
            Charts10.setBorder(BorderFactory.createEmptyBorder(Chart10[0], Chart10[1], Chart10[2], Chart10[3]));
            Charts10.setForeground(TkoTeal);
            Charts10.setBackground(Grey);
            add(Charts10);
        }

        JPanel jPan = new JPanel();

        JButton previous = new JButton("<-- Previous");
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                motorCount -= 1;
                if ((motorCount)>=1) {
                    initUI(motorCount);
                } else {
                    motorCount = 10;
                    initUI(motorCount);
                }
            }
        });
        jPan.add(previous, BorderLayout.WEST);

        JCheckBox velocityCheckbox = new JCheckBox("Velocity", true);
        velocityCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected()) {
                    robotValues[0] = true;
                    initUI(motorCount);
                    System.out.println("vel selected");
                } else {
                    robotValues[0] = false;
                    initUI(motorCount);
                    System.out.println("vel deselected");
                }
            }
        });
        jPan.add(velocityCheckbox);
        JCheckBox positionCheckbox = new JCheckBox("Position", true);
        positionCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected()) {
                    robotValues[1] = true;
                    initUI(motorCount);
                    System.out.println("pos selected");
                } else {
                    robotValues[1] = false;
                    initUI(motorCount);
                    System.out.println("pos deselected");
                }
            }
        });
        jPan.add(positionCheckbox);
        JCheckBox setpointCheckbox = new JCheckBox("Setpoint", true);
        setpointCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected()) {
                    robotValues[2] = true;
                    initUI(motorCount);
                    System.out.println("set selected");
                } else {
                    robotValues[2] = false;
                    initUI(motorCount);
                    System.out.println("set deselected");
                }
            }
        });
        jPan.add(setpointCheckbox);
        JCheckBox errorCheckbox = new JCheckBox("Error", true);
        errorCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected()) {
                    robotValues[3] = true;
                    initUI(motorCount);
                    System.out.println("err selected");
                } else {
                    robotValues[3] = false;
                    initUI(motorCount);
                    System.out.println("err deselected");
                }
            }
        });
        jPan.add(errorCheckbox);
        JCheckBox currentCheckbox = new JCheckBox("Current", true);
        currentCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected()) {
                    robotValues[4] = true;
                    initUI(motorCount);
                    System.out.println("curr selected");
                } else {
                    robotValues[4] = false;
                    initUI(motorCount);
                    System.out.println("curr deselected");
                }
            }
        });
        jPan.add(currentCheckbox);
        add(jPan, BorderLayout.NORTH);

        JButton next = new JButton("Next -->");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                motorCount += 1;
                if ((motorCount)<=maxMotor) {
                    initUI(motorCount);
                } else {
                    motorCount = 1;
                    initUI(motorCount);
                }
            }
        });
        jPan.add(next, BorderLayout.WEST);

        jPan.setBackground(Grey);

        pack();
        setTitle("Line chart ");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private XYDataset createDataset(int number) {

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

        series5.addOrUpdate(0, 0);
        series6.addOrUpdate(0, 0);
        series7.addOrUpdate(0, 0);
        series8.addOrUpdate(0, 0);
        series9.addOrUpdate(0, 0);



        if (number == 0){};

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

    private JFreeChart createChart(XYDataset dataset, int number) {

        JFreeChart chart1 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        JFreeChart chart2 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );
        JFreeChart chart3 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        JFreeChart chart4 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );
        JFreeChart chart5 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        JFreeChart chart6 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );
        JFreeChart chart7 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        JFreeChart chart8 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );
        JFreeChart chart9 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        JFreeChart chart10 = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );


        XYPlot plot1 = chart1.getXYPlot();
        XYPlot plot2 = chart2.getXYPlot();
        XYPlot plot3 = chart3.getXYPlot();
        XYPlot plot4 = chart4.getXYPlot();
        XYPlot plot5 = chart5.getXYPlot();
        XYPlot plot6 = chart6.getXYPlot();
        XYPlot plot7 = chart7.getXYPlot();
        XYPlot plot8 = chart8.getXYPlot();
        XYPlot plot9 = chart9.getXYPlot();
        XYPlot plot10 = chart10.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        renderer.setSeriesPaint(2, Color.WHITE);
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));

        renderer.setSeriesPaint(3, Color.MAGENTA);
        renderer.setSeriesStroke(3, new BasicStroke(2.0f));

        renderer.setSeriesPaint(4, Color.GREEN);
        renderer.setSeriesStroke(4, new BasicStroke(2.0f));

        renderer.setSeriesPaint(5, Color.ORANGE);
        renderer.setSeriesStroke(5, new BasicStroke(2.0f));

        plot1.setRenderer(renderer);
        plot1.setBackgroundPaint(Grey);

        plot1.setRangeGridlinesVisible(true);
        plot1.setRangeGridlinePaint(TkoTeal);

        plot1.setBackgroundPaint(Grey);
        chart1.getLegend().setBackgroundPaint(Grey);
        chart1.getLegend().setItemPaint(TkoTeal);
        chart1.setBackgroundPaint(Grey);

        plot1.setDomainGridlinesVisible(true);
        plot1.setDomainGridlinePaint(TkoTeal);

        plot1.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot1.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot1.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot1.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot1.getDomainAxis().setLabelPaint(TkoTeal);
        plot1.getRangeAxis().setLabelPaint(TkoTeal);


        chart1.getLegend().setFrame(BlockBorder.NONE);

        chart1.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot2.setRenderer(renderer);
        plot2.setBackgroundPaint(Grey);

        plot2.setRangeGridlinesVisible(true);
        plot2.setRangeGridlinePaint(TkoTeal);

        plot2.setBackgroundPaint(Grey);
        chart2.getLegend().setBackgroundPaint(Grey);
        chart2.getLegend().setItemPaint(TkoTeal);
        chart2.setBackgroundPaint(Grey);

        plot2.setDomainGridlinesVisible(true);
        plot2.setDomainGridlinePaint(TkoTeal);

        plot2.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot2.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot2.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot2.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot2.getDomainAxis().setLabelPaint(TkoTeal);
        plot2.getRangeAxis().setLabelPaint(TkoTeal);


        chart2.getLegend().setFrame(BlockBorder.NONE);

        chart2.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot3.setRenderer(renderer);
        plot3.setBackgroundPaint(Grey);

        plot3.setRangeGridlinesVisible(true);
        plot3.setRangeGridlinePaint(TkoTeal);

        plot3.setBackgroundPaint(Grey);
        chart3.getLegend().setBackgroundPaint(Grey);
        chart3.getLegend().setItemPaint(TkoTeal);
        chart3.setBackgroundPaint(Grey);

        plot3.setDomainGridlinesVisible(true);
        plot3.setDomainGridlinePaint(TkoTeal);

        plot3.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot3.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot3.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot3.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot3.getDomainAxis().setLabelPaint(TkoTeal);
        plot3.getRangeAxis().setLabelPaint(TkoTeal);


        chart3.getLegend().setFrame(BlockBorder.NONE);

        chart3.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot4.setRenderer(renderer);
        plot4.setBackgroundPaint(Grey);

        plot4.setRangeGridlinesVisible(true);
        plot4.setRangeGridlinePaint(TkoTeal);

        plot4.setBackgroundPaint(Grey);
        chart4.getLegend().setBackgroundPaint(Grey);
        chart4.getLegend().setItemPaint(TkoTeal);
        chart4.setBackgroundPaint(Grey);

        plot4.setDomainGridlinesVisible(true);
        plot4.setDomainGridlinePaint(TkoTeal);

        plot4.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot4.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot4.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot4.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot4.getDomainAxis().setLabelPaint(TkoTeal);
        plot4.getRangeAxis().setLabelPaint(TkoTeal);


        chart4.getLegend().setFrame(BlockBorder.NONE);

        chart4.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot5.setRenderer(renderer);
        plot5.setBackgroundPaint(Grey);

        plot5.setRangeGridlinesVisible(true);
        plot5.setRangeGridlinePaint(TkoTeal);

        plot5.setBackgroundPaint(Grey);
        chart5.getLegend().setBackgroundPaint(Grey);
        chart5.getLegend().setItemPaint(TkoTeal);
        chart5.setBackgroundPaint(Grey);

        plot5.setDomainGridlinesVisible(true);
        plot5.setDomainGridlinePaint(TkoTeal);

        plot5.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot5.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot5.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot5.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot5.getDomainAxis().setLabelPaint(TkoTeal);
        plot5.getRangeAxis().setLabelPaint(TkoTeal);


        chart5.getLegend().setFrame(BlockBorder.NONE);

        chart5.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot6.setRenderer(renderer);
        plot6.setBackgroundPaint(Grey);

        plot6.setRangeGridlinesVisible(true);
        plot6.setRangeGridlinePaint(TkoTeal);

        plot6.setBackgroundPaint(Grey);
        chart6.getLegend().setBackgroundPaint(Grey);
        chart6.getLegend().setItemPaint(TkoTeal);
        chart6.setBackgroundPaint(Grey);

        plot6.setDomainGridlinesVisible(true);
        plot6.setDomainGridlinePaint(TkoTeal);

        plot6.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot6.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot6.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot6.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot6.getDomainAxis().setLabelPaint(TkoTeal);
        plot6.getRangeAxis().setLabelPaint(TkoTeal);


        chart6.getLegend().setFrame(BlockBorder.NONE);

        chart6.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot7.setRenderer(renderer);
        plot7.setBackgroundPaint(Grey);

        plot7.setRangeGridlinesVisible(true);
        plot7.setRangeGridlinePaint(TkoTeal);

        plot7.setBackgroundPaint(Grey);
        chart7.getLegend().setBackgroundPaint(Grey);
        chart7.getLegend().setItemPaint(TkoTeal);
        chart7.setBackgroundPaint(Grey);

        plot7.setDomainGridlinesVisible(true);
        plot7.setDomainGridlinePaint(TkoTeal);

        plot7.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot7.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot7.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot7.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot7.getDomainAxis().setLabelPaint(TkoTeal);
        plot7.getRangeAxis().setLabelPaint(TkoTeal);


        chart7.getLegend().setFrame(BlockBorder.NONE);

        chart7.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot8.setRenderer(renderer);
        plot8.setBackgroundPaint(Grey);

        plot8.setRangeGridlinesVisible(true);
        plot8.setRangeGridlinePaint(TkoTeal);

        plot8.setBackgroundPaint(Grey);
        chart8.getLegend().setBackgroundPaint(Grey);
        chart8.getLegend().setItemPaint(TkoTeal);
        chart8.setBackgroundPaint(Grey);

        plot8.setDomainGridlinesVisible(true);
        plot8.setDomainGridlinePaint(TkoTeal);

        plot8.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot8.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot8.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot8.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot8.getDomainAxis().setLabelPaint(TkoTeal);
        plot8.getRangeAxis().setLabelPaint(TkoTeal);


        chart8.getLegend().setFrame(BlockBorder.NONE);

        chart8.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot9.setRenderer(renderer);
        plot9.setBackgroundPaint(Grey);

        plot9.setRangeGridlinesVisible(true);
        plot9.setRangeGridlinePaint(TkoTeal);

        plot9.setBackgroundPaint(Grey);
        chart9.getLegend().setBackgroundPaint(Grey);
        chart9.getLegend().setItemPaint(TkoTeal);
        chart9.setBackgroundPaint(Grey);

        plot9.setDomainGridlinesVisible(true);
        plot9.setDomainGridlinePaint(TkoTeal);

        plot9.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot9.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot9.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot9.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot9.getDomainAxis().setLabelPaint(TkoTeal);
        plot9.getRangeAxis().setLabelPaint(TkoTeal);

        chart9.getLegend().setFrame(BlockBorder.NONE);

        chart9.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        plot10.setRenderer(renderer);
        plot10.setBackgroundPaint(Grey);

        plot10.setRangeGridlinesVisible(true);
        plot10.setRangeGridlinePaint(TkoTeal);

        plot10.setBackgroundPaint(Grey);
        chart10.getLegend().setBackgroundPaint(Grey);
        chart10.getLegend().setItemPaint(TkoTeal);
        chart10.setBackgroundPaint(Grey);

        plot10.setDomainGridlinesVisible(true);
        plot10.setDomainGridlinePaint(TkoTeal);

        plot10.getDomainAxis().setAxisLinePaint(TkoTeal);
        plot10.getRangeAxis().setAxisLinePaint(TkoTeal);
        plot10.getDomainAxis().setTickLabelPaint(TkoTeal);
        plot10.getRangeAxis().setTickLabelPaint(TkoTeal);
        plot10.getDomainAxis().setLabelPaint(TkoTeal);
        plot10.getRangeAxis().setLabelPaint(TkoTeal);


        chart10.getLegend().setFrame(BlockBorder.NONE);

        chart10.setTitle(new TextTitle("Motor " + number,
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        chart1.getTitle().setPaint(TkoTeal);
        chart2.getTitle().setPaint(TkoTeal);
        chart3.getTitle().setPaint(TkoTeal);
        chart4.getTitle().setPaint(TkoTeal);
        chart5.getTitle().setPaint(TkoTeal);
        chart6.getTitle().setPaint(TkoTeal);
        chart7.getTitle().setPaint(TkoTeal);
        chart8.getTitle().setPaint(TkoTeal);
        chart9.getTitle().setPaint(TkoTeal);
        chart10.getTitle().setPaint(TkoTeal);


        if (number == 1){ return chart1;};
        if (number == 2){ return chart2;};
        if (number == 3){ return chart3;};
        if (number == 4){ return chart4;};
        if (number == 5){ return chart5;};
        if (number == 6){ return chart6;};
        if (number == 7){ return chart7;};
        if (number == 8){ return chart8;};
        if (number == 9){ return chart9;};
        if (number == 10){ return chart10;};

        return chart10;

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            OutputGraph ex = new OutputGraph(number);
            ex.setVisible(true);
        });

    }
}