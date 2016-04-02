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

import br.com.digilabs.jqplot.ChartConfiguration;
import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.BarData;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

import java.util.Arrays;
import java.util.Collection;

/**
 * Simple implementation of Bar Chart. This class can/should be extended.
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.CategoryAxisRenderer, JqPlotResources.BarRenderer, JqPlotResources.PointLabels})
public class BarChart<T extends Number> extends AbstractChart<BarData<T>, Long> {

	private static final long serialVersionUID = 3650210485517566138L;
	
	private final ChartConfiguration<Long> chartConfig;

	private BarData<T> barData = new BarData<T>();

    /**
     * Construtor
     */
    public BarChart() {
        this(null, null, null);
    }

    /**
     * Construtor
     * @param title  Set title of bar chart
     */
    public BarChart(String title) {
        this(title, null, null);
    }

    /**
     * Construtor
     * 
     * @param title Tilte
     * @param labelX Label for axis x
     * @param labelY Label for axis y
     */
    public BarChart(String title, String labelX, String labelY) {
    	this.chartConfig = new ChartConfiguration<Long>();
    	
    	chartConfig
    		.setTitle(new Title(title))
        	.seriesDefaultsInstance()
        	.pointLabelsInstance();
        	
    	chartConfig
        	.setLabelX(labelX)
        	.setLabelY(labelY)
        	.seriesDefaultsInstance()
        	.setRenderer(JqPlotResources.BarRenderer)
        	.setFill(true);
        
    	chartConfig
        	.axesInstance()
        	.xAxisInstance()
        	.setRenderer(JqPlotResources.CategoryAxisRenderer);
    }
    
    /**
     * Add a value for bar chart
     * @param value  Set collection of values
     */
    public void addValue(Collection<T> value) {
        barData.addValue(value);
    }

	/**
	 * Add a value for bar chart
	 * @param value  Set collection of values
	 */
    public void addValues(Collection<T>... value) {
        barData.addValues(value);
    }
    
	@SuppressWarnings("unchecked")
	/**
	 * Add a value for bar chart
	 * @param value  Set values
	 */
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

	@Override
	public ChartConfiguration<Long> getChartConfiguration() {
		return this.chartConfig;
	}

}
