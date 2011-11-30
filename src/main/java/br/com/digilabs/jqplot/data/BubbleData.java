/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.BubbleItem;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

/**
 *
 * @author inaiat
 */
public class BubbleData<T extends BubbleItem> extends AbstractCollectionData<T> {

    private Collection<T> data = new ArrayList<T>();

    public Collection<T> getData() {
        return data;
    }

    public String toJsonString() {
        JSONArray outerArray = new JSONArray();
        JSONArray jsonArray = new JSONArray();
        for (BubbleItem item : data) {
            JSONArray itemArray = new JSONArray();
            itemArray.put(item.getX());
            itemArray.put(item.getY());
            itemArray.put(item.getRadius());
            itemArray.put(item.getLabel());
            jsonArray.put(itemArray);
        }
        outerArray.put(jsonArray);
        return outerArray.toString();
    }
}
