/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

/**
 *
 * @author bernardo.moura
 */
public interface ChartData<T> {

    T getData();
    
    String toJsonString();
}
