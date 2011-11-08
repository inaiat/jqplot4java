/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardo.moura
 */
public class LinedData implements ChartData{
    private ArrayList<Object> data = new ArrayList<Object>();
    public LinedData(){
    }
    
    public void addValues(List<? extends Serializable> value) {
        data.add(value);
    }

    public void addValue(Object... values) {
        data.add(values);
    }
    
}
