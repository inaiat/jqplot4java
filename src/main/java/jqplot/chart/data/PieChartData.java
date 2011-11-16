/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

/**
 *
 * @author bernardo.moura
 */
public class PieChartData<T extends Object> extends AbstractChartData<T> {

    private Collection<T> data = new ArrayList<T>();

    public Collection<T> getData() {
        return data;
    }

    public String toJsonString() {
        String sReturn = null;
        JSONArray jsonArray = new JSONArray();
        try {

            jsonArray.put(data);
            sReturn = jsonArray.getJSONArray(0).toString();

        } catch (Exception e) {
            sReturn = jsonArray.toString();
        }
        return sReturn;
    }
}
