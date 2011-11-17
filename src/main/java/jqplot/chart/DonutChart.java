
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
import jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author bernardo.moura
 */
@JqPlotPlugin(values = {JqPlotResources.DonutRenderer})
public class DonutChart<T extends ChartData> extends DefaultChart<T> {

    public DonutChart() {
        getChartConfiguration().setLegend(new Legend(true, "e"));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(JqPlotResources.DonutRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setSliceMargin(4);
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setDataLabels("value");
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);
    }
}
