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
 * @author inaiat
 */
public class AreaFillData<T extends Number> extends AbstractChartData<Collection<T>> {

    private List<Collection<T>> data = new ArrayList<Collection<T>>();

    public AreaFillData() {
    }

    public AreaFillData(Collection<T>... values) {
        for (int i = 0; i < values.length; i++) {
            Collection<T> collection = values[i];
            addValue(collection);            
        }
    }

    public Collection<Collection<T>> getData() {
        return data;
    }
}
