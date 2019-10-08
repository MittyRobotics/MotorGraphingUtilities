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
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputGraph extends JFrame {

    private Color TkoTeal = new Color(90, 199, 217);
    private Color Grey = new Color(78, 78, 78);

    public OutputGraph() {

        initUI();
    }

    private void initUI() {

        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Line chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private XYDataset createDataset() {

        XYSeries series = new XYSeries("Velocity");
        XYSeries series1 = new XYSeries("Position");
        XYSeries series2 = new XYSeries("Setpoint");
        XYSeries series3 = new XYSeries("Error");
        XYSeries series4 = new XYSeries("Current");

        series.add(18, 567);
        series.add(20, 612);
        series.add(25, 800);
        series.add(30, 980);
        series.add(40, 1410);
        series.add(50, 2350);

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


        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        dataset.addSeries(series4);


        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Motor Graphing Utility",
                "Time",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

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

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Grey);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(TkoTeal);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(TkoTeal);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Motor Graphing Utility",
                        new Font("Serif", java.awt.Font.BOLD, 30)
                )
        );

        return chart;

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            OutputGraph ex = new OutputGraph();
            ex.setVisible(true);
        });
    }
}