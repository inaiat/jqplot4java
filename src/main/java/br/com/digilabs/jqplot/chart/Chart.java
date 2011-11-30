package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotConfiguration;
import br.com.digilabs.jqplot.data.ChartData;

/**
 *
 * @author inaiat
 */
public interface Chart<T extends ChartData<?>> {
    
    JqPlotConfiguration getChartConfiguration();
    T getChartData();
    void setChartData(T value);
}
