package Graphing;

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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Tanay Birader (That's why it works)

public class OutputGraph extends JFrame {

    // Colors
    private Color TkoTeal = new Color(90, 199, 217);
    private Color Grey = new Color(78, 78, 78);

    //Velocity Position Setpoint Error Current
    private boolean[] robotValues = new boolean[] {true, false, true, false, true};

    // Chart Locations
    //Top Left Bottom Right
    private int[] topChart = new int[] { 15, 15, 15, 15, 1};    //1
    private int[] bottomChart = new int[] { 15, 15, 15, 15, 2}; //2
    /*private int[] directory = new int[] { 0, 0, 0, 0, 3};         //3
    private int[] UI = new int[] { 0, 0, 0, 0, 4};                //4*/

    private int motorCount = 1;
    private int maxMotor = 2;

    public OutputGraph(int number) {
        initUI(number);
    }

    private void initUI(int number) {

        XYDataset dataset = createDataset(topChart[4]);
        JFreeChart topPanel = createChart(dataset, topChart[4]);
        XYDataset dataset1 = createDataset(bottomChart[4]);
        JFreeChart bottomPanel = createChart(dataset1, bottomChart[4]);

        if (number == 1){
            ChartPanel topChartss = new ChartPanel(topPanel);
            topChartss.setBorder(BorderFactory.createEmptyBorder(topChart[0], topChart[1], topChart[2], topChart[3]));
            topChartss.setForeground(TkoTeal);
            topChartss.setBackground(Grey);
            add(topChartss);
        }

        if (number == 2){
            ChartPanel bottomChartss = new ChartPanel(bottomPanel);
            bottomChartss.setBorder(BorderFactory.createEmptyBorder(bottomChart[0], bottomChart[1], bottomChart[2], bottomChart[3]));
            bottomChartss.setForeground(TkoTeal);
            bottomChartss.setBackground(Grey);
            add(bottomChartss);
        }


        add(new JButton(new AbstractAction("Previous Motor") {

            @Override
            public void actionPerformed(ActionEvent e) {
                initUI(1);
            }
        }), BorderLayout.WEST);

        add(new JButton(new AbstractAction("Next Motor") {

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
        }), BorderLayout.EAST);

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

        if (number == 0){};

        if (number == 1){ //TODO replace with getting values from file later

            series.addOrUpdate(18, 567);
            series.addOrUpdate(20, 612);
            series.addOrUpdate(25, 800);
            series.addOrUpdate(30, 980);
            series.addOrUpdate(40, 1410);
            series.addOrUpdate(50, 2350);

            series1.add(18, 567);
            series1.add(20, 612);
            series1.add(25, 800);
            series1.add(30, 980);
            series1.add(40, 141);
            series1.add(50, 235);

            series2.add(18, 141);
            series2.add(20, 290);
            series2.add(25, 143);
            series2.add(30, 624);
            series2.add(40, 786);
            series2.add(50, 94);

            series3.add(18, 734);
            series3.add(20, 785);
            series3.add(25, 145);
            series3.add(30, 806);
            series3.add(40, 145);
            series3.add(50, 0);

            series4.add(18, 245);
            series4.add(20, 875);
            series4.add(25, 241);
            series4.add(30, 134);
            series4.add(40, 141);
            series4.add(50, 1);

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

            series2.add(18, 133);
            series2.add(20, 654);
            series2.add(25, 984);
            series2.add(30, 938);
            series2.add(40, 74);
            series2.add(50, 454);

            series3.add(18, 424);
            series3.add(20, 985);
            series3.add(25, 123);
            series3.add(30, 345);
            series3.add(40, 567);
            series3.add(50, 0);

            series4.add(18, 324);
            series4.add(20, 76);
            series4.add(25, 123);
            series4.add(30, 876);
            series4.add(40, 342);
            series4.add(50, 912);

        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        if (robotValues[0]){
            dataset.addSeries(series);
        }
        if (robotValues[1]){
            dataset.addSeries(series1);
        }
        if (robotValues[2]){
            dataset.addSeries(series2);
        }if (robotValues[3]){
            dataset.addSeries(series3);
        }
        if (robotValues[4]){
            dataset.addSeries(series4);
        }

        /*dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        dataset.addSeries(series4);*/

        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset, int number) {

        JFreeChart topChart = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        JFreeChart bottomChart = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        JFreeChart mainChart = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );

        XYPlot topplot = topChart.getXYPlot();
        XYPlot bottomplot = bottomChart.getXYPlot();

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

        topplot.setRenderer(renderer);
        topplot.setBackgroundPaint(Grey);

        topplot.setRangeGridlinesVisible(true);
        topplot.setRangeGridlinePaint(TkoTeal);

        topChart.setBackgroundPaint(Grey);
        topChart.getLegend().setBackgroundPaint(Grey);
        topChart.getLegend().setItemPaint(TkoTeal);

        topplot.setDomainGridlinesVisible(true);
        topplot.setDomainGridlinePaint(TkoTeal);

        topplot.getDomainAxis().setAxisLinePaint(TkoTeal);
        topplot.getRangeAxis().setAxisLinePaint(TkoTeal);
        topplot.getDomainAxis().setTickLabelPaint(TkoTeal);
        topplot.getRangeAxis().setTickLabelPaint(TkoTeal);
        topplot.getDomainAxis().setLabelPaint(TkoTeal);
        topplot.getRangeAxis().setLabelPaint(TkoTeal);


        topChart.getLegend().setFrame(BlockBorder.NONE);

        topChart.setTitle(new TextTitle("Motor " + "1",
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        bottomplot.setRenderer(renderer);
        bottomplot.setBackgroundPaint(Grey);

        bottomplot.setRangeGridlinesVisible(true);
        bottomplot.setRangeGridlinePaint(TkoTeal);

        bottomChart.setBackgroundPaint(Grey);
        bottomChart.getLegend().setBackgroundPaint(Grey);
        bottomChart.getLegend().setItemPaint(TkoTeal);

        bottomplot.setDomainGridlinesVisible(true);
        bottomplot.setDomainGridlinePaint(TkoTeal);

        bottomplot.getDomainAxis().setAxisLinePaint(TkoTeal);
        bottomplot.getRangeAxis().setAxisLinePaint(TkoTeal);
        bottomplot.getDomainAxis().setTickLabelPaint(TkoTeal);
        bottomplot.getRangeAxis().setTickLabelPaint(TkoTeal);
        bottomplot.getDomainAxis().setLabelPaint(TkoTeal);
        bottomplot.getRangeAxis().setLabelPaint(TkoTeal);


        bottomChart.getLegend().setFrame(BlockBorder.NONE);

        bottomChart.setTitle(new TextTitle("Motor " + "2",
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );


        topChart.getTitle().setPaint(TkoTeal);
        bottomChart.getTitle().setPaint(TkoTeal);

        if (number == 1){ return topChart;};
        if (number == 2){ return bottomChart;};

        return mainChart;

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            OutputGraph ex = new OutputGraph(1);
            ex.setVisible(true);
        });
    }
}