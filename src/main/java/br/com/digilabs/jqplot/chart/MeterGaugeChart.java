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
import br.com.digilabs.jqplot.data.MeterData;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * Simple implementation of Meter Gauge Chart. This class can/should be extended.
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.MeterGaugeRenderer})
public class MeterGaugeChart extends AbstractChart<MeterData,String> {

    private static final long serialVersionUID = -8122703368130701972L;
    private MeterData data = new MeterData(0F);

    /**
     * Construtor
     */
    public MeterGaugeChart() {
        initialize(null);

    }

    /**
     * Construtor
     * @param title 
     */
    public MeterGaugeChart(String title) {
        initialize(title);
    }

    /**
     * Inicialização
     * @param title 
     */
    protected final void initialize(String title) {
        ChartConfiguration<String> chartConfiguration = getChartConfiguration();
        chartConfiguration.setTitle(new Title(title));
        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        sd.setRenderer(JqPlotResources.MeterGaugeRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);
    }

    /**
     * 
     * @param value 
     */
    public void setValue(Float value) {
        data.setValue(value);
    }

    /**
     * 
     * @param value 
     */
    public void setValue(Integer value) {
        data.setValue(value.floatValue());
    }

    public MeterData getChartData() {
        return data;
    }
}
