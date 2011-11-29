/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.chart.config.ChartConfiguration;
import br.com.digilabs.jqplot.chart.data.ChartData;
import br.com.digilabs.jqplot.chart.elements.RendererOptions;
import br.com.digilabs.jqplot.chart.elements.SeriesDefaults;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import java.util.Arrays;

/**
 *
 * @author bernardo.moura
 */
@JqPlotPlugin(values={JqPlotResources.MeterGaugeRenderer})
public class MeterGaugeChart <T extends ChartData<?>> extends DefaultChart<T> {

    private static final long serialVersionUID = -8122703368130701972L;
    
    public MeterGaugeChart() {
        initialize(null);

    }

    public MeterGaugeChart(String title) {
        this();
        initialize(title);
    }

    protected final void initialize(String title) {
        ChartConfiguration chartConfiguration = getChartConfiguration();

        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        sd.setRenderer(JqPlotResources.MeterGaugeRenderer);
        sd.setRendererOptions(ro);   
        chartConfiguration.setSeriesDefaults(sd);
    }
    public void addIntervalColors(String... values){
        getChartConfiguration().getSeriesDefaults().getRendererOptions().getIntervalColors().addAll(Arrays.asList(values));
    }
    public void addIntervals(Integer... values){
        getChartConfiguration().getSeriesDefaults().getRendererOptions().getIntervals().addAll(Arrays.asList(values));
    }
    public void setMax(Integer max){
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setMax(max);
    }
    public void setMin(Integer min){
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setMin(min);
    }

}
