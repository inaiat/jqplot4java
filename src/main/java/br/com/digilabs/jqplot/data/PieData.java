package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.LabeledItem;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

/**
 *
 * @author inaiat
 */
public class PieData<T extends Number> extends AbstractCollectionData<LabeledItem<T>> {

    private Collection<LabeledItem<T>> data = new ArrayList<LabeledItem<T>>();

    public String toJsonString() {
        JSONArray outerArray = new JSONArray();
        JSONArray jsonArray = new JSONArray();
        for (LabeledItem<T> item : data) {
            JSONArray itemArray = new JSONArray();
            itemArray.put(item.getLabel());
            itemArray.put(item.getValue());
            jsonArray.put(itemArray);
        }
        outerArray.put(jsonArray);
        return outerArray.toString();
    }

    public Collection<LabeledItem<T>> getData() {
        return data;
    }
}
