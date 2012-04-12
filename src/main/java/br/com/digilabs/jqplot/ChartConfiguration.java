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
import br.com.digilabs.jqplot.axis.AxisString;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.YAxis;
import br.com.digilabs.jqplot.elements.*;

import java.util.ArrayList;

/**
 *
 * Base configuration of JqPlot Chart. See jqplot documention http://www.jqplot.com/docs/files/usage-txt.html
 *
 * @author inaiat
 */
public class ChartConfiguration implements Serializable {


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7082325039222592701L;
	
	/** The series. */
	protected Collection<Serie> series;
	
	/** The axes. */
	protected Axes axes;
	
	/** The title. */
	protected Title title;
	
	/** The axes defaults. */
	protected Axis axesDefaults;
	
	/** The series defaults. */
	private SeriesDefaults seriesDefaults;
	
	/** The stack series. */
	private Boolean stackSeries;
	
	/** The show marker. */
	private Boolean showMarker;
	
	/** The legend. */
	private Legend legend;
	
	/** The capture right click. */
	private Boolean captureRightClick = null;
	
	/** The series colors. */
	private Collection<String> seriesColors;
	/** The cursor. */
	private Cursor cursor;


	/**
	 *
	 * @return
	/** The animate. */
	private Boolean animate;
	
	/** The highlighter. */
	private Highlighter highlighter;
	
	/** The grid. */
	private Grid grid;

	/**
	 * Checks if is capture right click.
	 *
	 * @return the boolean
	 */
	public Boolean isCaptureRightClick() {
		return captureRightClick;
	}

	/**
	 *
	 * Sets the capture right click.
	 *
	 * @param captureRightClick the new capture right click
	 */
	public void setCaptureRightClick(Boolean captureRightClick) {
		this.captureRightClick = captureRightClick;
	}

	/**
	 * Gets the legend.
	 *
	 * @return the legend
	 */
	public Legend getLegend() {
		return legend;
	}

	/**
	 * Sets the legend.
	 *
	 * @param legend the new legend

	 */
	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	/**
	 * Sets the simple title.
	 *
	 * @param title the new simple title
	 */
	public void setSimpleTitle(String title) {
		if (title == null) {
			this.title = new Title(title);
		} else {
			this.title.setText(title);
		}
	}
	
	/**
	 * Creates the grid.
	 *
	 * @return the grid
	 */
	public Grid createGrid() {
		if (grid == null) {
			grid = new Grid();
		}
		return grid;
	}

	/**
	 * Creates the axes.
	 *
	 * @return the axes
	 */
	public Axes createAxes() {
		if (axes == null) {
			this.axes = new Axes();
		}
		return this.axes;
	}

	/**
	 * Creates the x axis.
	 *
	 * @return the x axis
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
	 * Creates the y axis.
	 *
	 * @return the y axis
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
	 * Creates the axes defaults.
	 *
	 * @return the axis
	 */
	public Axis createAxesDefaults() {
		if (axesDefaults == null) {
			axesDefaults = new AxisString();
		}
		return axesDefaults;
	}

	/**
	 * Sets the label x.
	 *
	 * @param label the new label x
	 */
	public void setLabelX(String label) {
		if (label != null) {
			createXAxis().setLabel(label);
		}
	}

	/**
	 * Sets the label y.
	 *
	 * @param label the new label y
	 */
	public void setLabelY(String label) {
		if (label != null) {
			createYAxis().setLabel(label);
		}
	}

	/**
	 * Creates the series.
	 *
	 * @return the collection
	 */
	public Collection<Serie> createSeries() {
		if (series == null) {
			series = new ArrayList<Serie>();
		}
		return series;

	}

	/**
	 * Gets the series.
	 *
	 * @return the series
	 */
	public Collection<Serie> getSeries() {
        if(series == null)
            series = new ArrayList<Serie>();
		return series;
	}

	/**
	 * Sets the series.
	 *
	 * @param series the series to set
	 */
	public void setSeries(Collection<Serie> series) {
		this.series = series;
	}

