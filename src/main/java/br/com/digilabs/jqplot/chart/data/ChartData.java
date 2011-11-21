package br.com.digilabs.jqplot.chart.data;

/**
 *
 * @author bernardo.moura
 */
public interface ChartData<T> {

    T getData();
    
    String toJsonString();
}
