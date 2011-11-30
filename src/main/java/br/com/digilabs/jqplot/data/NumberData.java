/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.data;

import org.json.JSONArray;

/**
 *
 * @author bernardo.moura
 */
public class NumberData implements ChartData {

    protected Number data = new Float(0);

    public NumberData() {
        
    }

    public NumberData(Number value) {
        data = value;
    }

    public Number getData() {
        return data;
    }

    public void setValue(Number value) {
        data = value;
    }

    public String toJsonString() {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(data);
        return jsonArray.toString();
    }
}
