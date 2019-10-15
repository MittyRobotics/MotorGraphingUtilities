package Graphing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;

import java.awt.*;

public class CreateCharts {

    // Colors
    static Color TkoTeal = new Color(90, 199, 217);
    static Color Grey = new Color(78, 78, 78);

    public static JFreeChart createChart(XYDataset dataset, int number) {


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


}
