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

import static Graphing.CreateCharts.*;
import static Graphing.CreateDatasets.createDataset;
import static Graphing.CreateDatasets.robotValues;

public class OutputGraph extends JFrame {

    public static int number = 1;



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

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            OutputGraph ex = new OutputGraph(number);
            ex.setVisible(true);
        });

    }
}