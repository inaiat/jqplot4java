/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author bernardo.moura
 */
public class LinedData<N extends Number> extends AbstractChartData<N> {
    
    private ArrayList<N> data = new ArrayList<N>();        

    public Collection<N> getData() {
        return data;
    }
    
}
