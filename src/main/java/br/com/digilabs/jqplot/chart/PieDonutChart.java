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


import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.PieDonutData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.DonutRenderer})
public class PieDonutChart<T extends Number> extends AbstractChart<PieDonutData<T>,String> {

	private static final long serialVersionUID = -4671992800819368331L;

	PieDonutData<T> data = new PieDonutData<T>();

    /**
     * Construtor
     */
    public PieDonutChart() {
        this(null);
    }

    /**
     * 
     * @param title 
     */
    public PieDonutChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(
                JqPlotResources.DonutRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(
                new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setSliceMargin(4);
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setDataLabels("value");
    }

    /**
     * 
     * @param value 
     */
    public void addValue(Collection<LabeledItem<T>> value) {
        data.addValue(value);
    }

    /**
     * 
     * @return 
     */
    public PieDonutData<T> getChartData() {
        return data;
    }
}
