/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.chart.config.ChartConfiguration;
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
public class DefaultChart<T extends ChartData> implements Chart<T> {

    private final ChartConfiguration jqPlot;
    private T chartData;

    public DefaultChart() {
        this.jqPlot = new ChartConfiguration();
    }   

    public ChartConfiguration getChartConfiguration() {
        return jqPlot;
    }

    public T getChartData() {
        return chartData;
    }

    public void setChartData(T value) {
        this.chartData = value;
    }

    public void setSimpleTitle(String title) {
        getChartConfiguration().setSimpleTitle(title);
    }

    public Axes createAxes() {
        return getChartConfiguration().createAxes();
    }

    public XAxis createXAxis() {
        return getChartConfiguration().createXAxis();
    }

    public YAxis createYAxis() {
        return getChartConfiguration().createYAxis();
    }

    public Axis createAxesDefaults() {
        return getChartConfiguration().createAxesDefaults();
    }

    public void setLabelX(String label) {
        getChartConfiguration().setLabelX(label);
    }

    public void setLabelY(String label) {
        getChartConfiguration().setLabelY(label);
    }

    /**
     * @return the series
     */
    public Collection<Serie> getSeries() {
        return getChartConfiguration().getSeries();
    }

    /**
     * @param series the series to set
     */
    public void setSeries(Collection<Serie> series) {
        this.getChartConfiguration().setSeries(series);
    }

    /**
     * @return the title
     */
    public Title getTitle() {
        return getChartConfiguration().getTitle();
    }

    /**
     * @param title the title to set
     */
    public void setTitle(Title title) {
        getChartConfiguration().setTitle(title);
    }

    /**
     * @return the axesDefaults
     */
    public Axis getAxesDefaults() {
        return getChartConfiguration().getAxesDefaults();
    }

    /**
     * @param axesDefaults the axesDefaults to set
     */
    public void setAxesDefaults(Axis axesDefaults) {
        getChartConfiguration().setAxesDefaults(axesDefaults);
    }

    /**
     * @return the axes
     */
    public Axes getAxes() {
        return getChartConfiguration().getAxes();
    }

    /**
     * @param axes the axes to set
     */
    public void setAxes(Axes axes) {
        getChartConfiguration().setAxes(axes);
    }

    /**
     * @return the seriesDefaults
     */
    public SeriesDefaults getSeriesDefaults() {
        return getChartConfiguration().getSeriesDefaults();
    }

    /**
     * @param seriesDefaults the seriesDefaults to set
     */
    public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
        getChartConfiguration().setSeriesDefaults(seriesDefaults);
    }
}
