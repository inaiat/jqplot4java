package br.com.digilabs.jqplot.data;

import java.io.Serializable;

/**
 * Interface que representa os dados de um chart
 * @author inaiat
 */
public interface ChartData<T> extends Serializable {

    T getData();
    
    String toJsonString();
}
