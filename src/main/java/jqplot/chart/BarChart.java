/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.chart.data.Chart;
import java.util.Arrays;
import jqplot.chart.data.ChartData;

/**
 *
 * @author bernardo.moura
 */
public class BarChart extends JqPlot  {
    
    private ChartData data;

    public void addValues(Number... values) {
        data.addValue(Arrays.asList(values));
    }

    public void addValue(Number value) {
        data.addValue(value);
    }
  
}
