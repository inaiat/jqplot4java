/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.JqPlotClasses;
import jqplot.chart.data.ChartData;

/**
 *
 * @author inaiat
 */
public class LineChart<T extends ChartData> extends AbstractChart<T> {

    private JqPlot jqPlot = new JqPlot();
    private T chartData;

    public LineChart() {
        jqPlot.createAxesDefaults().setLabelRenderer(JqPlotClasses.CanvasAxisLabelRenderer);
        jqPlot.createXAxis().setPad(0F);
    }

    public LineChart(String title, String labelX, String labelY) {
        this();
        jqPlot.setLabelX(labelX);
        jqPlot.setLabelY(labelY);
    }

    public JqPlot getJqPlot() {
        return jqPlot;
    }

    public T getChartData() {
        return chartData;
    }

    public void setChartData(T value) {
        this.chartData = value;
    }
   
}
