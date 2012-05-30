/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.chart;

import java.io.Serializable;
import java.util.Collection;

import br.com.digilabs.jqplot.Chart;
import br.com.digilabs.jqplot.ChartConfiguration;
import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.YAxis;
import br.com.digilabs.jqplot.data.ChartData;
import br.com.digilabs.jqplot.elements.Axes;
import br.com.digilabs.jqplot.elements.GridPadding;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.Serie;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Abstract class to help build charts.
 * 
 * @author inaiat
 * 
 * @param <S>
 *            Type of {@link Axis}
 * 
 */
public abstract class AbstractChart<T extends ChartData<?>, S extends Serializable>
	implements Chart<T> {

    private static final long serialVersionUID = -5744130130488157491L;

    private final ChartConfiguration<S> configuration;

    /**
     * Construtor
     */
    public AbstractChart() {
	this.configuration = new ChartConfiguration<S>();
    }

    public void addSeriesColors(String... colors) {
	Collection<String> seriesColor = getChartConfiguration()
		.createSeriesColors();
	seriesColor.addAll(Arrays.asList(colors));
    }

    public void addSeriesColors(Collection<String> colors) {
	Collection<String> seriesColor = getChartConfiguration()
		.createSeriesColors();
	seriesColor.addAll(colors);
    }

    public void setSeriesColors(Collection<String> colors) {
	getChartConfiguration().setSeriesColors(colors);
    }

    public Collection<String> getSeriesColors() {
	return getChartConfiguration().getSeriesColors();
    }

    /**
     * 
     * @param ticks
     */
    public void setTicks(String... ticks) {
	getChartConfiguration().getAxes().getXaxis().setTicks(ticks);
    }

    /**
     * Adiciona uma serie
     * 
     * @param serie
     */
    public void addSerie(Serie serie) {
	Collection<Serie> series = getSeries();
	if (series == null) {
	    series = new ArrayList<Serie>();
	}
	series.add(serie);
    }

    /**
     * Adiciona uma serie
     * 
     * @param series
     */
    public void addSeries(Serie... series) {
	Collection<Serie> chartSeries = getSeries();
	if (chartSeries == null) {
	    chartSeries = new ArrayList<Serie>();
	}
	for (int i = series.length - 1; i >= 0; i--) {
	    chartSeries.add(series[i]);
	}

    }

    /**
     * 
     * @return chartConfiguration
     */
    public ChartConfiguration<S> getChartConfiguration() {
	return configuration;
    }

    /**
     * 
     * @param title
     */
    public void setSimpleTitle(String title) {
	getChartConfiguration().setSimpleTitle(title);
    }

    /**
     * 
     * @param padMin
     */
    public void setPadMin(Float padMin) {
	getChartConfiguration().getAxes().getYaxis().setPadMin(1.05f);
    }

    /**
     * 
     * @return Axes
     */
    public Axes<S> createAxes() {
	return getChartConfiguration().createAxes();
    }

    /**
     * 
     * @return xAxis
     */
    public XAxis<S> createXAxis() {
	return getChartConfiguration().createXAxis();
    }

    /**
     * 
     * @return yAxis
     */
    public YAxis<S> createYAxis() {
	return getChartConfiguration().createYAxis();
    }

    /**
     * 
     * @return axis
     */
    public Axis<S> createAxesDefaults() {
	return getChartConfiguration().createAxesDefaults();
    }

    /**
     * 
     * @param label
     */
    public void setLabelX(String label) {
	getChartConfiguration().setLabelX(label);
    }

    /**
     * 
     * @param label
     */
    public void setLabelY(String label) {
	getChartConfiguration().setLabelY(label);
    }

    /**
     * @return the series
     */
    public Collection<Serie> getSeries() {
	return getChartConfiguration().createSeries();
    }

    /**
     * @param series
     *            the series to set
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
     * @param title
     *            the title to set
     */
    public void setTitle(Title title) {
	getChartConfiguration().setTitle(title);
    }

    /**
     * @return the axesDefaults
     */
    public Axis<S> getAxesDefaults() {
	return getChartConfiguration().getAxesDefaults();
    }

    /**
     * @param axesDefaults
     *            the axesDefaults to set
     */
    public void setAxesDefaults(Axis<S> axesDefaults) {
	getChartConfiguration().setAxesDefaults(axesDefaults);
    }

    /**
     * @return the axes
     */
    public Axes<S> getAxes() {
	return getChartConfiguration().getAxes();
    }

    /**
     * @param axes
     *            the axes to set
     */
    public void setAxes(Axes<S> axes) {
	getChartConfiguration().setAxes(axes);
    }

    /**
     * @return the seriesDefaults
     */
    public SeriesDefaults getSeriesDefaults() {
	return getChartConfiguration().getSeriesDefaults();
    }

    /**
     * @param seriesDefaults
     *            the seriesDefaults to set
     */
    public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
	getChartConfiguration().setSeriesDefaults(seriesDefaults);
    }

    /**
     * 
     * @param values
     */
    public void addIntervalColors(String... values) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.getIntervalColors().addAll(Arrays.asList(values));
    }

    /**
     * 
     * @param values
     */
    public void addIntervals(Integer... values) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.getIntervals().addAll(Arrays.asList(values));
    }

    /**
     * 
     * @param max
     */
    public void setMax(Integer max) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setMax(max);
    }

    /**
     * 
     * @param min
     */
    public void setMin(Integer min) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setMin(min);
    }

    /**
     * 
     * @param stackSeries
     */
    public void setStackSeries(Boolean stackSeries) {
	getChartConfiguration().setStackSeries(stackSeries);
    }

    /**
     * 
     * @param captureRightClick
     */
    public void setCaptureRightClick(Boolean captureRightClick) {
	getChartConfiguration().setCaptureRightClick(captureRightClick);
    }

    /**
     * 
     * @param highlightMouseDown
     */
    public void setHighlightMouseDown(Boolean highlightMouseDown) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setHighlightMouseDown(highlightMouseDown);
    }

    /**
     * 
     * @param margin
     */
    public void setBarMargin(Integer margin) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setBarMargin(margin);
    }

    /**
     * 
     * @param margin
     */
    public void setSliceMargin(Integer margin) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setSliceMargin(margin);
    }

    /**
     * 
     * @param dataLabels
     */
    public void setDataLabels(String dataLabels) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setDataLabels(dataLabels);
    }

    /**
     * 
     * @param width
     */
    public void setLineWidth(Integer width) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setLineWidth(width);
    }

    /**
     * 
     * @param showDataLabels
     */
    public void setShowDataLabels(Boolean showDataLabels) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setShowDataLabels(showDataLabels);
    }

    /**
     * 
     * @param fill
     */
    public void setFill(Boolean fill) {
	getChartConfiguration().getSeriesDefaults().getRendererOptions()
		.setFill(fill);
    }

    /**
     * 
     * @param alpha
     */
    public void setBubbleAlpha(Float alpha) {
	ChartConfiguration<S> chartConfiguration = getChartConfiguration();
	chartConfiguration.getSeriesDefaults().getRendererOptions()
		.setBubbleAlpha(alpha);
    }

    /**
     * 
     * @param alpha
     */
    public void setHighlightAlpha(Float alpha) {
	ChartConfiguration<S> chartConfiguration = getChartConfiguration();
	chartConfiguration.getSeriesDefaults().getRendererOptions()
		.setHighlightAlpha(alpha);
    }

    /**
     * 
     * @param showLabels
     */
    public void setShowLabels(Boolean showLabels) {
	ChartConfiguration<S> chartConfiguration = getChartConfiguration();
	chartConfiguration.getSeriesDefaults().getRendererOptions()
		.setShowLables(showLabels);
    }

    /**
     * 
     * @param alpha
     */
    public void setShadowAlpha(String alpha) {
	ChartConfiguration<S> chartConfiguration = getChartConfiguration();
	chartConfiguration.getSeriesDefaults().setShadowAlpha(alpha);
    }

    /**
     * 
     * @param fillZero
     */
    public void setFillZero(Boolean fillZero) {
	ChartConfiguration<S> chartConfiguration = getChartConfiguration();
	chartConfiguration.getSeriesDefaults().getRendererOptions()
		.setFillZero(fillZero);
    }

    /**
     * 
     * @param shadow
     */
    public void setShadow(Boolean shadow) {
	ChartConfiguration<S> chartConfiguration = getChartConfiguration();
	chartConfiguration.getSeriesDefaults().setShadow(shadow);
    }

    /**
     * 
     * @param legend
     */
    public void setLegend(Legend legend) {
	getChartConfiguration().setLegend(legend);
    }

    public void setGridPadding(GridPadding gridPadding) {
	getChartConfiguration().setGridPadding(gridPadding);
    }

    public GridPadding getGridPadding() {
	return getChartConfiguration().getGridPadding();
    }
}
