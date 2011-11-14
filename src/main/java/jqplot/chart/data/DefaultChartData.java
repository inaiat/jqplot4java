/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author inaiat
 */
public abstract class DefaultChartData<T> implements ChartData<T>  {

    public void addValues(Collection<T> value) {
        getData().addAll(value);
    }

    public void addValues(T... values) {
        getData().addAll(Arrays.asList(values));
    }

    public void addValue(T value) {
        getData().add(value);
    }
}
