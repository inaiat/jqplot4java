/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import java.util.Arrays;
import jqplot.JqPlotResources;
import jqplot.axis.XAxis;
import jqplot.chart.data.ChartData;
import jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author inaiat
 */
public class AreaChart<T extends ChartData> extends AbstractChart<T> {

    public AreaChart() {
        getJqPlot().setStackSeries(true);
        getJqPlot().setShowMarker(false);
        SeriesDefaults defaults = new SeriesDefaults();
        defaults.setFill(true);
        setSeriesDefaults(defaults);        
        XAxis xAxis = createXAxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);
        xAxis.setTicks(Arrays.asList("Seg","Ter","Qua","Qui","Sex"));        
    }    
    
}
