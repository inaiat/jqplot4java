package br.com.digilabs.jqplot.data;

import java.util.Arrays;
import java.util.Collection;

/**
 * Representa a abstração do conjunto de dados de um chart
 * @author inaiat
 */
public abstract class AbstractCollectionData<T> implements ChartData<Collection<T>>  {        
    
    /**
     * 
     * @param value 
     */
    public void addValues(Collection<T> value) {
        getData().addAll(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(T... values) {
        getData().addAll(Arrays.asList(values));
    }

    /**
     * 
     * @param value 
     */
    public void addValue(T value) {
        getData().add(value);
    }    
    
}
