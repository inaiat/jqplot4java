/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import java.util.Collection;
import jqplot.axis.Axis;
import jqplot.axis.XAxis;
import jqplot.axis.YAxis;
import jqplot.chart.data.ChartData;
import jqplot.chart.elements.Axes;
import jqplot.chart.elements.Serie;
import jqplot.chart.elements.SeriesDefaults;
import jqplot.chart.elements.Title;

/**
 *
 * @author inaiat
 */
public abstract class AbstractChart<T extends ChartData> implements Chart<T> {

    private final JqPlot jqPlot;
    private T chartData;

    public AbstractChart() {
        this.jqPlot = new JqPlot();
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

    public void setSimpleTitle(String title) {
        getJqPlot().setSimpleTitle(title);
    }

    public Axes createAxes() {
        return getJqPlot().createAxes();
    }

    public XAxis createXAxis() {
        return getJqPlot().createXAxis();
    }

    public YAxis createYAxis() {
        return getJqPlot().createYAxis();
    }

    public Axis createAxesDefaults() {
        return getJqPlot().createAxesDefaults();
    }

    public void setLabelX(String label) {
        getJqPlot().setLabelX(label);
    }

    public void setLabelY(String label) {
        getJqPlot().setLabelY(label);
    }

    /**
     * @return the series
     */
    public Collection<Serie> getSeries() {
        return getJqPlot().getSeries();
    }

    /**
     * @param series the series to set
     */
    public void setSeries(Collection<Serie> series) {
        this.getJqPlot().setSeries(series);
    }

    /**
     * @return the title
     */
    public Title getTitle() {
        return getJqPlot().getTitle();
    }

    /**
     * @param title the title to set
     */
    public void setTitle(Title title) {
        getJqPlot().setTitle(title);
    }

    /**
     * @return the axesDefaults
     */
    public Axis getAxesDefaults() {
        return getJqPlot().getAxesDefaults();
    }

    /**
     * @param axesDefaults the axesDefaults to set
     */
    public void setAxesDefaults(Axis axesDefaults) {
        getJqPlot().setAxesDefaults(axesDefaults);
    }

    /**
     * @return the axes
     */
    public Axes getAxes() {
        return getJqPlot().getAxes();
    }

    /**
     * @param axes the axes to set
     */
    public void setAxes(Axes axes) {
        getJqPlot().setAxes(axes);
    }

    /**
     * @return the seriesDefaults
     */
    public SeriesDefaults getSeriesDefaults() {
        return getJqPlot().getSeriesDefaults();
    }

    /**
     * @param seriesDefaults the seriesDefaults to set
     */
    public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
        getJqPlot().setSeriesDefaults(seriesDefaults);
    }
}
