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
public class PieChart<T extends ChartData> extends DefaultChart<T> {

    public PieChart(){
        
        getChartConfiguration().setLegend(new Legend(true, "e"));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(JqPlotResources.PieRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setSliceMargin(3);
    }

}
