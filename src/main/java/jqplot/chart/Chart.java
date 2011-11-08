/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import java.io.Serializable;
import jqplot.chart.data.ChartData;

/**
 *
 * @author bernardo.moura
 */
public interface Chart extends Serializable {

    
    public abstract ChartData getData();
}
