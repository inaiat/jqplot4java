package br.com.digilabs.jqplot.chart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import br.com.digilabs.jqplot.JqPlotConfiguration;
import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.YAxis;
import br.com.digilabs.jqplot.data.ChartData;
import br.com.digilabs.jqplot.elements.Axes;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.Serie;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;

/**
 *
 * @author inaiat
 */
public abstract class AbstractChart<T extends ChartData<?>> implements Chart<T> {

    private final JqPlotConfiguration configuration;

    public AbstractChart() {
        this.configuration = new JqPlotConfiguration();
    }

    public void setTicks(String... ticks) {
        getChartConfiguration().getAxes().getXaxis().setTicks(ticks);
    }

    public void addSerie(Serie serie) {
        Collection<Serie> series = getSeries();
        if (series == null) {
            series = new ArrayList<Serie>();
        }
        series.add(serie);
    }

    public void addSeries(Serie... series) {
        Collection<Serie> chartSeries = getSeries();
        if (chartSeries == null) {
            chartSeries = new ArrayList<Serie>();
        }
        for(int i = series.length -1; i >= 0; i--){
            chartSeries.add(series[i]);
        }
        

    }

    public JqPlotConfiguration getChartConfiguration() {
        return configuration;
    }

    public void setSimpleTitle(String title) {
        getChartConfiguration().setSimpleTitle(title);
    }

    public void setPadMin(Float padMin) {
        getChartConfiguration().getAxes().getYaxis().setPadMin(1.05f);
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

    public void addIntervalColors(String... values) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().getIntervalColors().addAll(Arrays.asList(values));
    }

    public void addIntervals(Integer... values) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().getIntervals().addAll(Arrays.asList(values));
    }

    public void setMax(Integer max) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setMax(max);
    }

    public void setMin(Integer min) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setMin(min);
    }

    public void setStackSeries(Boolean stackSeries) {
        getChartConfiguration().setStackSeries(stackSeries);
    }

    public void setCaptureRightClick(Boolean captureRightClick) {
        getChartConfiguration().setCaptureRightClick(captureRightClick);
    }

    public void setHighlightMouseDown(Boolean highlightMouseDown) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setHighlightMouseDown(highlightMouseDown);
    }

    public void setBarMargin(Integer margin) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setBarMargin(margin);
    }

    public void setSliceMargin(Integer margin) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setSliceMargin(margin);
    }

    public void setDataLabels(String dataLabels) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setDataLabels(dataLabels);
    }

    public void setLineWidth(Integer width) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setLineWidth(width);
    }

    public void setShowDataLabels(Boolean showDataLabels) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(showDataLabels);
    }

    public void setFill(Boolean fill) {
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setFill(fill);
    }

    public void setBubbleAlpha(Float alpha) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.getSeriesDefaults().getRendererOptions().setBubbleAlpha(alpha);
    }

    public void setHighlightAlpha(Float alpha) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.getSeriesDefaults().getRendererOptions().setHighlightAlpha(alpha);
    }

    public void setShowLabels(Boolean showLabels) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.getSeriesDefaults().getRendererOptions().setShowLables(showLabels);
    }

    public void setShadowAlpha(Float alpha) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.getSeriesDefaults().setShadowAlpha(alpha);
    }

    public void setFillZero(Boolean fillZero) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.getSeriesDefaults().getRendererOptions().setFillZero(fillZero);
    }

    public void setShadow(Boolean shadow) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.getSeriesDefaults().setShadow(shadow);
    }

    public void setLegend(Legend legend) {
        getChartConfiguration().setLegend(legend);
    }
}
