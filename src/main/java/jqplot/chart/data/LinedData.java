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
public class LinedData extends AbstractChartData<Integer> {
    
    private List<Integer> data = new ArrayList<Integer>();

    public LinedData() {
    }
    
    public LinedData(Integer... values) {
        addValues(values);
    }    
    

    @Override
    public Collection<Integer> getData() {
        return data;
    }

    
}
