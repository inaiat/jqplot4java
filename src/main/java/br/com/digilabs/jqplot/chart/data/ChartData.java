package br.com.digilabs.jqplot.chart.data;

/**
 *
 * @author inaiat
 */
public interface ChartData<T> {

    T getData();
    
    String toJsonString();
}
