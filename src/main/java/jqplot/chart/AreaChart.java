/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.JqPlotResources;
import jqplot.axis.XAxis;
import jqplot.chart.data.ChartData;
import jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author inaiat
 */
public class AreaChart<T extends ChartData> extends DefaultChart<T> {

    public AreaChart() {
        getChartConfiguration().setStackSeries(true);
        getChartConfiguration().setShowMarker(false);
        SeriesDefaults defaults = new SeriesDefaults();
        defaults.setFill(true);
        setSeriesDefaults(defaults);        
        XAxis xAxis = createXAxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);
    }    
    
}
