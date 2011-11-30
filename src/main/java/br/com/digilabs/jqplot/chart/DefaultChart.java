package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.data.ChartData;

/**
 *
 * @author inaiat
 */
public class DefaultChart<T extends ChartData<?>> extends AbstractChart<T> {

    private T chartData;

    public T getChartData() {
        return chartData;
    }
    public void setChartData(T value) {
        chartData = value;
    }
}
