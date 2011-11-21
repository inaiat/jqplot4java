package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.chart.data.ChartData;
import br.com.digilabs.jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author inaiat
 */
public class AreaChart<T extends ChartData<?>> extends DefaultChart<T> {

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
