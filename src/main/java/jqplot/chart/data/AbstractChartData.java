/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.util.Arrays;
import java.util.Collection;
import jqplot.chart.JqPlot;

/**
 *
 * @author inaiat
 */
public abstract class AbstractChartData<T> extends JqPlot implements Chart<T> {

    public void addValues(T... values) {
        getData().addAll(Arrays.asList(values));
    }

    public void addValues(Collection<T> collection) {
        getData().addAll(collection);
    }

    public void addValue(T value) {
        getData().add(value);
    }
}
