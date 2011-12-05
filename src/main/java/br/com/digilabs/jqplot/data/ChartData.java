package br.com.digilabs.jqplot.data;

/**
 * Interface que representa os dados de um chart
 * @author inaiat
 */
public interface ChartData<T> {

    T getData();
    
    String toJsonString();
}
