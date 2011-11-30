package br.com.digilabs.jqplot.data;

/**
 *
 * @author inaiat
 */
public interface ChartData<T> {

    T getData();
    
    String toJsonString();
}