	/**
	 * Adds the series.
	 *
	 * @param serie the serie
	 */
	public void addSeries(Serie serie) {
		this.createSeries().add(serie);
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public Title getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the title to set
	 */
	public void setTitle(Title title) {
		this.title = title;
	}

	/**
	 * Gets the axes defaults.
	 *
	 * @return the axesDefaults
	 */
	public Axis getAxesDefaults() {
		return axesDefaults;
	}

	/**
	 * Sets the axes defaults.
	 *
	 * @param axesDefaults the axesDefaults to set
	 */
	public void setAxesDefaults(Axis axesDefaults) {
		this.axesDefaults = axesDefaults;
	}

	/**
	 * Gets the axes.
	 *
	 * @return the axes
	 */
	public Axes getAxes() {
		return axes;
	}

	/**
	 * Sets the axes.
	 *
	 * @param axes the axes to set
	 */
	public void setAxes(Axes axes) {
		this.axes = axes;
	}

	/**
	 * Creates the series defaults.
	 *
	 * @return the series defaults
	 */
	public SeriesDefaults createSeriesDefaults() {
		if (seriesDefaults == null) {
			seriesDefaults = new SeriesDefaults();
		}
		return seriesDefaults;
	}

	/**
	 * Gets the series defaults.
	 *
	 * @return the seriesDefaults
	 */
	public SeriesDefaults getSeriesDefaults() {
		return seriesDefaults;
	}

	/**
	 * Sets the series defaults.
	 *
	 * @param seriesDefaults the seriesDefaults to set
	 */
	public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
		this.seriesDefaults = seriesDefaults;
	}

	/**
	 * Gets the stack series.
	 *
	 * @return the stackSeries
	 */
	public Boolean getStackSeries() {
		return stackSeries;
	}

	/**
	 * Sets the stack series.
	 *
	 * @param stackSeries the stackSeries to set
	 */
	public void setStackSeries(Boolean stackSeries) {
		this.stackSeries = stackSeries;
	}

	/**
	 * Gets the show marker.
	 *
	 * @return the showMarker
	 */
	public Boolean getShowMarker() {
		return showMarker;
	}

	/**
	 * Sets the show marker.
	 *
	 * @param showMarker the showMarker to set
	 */
	public void setShowMarker(Boolean showMarker) {
		this.showMarker = showMarker;
	}

	/**
	 * Creates the series colors.
	 *
	 * @return the collection
	 */
	public Collection<String> createSeriesColors() {
    	if (this.seriesColors==null) {
    		this.seriesColors = new ArrayList<String>();
    	}
    	return seriesColors;
    }

	/**
	 * Gets the series colors.
	 *
	 * @return the series colors
	 */
	public Collection<String> getSeriesColors() {
		return seriesColors;
	}

	/**
	 * Sets the series colors.
	 *
	 * @param seriesColor the new series colors
	 */
	public void setSeriesColors(Collection<String> seriesColor) {
		this.seriesColors = seriesColor;
	}


	/**
	 * Gets the animate.
	 *
	 * @return animate property
	 */
	public Boolean getAnimate() {
		return animate;
	}


    /** Turns on animation for all series in this plot.
     * @param animate true, false
     */
    public void setAnimate(Boolean animate) {
        this.animate = animate;
    }

    

    /**
     * @return hightLighter
     */
    public Highlighter getHighlighter() {
        return highlighter;
    }

    /**
     * set the highlighter
     * @param highlighter property
     */
    public void setHighlighter(Highlighter highlighter) {
        this.highlighter = highlighter;
    }


	/**
	 * Creates the highlighter.
	 *
	 * @return the highlighter
	 */
	public Highlighter createHighlighter() {
		if (highlighter == null) {
			highlighter = new Highlighter();
		}
		return highlighter;
	}



	/**
	 * Set the cursor
	 * @param cursor
	 */
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}

	/**
	 * Gets the grid.
	 *
	 * @return the grid
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * Sets the grid.
	 *
	 * @param grid the new grid
	 */
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
    
	
    
}
