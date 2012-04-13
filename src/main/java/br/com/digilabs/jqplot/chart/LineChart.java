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
import br.com.digilabs.jqplot.data.LinedData;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 *Simple implementation of Line Chart. This class can/should be extended.
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.CanvasTextRenderer, JqPlotResources.CategoryAxisRenderer})
public class LineChart<T extends Number> extends AbstractChart<LinedData<T>,String> {

	private static final long serialVersionUID = -643105267124184518L;

	private LinedData<T> linedData = new LinedData<T>();

    /**
     * Construtor
     */
    public LineChart() {
        this(null, null, null);
    }

    /**
     * Construtor
     * @param title 
     */
    public LineChart(String title) {
        this(title, null, null);
    }

    /**
     * Construtor
     * 
     * @param title
     * @param labelX
     * @param labelY 
     */
    public LineChart(String title, String labelX, String labelY) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().createAxesDefaults().setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
        getChartConfiguration().createXAxis().setPad(0F);
        getChartConfiguration().setLabelX(labelX);
        getChartConfiguration().setLabelY(labelY);
    }

    /**
     * 
     * @param value 
     */
    public void addValue(T value) {
        linedData.addValue(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(T... values) {
        linedData.addValues(values);
    }

    /**
     * 
     * @return 
     */
    public LinedData<T> getChartData() {
        return linedData;
    }
}
