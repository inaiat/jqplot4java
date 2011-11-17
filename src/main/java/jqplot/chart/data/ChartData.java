/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.util.Collection;

/**
 *
 * @author bernardo.moura
 */
public interface ChartData<T> {

    Collection<T> getData();
    
    String toJsonString();
}
