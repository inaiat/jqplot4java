/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author bernardo.moura
 */
public class LinedData<T extends Number> extends AbstractChartData<T> {
    
    private List<T> data = new ArrayList<T>();

    public LinedData() {
    }
    
    public LinedData(T... values) {
        addValues(values);
    }    
    

    @Override
    public Collection<T> getData() {
        return data;
    }

    
}
