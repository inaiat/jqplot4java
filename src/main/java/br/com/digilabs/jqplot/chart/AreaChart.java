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

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.data.AreaFillData;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;

import java.util.List;

/**
 * Simple implementation of Area Chart. This class can/should be extended.
 *
 * @param <T> the generic type
 * @author inaiat
 */
public class AreaChart<T extends Number> extends AbstractChart<AreaFillData<T>,String> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6050878600406620553L;

	/** The data. */
	private AreaFillData<T> data = new AreaFillData<T>();
    
    /**
     * Instantiates a new area chart.
     */
    public AreaChart() {
        this(null);
    }

    /**
     * Instantiates a new area chart.
     *
     * @param title the title
     */
    public AreaChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setStackSeries(true);
        getChartConfiguration().setShowMarker(false);
        SeriesDefaults defaults = new SeriesDefaults();
        defaults.setFill(true);
        setSeriesDefaults(defaults);
        XAxis<String> xAxis = getChartConfiguration().withAxes().withXaxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);
    }

    /* (non-Javadoc)
     * @see br.com.digilabs.jqplot.Chart#getChartData()
     */
    public AreaFillData<T> getChartData() {
        return data;
    }

    /**
     * Adds the value.
     *
     * @param value the value
     */
    public void addValue(List<T> value) {
        data.addValue(value);
    }

    /**
     * Adds the values.
     *
     * @param value the value
     */
    public void addValues(List<T>... value) {
        data.addValues(value);
    }
}
