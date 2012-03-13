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
package br.com.digilabs.jqplot;

import java.io.Serializable;
import java.util.Collection;

import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.YAxis;
import br.com.digilabs.jqplot.elements.Axes;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.Serie;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;

import java.util.ArrayList;

/**
 * 
 * Base configuration of JqPlot Chart. See jqplot documention http://www.jqplot.com/docs/files/usage-txt.html
 * 
 * @author inaiat
 */
public class ChartConfiguration implements Serializable {

	private static final long serialVersionUID = 7082325039222592701L;
	protected Collection<Serie> series;
	protected Axes axes;
	protected Title title;
	protected Axis axesDefaults;
	private SeriesDefaults seriesDefaults;
	private Boolean stackSeries;
	private Boolean showMarker;
	private Legend legend;
	private Boolean captureRightClick = null;
	private Collection<String> seriesColors;

	/**
	 * 
	 * @return
	 */
	public Boolean isCaptureRightClick() {
		return captureRightClick;
	}

	/**
	 * 
	 * @param captureRightClick
	 */
	public void setCaptureRightClick(Boolean captureRightClick) {
		this.captureRightClick = captureRightClick;
	}

	/**
	 * 
	 * @return
	 */
	public Legend getLegend() {
		return legend;
	}

	/**
	 * 
	 * @param legend
	 */
	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	/**
	 * 
	 * @param title
	 */
	public void setSimpleTitle(String title) {
		if (title == null) {
			this.title = new Title(title);
		} else {
			this.title.setText(title);
		}
	}

	/**
	 * 
	 * @return
	 */
	public Axes createAxes() {
		if (axes == null) {
			this.axes = new Axes();
		}
		return this.axes;
	}

	/**
	 * 
	 * @return
	 */
	public XAxis createXAxis() {
		Axes newAxes = createAxes();
		if (newAxes.getXaxis() == null) {
			XAxis xAxis = new XAxis();
			newAxes.setXaxis(xAxis);
		}
		return newAxes.getXaxis();
	}

	/**
	 * 
	 * @return
	 */
	public YAxis createYAxis() {
		Axes newAxes = createAxes();
		if (newAxes.getYaxis() == null) {
			YAxis yAxis = new YAxis();
			newAxes.setYaxis(yAxis);
		}
		return newAxes.getYaxis();
	}

	/**
	 * 
	 * @return
	 */
	public Axis createAxesDefaults() {
		if (axesDefaults == null) {
			axesDefaults = new Axis();
		}
		return axesDefaults;
	}

	/**
	 * 
	 * @param label
	 */
	public void setLabelX(String label) {
		if (label != null) {
			createXAxis().setLabel(label);
		}
	}

	/**
	 * 
	 * @param label
	 */
	public void setLabelY(String label) {
		if (label != null) {
			createYAxis().setLabel(label);
		}
	}

	public Collection<Serie> createSeries() {
		if (series == null) {
			series = new ArrayList<Serie>();
		}
		return series;

	}

	/**
	 * @return the series
	 */
	public Collection<Serie> getSeries() {
		return series;
	}

	/**
	 * @param series
	 *            the series to set
	 */
	public void setSeries(Collection<Serie> series) {
		this.series = series;
	}

	/**
	 * 
	 * @param serie
	 */
	public void addSeries(Serie serie) {
		this.createSeries().add(serie);
	}

	/**
	 * @return the title
	 */
	public Title getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(Title title) {
		this.title = title;
	}

	/**
	 * @return the axesDefaults
	 */
	public Axis getAxesDefaults() {
		return axesDefaults;
	}

	/**
	 * @param axesDefaults
	 *            the axesDefaults to set
	 */
	public void setAxesDefaults(Axis axesDefaults) {
		this.axesDefaults = axesDefaults;
	}

	/**
	 * @return the axes
	 */
	public Axes getAxes() {
		return axes;
	}

	/**
	 * @param axes
	 *            the axes to set
	 */
	public void setAxes(Axes axes) {
		this.axes = axes;
	}

	public SeriesDefaults createSeriesDefaults() {
		if (seriesDefaults == null) {
			seriesDefaults = new SeriesDefaults();
		}
		return seriesDefaults;
	}

	/**
	 * @return the seriesDefaults
	 */
	public SeriesDefaults getSeriesDefaults() {
		return seriesDefaults;
	}

	/**
	 * @param seriesDefaults
	 *            the seriesDefaults to set
	 */
	public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
		this.seriesDefaults = seriesDefaults;
	}

	/**
	 * @return the stackSeries
	 */
	public Boolean getStackSeries() {
		return stackSeries;
	}

	/**
	 * @param stackSeries
	 *            the stackSeries to set
	 */
	public void setStackSeries(Boolean stackSeries) {
		this.stackSeries = stackSeries;
	}

	/**
	 * @return the showMarker
	 */
	public Boolean getShowMarker() {
		return showMarker;
	}

	/**
	 * @param showMarker
	 *            the showMarker to set
	 */
	public void setShowMarker(Boolean showMarker) {
		this.showMarker = showMarker;
	}

	public Collection<String> createSeriesColors() {
    	if (this.seriesColors==null) {
    		this.seriesColors = new ArrayList<String>();
    	}
    	return seriesColors;
    }

	public Collection<String> getSeriesColors() {
		return seriesColors;
	}

	public void setSeriesColors(Collection<String> seriesColor) {
		this.seriesColors = seriesColor;
	}
}
