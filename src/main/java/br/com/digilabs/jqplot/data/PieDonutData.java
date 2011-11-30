package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.LabeledItem;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

public class PieDonutData<T extends Number> extends AbstractCollectionData<Collection<LabeledItem<T>>> {

    private Collection<Collection<LabeledItem<T>>> data = new ArrayList<Collection<LabeledItem<T>>>();

    public String toJsonString() {
        JSONArray dataArray = new JSONArray();
        JSONArray jsonArray = new JSONArray();
        for (Collection<LabeledItem<T>> col : data) {
            JSONArray itemArray = null;
            for (LabeledItem<T> item : col) {
                itemArray = new JSONArray();
                itemArray.put(item.getLabel());
                itemArray.put(item.getValue());
                jsonArray.put(itemArray);
            }
            if (itemArray != null) {
                dataArray.put(jsonArray);
                jsonArray = new JSONArray();
            }
        }

        return dataArray.toString();
    }

    public Collection<Collection<LabeledItem<T>>> getData() {
        return data;
    }
}
