/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author bernardo.moura
 */
public interface ChartData{
    public void addValues(List<? extends Serializable> value);
    public void addValue(Object... value);
    
   
}
