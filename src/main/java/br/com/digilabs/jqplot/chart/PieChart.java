/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.chart.data.ChartData;
import br.com.digilabs.jqplot.chart.elements.Legend;
import br.com.digilabs.jqplot.chart.elements.RendererOptions;
import br.com.digilabs.jqplot.chart.elements.SeriesDefaults;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;


/**
 *
 * @author inaiat
 */
@JqPlotPlugin(values={JqPlotResources.PieRenderer})
public class PieChart<T extends ChartData<?>> extends DefaultChart<T> {

    public PieChart(){
        
        getChartConfiguration().setLegend(new Legend(true, "e"));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(JqPlotResources.PieRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setSliceMargin(3);
    }

}