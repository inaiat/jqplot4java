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
import java.util.ArrayList;
import java.util.Arrays;
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


    public AbstractChart<T, S> addSeriesColors(String... colors) {

	getChartConfiguration().seriesColorsInstance()
		.addAll(Arrays.asList(colors));
	return this;
    }

    public AbstractChart<T, S> addSeriesColors(Collection<String> colors) {
	getChartConfiguration().seriesColorsInstance().addAll(colors);
	return this;
    }

    public AbstractChart<T, S> setSeriesColors(Collection<String> colors) {
	getChartConfiguration().setSeriesColors(colors);
	return this;
    }

    public Collection<String> getSeriesColors() {
	return getChartConfiguration().seriesColorsInstance();
    }

    /**
     * Adiciona uma serie
     * 
     * @param serie
     */
    public AbstractChart<T, S> addSerie(Serie serie) {
	Collection<Serie> series = getSeries();
	if (series == null) {
	    series = new ArrayList<Serie>();
	}
	series.add(serie);
	return this;
    }

    /**
     * Adiciona uma serie
     * 
     * @param series
     */
    public AbstractChart<T, S> addSeries(Serie... series) {
	Collection<Serie> chartSeries = getSeries();
	if (chartSeries == null) {
	    chartSeries = new ArrayList<Serie>();
	}
	for (int i = series.length - 1; i >= 0; i--) {
	    chartSeries.add(series[i]);
	}
	return this;

    }

    /**
     * 
     * @return chartConfiguration
     */
    public abstract ChartConfiguration<S> getChartConfiguration();

    /**
     * 
     * @param title
     */
    public AbstractChart<T, S> setSimpleTitle(String title) {
	getChartConfiguration().setSimpleTitle(title);
	return this;
    }

    /**
     * 
     * @return Axes
     */
    @Deprecated
    public Axes<S> createAxes() {
	return getChartConfiguration().createAxes();
    }

    /**
     * 
     * @return xAxis
     */
    @Deprecated
    public XAxis<S> createXAxis() {
	return getChartConfiguration().createXAxis();
    }

    /**
     * 
     * @return yAxis
     */
    @Deprecated
    public YAxis<S> createYAxis() {
	return getChartConfiguration().createYAxis();
    }

    /**
     * 
     * @return axis
     */
    @Deprecated
    public Axis<S> createAxesDefaults() {
	return getChartConfiguration().createAxesDefaults();
    }

    /**
     * 
     * @param label
     */
    public AbstractChart<T, S> setLabelX(String label) {
	getChartConfiguration().setLabelX(label);
	return this;
    }

    /**
     * 
     * @param label
     */
    public AbstractChart<T, S> setLabelY(String label) {
	getChartConfiguration().setLabelY(label);
	return this;
    }

    /**
     * @return the series
     */
    public Collection<Serie> getSeries() {
	return getChartConfiguration().seriesInstance();
    }

    /**
     * @param series
     *            the series to set
     */
    public AbstractChart<T, S> setSeries(Collection<Serie> series) {
	this.getChartConfiguration().setSeries(series);
	return this;
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
    public AbstractChart<T, S> setTitle(Title title) {
	getChartConfiguration().setTitle(title);
	return this;
    }

    /**
     * @return the axesDefaults
     */
    public Axis<S> getAxesDefaults() {
	return getChartConfiguration().axesDefaultsInstance();
    }

    /**
     * @param axesDefaults
     *            the axesDefaults to set
     */
    public AbstractChart<T, S> setAxesDefaults(Axis<S> axesDefaults) {
	getChartConfiguration().setAxesDefaults(axesDefaults);
	return this;
    }

    /**
     * @return the seriesDefaults
     */
    public SeriesDefaults getSeriesDefaults() {
	return getChartConfiguration().seriesDefaultsInstance();
    }

    /**
     * @param seriesDefaults
     *            the seriesDefaults to set
     */
    public AbstractChart<T, S> setSeriesDefaults(SeriesDefaults seriesDefaults) {
	getChartConfiguration().setSeriesDefaults(seriesDefaults);
	return this;
    }

    /**
     * 
     * @param values
     */
    public AbstractChart<T, S> addIntervalColors(String... values) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.getIntervalColors().addAll(Arrays.asList(values));
	return this;
    }

    /**
     * 
     * @param values
     */
    public AbstractChart<T, S> addIntervals(Integer... values) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.getIntervals().addAll(Arrays.asList(values));
	return this;
    }

    /**
     * 
     * @param stackSeries
     */
    public AbstractChart<T, S> setStackSeries(Boolean stackSeries) {
	getChartConfiguration().setStackSeries(stackSeries);
	return this;
    }

    /**
     * 
     * @param captureRightClick
     */
    public AbstractChart<T, S> setCaptureRightClick(Boolean captureRightClick) {
	getChartConfiguration().setCaptureRightClick(captureRightClick);
	return this;
    }

    /**
     * 
     * @param highlightMouseDown
     */
    public AbstractChart<T, S> setHighlightMouseDown(Boolean highlightMouseDown) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setHighlightMouseDown(highlightMouseDown);
	return this;
    }

    /**
     * 
     * @param margin
     */
    public AbstractChart<T, S> setBarMargin(Integer margin) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setBarMargin(margin);
	return this;
    }

    /**
     * 
     * @param margin
     */
    public AbstractChart<T, S> setSliceMargin(Integer margin) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setSliceMargin(margin);
	return this;
    }

    /**
     * 
     * @param dataLabels
     */
    public AbstractChart<T, S> setDataLabels(String dataLabels) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setDataLabels(dataLabels);
	return this;
    }

    /**
     * 
     * @param width
     */
    public AbstractChart<T, S> setLineWidth(Integer width) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setLineWidth(width);
	return this;
    }

    /**
     * 
     * @param showDataLabels
     */
    public AbstractChart<T, S> setShowDataLabels(Boolean showDataLabels) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setShowDataLabels(showDataLabels);
	return this;
    }

    /**
     * 
     * @param fill
     */
    public AbstractChart<T, S> setFill(Boolean fill) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setFill(fill);
	return this;
    }

    /**
     * 
     * @param alpha
     */
    public AbstractChart<T, S> setBubbleAlpha(Float alpha) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setBubbleAlpha(alpha);
	return this;
    }

    /**
     * 
     * @param alpha
     */
    public AbstractChart<T, S> setHighlightAlpha(Float alpha) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setHighlightAlpha(alpha);
	return this;
    }

    /**
     * 
     * @param showLabels
     */
    public AbstractChart<T, S> setShowLabels(Boolean showLabels) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setShowLables(showLabels);
	return this;
    }

    /**
     * 
     * @param alpha
     */
    public AbstractChart<T, S> setShadowAlpha(String alpha) {
	getChartConfiguration().seriesDefaultsInstance().setShadowAlpha(alpha);
	return this;
    }

    /**
     * 
     * @param fillZero
     */
    public AbstractChart<T, S> setFillZero(Boolean fillZero) {
	getChartConfiguration().seriesDefaultsInstance().getRendererOptions()
		.setFillZero(fillZero);
	return this;
    }

    /**
     * 
     * @param shadow
     */
    public AbstractChart<T, S> setShadow(Boolean shadow) {
	getChartConfiguration().getSeriesDefaults().setShadow(shadow);
	return this;
    }

    /**
     * 
     * @param legend
     */
    public AbstractChart<T, S> setLegend(Legend legend) {
	getChartConfiguration().setLegend(legend);
	return this;
    }

    public AbstractChart<T, S> setGridPadding(GridPadding gridPadding) {
	getChartConfiguration().setGridPadding(gridPadding);
	return this;
    }

    public GridPadding getGridPadding() {
	return getChartConfiguration().getGridPadding();
    }

    /**
     * @return the axes
     */
    public Axes<S> getAxes() {
	return getChartConfiguration().axesInstance();
    }

    /**
     * @param axes
     *            the axes to set
     */
    public AbstractChart<T, S> setAxes(Axes<S> axes) {
	getChartConfiguration().setAxes(axes);
	return this;
    }

    public XAxis<S> getXAxis() {
	return getChartConfiguration().xAxisInstance();
    }

    public YAxis<S> getYAxis() {
	return getChartConfiguration().yAxisInstance();
    }
}
