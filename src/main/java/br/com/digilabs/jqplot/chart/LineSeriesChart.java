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

import java.util.Collection;

import br.com.digilabs.jqplot.ChartConfiguration;
import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.LineSeriesData;
import br.com.digilabs.jqplot.data.item.LineSeriesItem;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * 
 * Simple implementation of Line Series Chart. This class can/should be
 * extended.
 * 
 * @author inaiat
 * 
 * @param <I>
 *            type of index of serie
 * @param <V>
 *            type of value of serie
 */
@JqPlotPlugin(values = { JqPlotResources.CanvasTextRenderer, 
	JqPlotResources.CategoryAxisRenderer, 
	JqPlotResources.CanvasAxisLabelRenderer, 
	JqPlotResources.CanvasAxisTickRenderer, 
	JqPlotResources.CanvasOverlay, 
	JqPlotResources.DateAxisRenderer })
public class LineSeriesChart<I extends Number, V extends Number> extends
		AbstractChart<LineSeriesData<I, V>, String> {

	private static final long serialVersionUID = -563079287340319412L;

	private final ChartConfiguration<String> chartConfig;

	private LineSeriesData<I, V> data = new LineSeriesData<I, V>();

	public LineSeriesChart(String title) {
		this(title, null, null);
	}

	public LineSeriesChart(String title, String labelX, String labelY) {
		this.chartConfig = new ChartConfiguration<String>();
		chartConfig.setTitle(new Title(title))
			.setLabelX(labelX)
			.setLabelY(labelY);
	}

	public LineSeriesData<I, V> getChartData() {
		return data;
	}

	public void addValue(Collection<LineSeriesItem<I, V>> value) {
		data.addValue(value);
	}

	public void addValues(Collection<LineSeriesItem<I, V>>... values) {
		data.addValues(values);
	}

	@Override
	public ChartConfiguration<String> getChartConfiguration() {
		return chartConfig;
	}

}
