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

import java.util.Arrays;
import java.util.Collection;

import br.com.digilabs.jqplot.ChartConfiguration;
import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.data.BarData;
import br.com.digilabs.jqplot.elements.PointLabels;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * Simple implementation of Bar Chart. This class can/should be extended.
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.CategoryAxisRenderer, JqPlotResources.BarRenderer, JqPlotResources.PointLabels})
public class BarChart<T extends Number> extends AbstractChart<BarData<T>, Long> {

	private static final long serialVersionUID = 3650210485517566138L;

	private BarData<T> barData = new BarData<T>();

    /**
     * Construtor
     */
    public BarChart() {
        this(null, null, null);
    }

    /**
     * Construtor
     * @param title 
     */
    public BarChart(String title) {
        this(title, null, null);
    }

    /**
     * Construtor
     * 
     * @param title
     * @param labelX
     * @param labelY 
     */
    public BarChart(String title, String labelX, String labelY) {
        ChartConfiguration<Long> chartConfiguration = getChartConfiguration();
        chartConfiguration.setTitle(new Title(title));

        SeriesDefaults seriesDefaults = new SeriesDefaults();
        RendererOptions rendererOptions = new RendererOptions();
        seriesDefaults.setRenderer(JqPlotResources.BarRenderer);
        seriesDefaults.setRendererOptions(rendererOptions);
        chartConfiguration.setSeriesDefaults(seriesDefaults);
        chartConfiguration.getSeriesDefaults().setPointLabels(new PointLabels());

        rendererOptions.setFillZero(true);

        chartConfiguration.setLabelX(labelX);
        chartConfiguration.setLabelY(labelY);

        XAxis<Long> xAxis = getChartConfiguration().createXAxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);

        getChartConfiguration().createYAxis();
    }
    
    /**
     * Adiciona um valor
     * @param value 
     */
    public void addValue(Collection<T> value) {
        barData.addValue(value);
    }

    /**
     * 
     * @param value 
     */
    public void addValues(Collection<T>... value) {
        barData.addValues(value);
    }
    
	@SuppressWarnings("unchecked")
	public void addValues(T... values) {
        barData.addValues(Arrays.<T>asList(values));
    }


    /**
     * 
     * @return charData
     */
    public BarData<T> getChartData() {
        return barData;
    }

}
