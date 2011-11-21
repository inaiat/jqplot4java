package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.chart.config.ChartConfiguration;
import br.com.digilabs.jqplot.chart.data.ChartData;

/**
 *
 * @author inaiat
 */
public interface Chart<T extends ChartData<?>> {
    
    ChartConfiguration getChartConfiguration();
    T getChartData();
    void setChartData(T value);
}
