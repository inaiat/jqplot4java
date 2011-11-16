/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.JqPlotResources;
import jqplot.chart.data.ChartData;
import jqplot.chart.elements.Legend;
import jqplot.chart.elements.RendererOptions;
import jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author bernardo.moura
 */
public class DonutsChart<T extends ChartData> extends DefaultChart<T> {

    public DonutsChart() {
        getJqPlot().setLegend(new Legend(true, "e"));
        getJqPlot().setSeriesDefaults(new SeriesDefaults());
        getJqPlot().getSeriesDefaults().setRenderer(JqPlotResources.DonutRenderer);
        getJqPlot().getSeriesDefaults().setRendererOptions(new RendererOptions());
        getJqPlot().getSeriesDefaults().getRendererOptions().setSliceMargin(4);
        getJqPlot().getSeriesDefaults().getRendererOptions().setDataLabels("value");
        getJqPlot().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);
    }
}
