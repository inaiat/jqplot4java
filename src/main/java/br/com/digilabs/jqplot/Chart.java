package br.com.digilabs.jqplot;

import java.io.Serializable;

import br.com.digilabs.jqplot.data.ChartData;

/**
 * @author inaiat
 */
public interface Chart<T extends ChartData<?>> extends Serializable {
    
    ChartConfiguration getChartConfiguration();
    T getChartData();
}
