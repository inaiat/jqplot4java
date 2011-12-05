package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.LabeledItem;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

/**
 * Representa os dados de um Pie ou Donut chart
 * @author inaiat
 * @param <T> 
 */
public class PieDonutData<T extends Number> extends AbstractCollectionData<Collection<LabeledItem<T>>> {

    private Collection<Collection<LabeledItem<T>>> data = new ArrayList<Collection<LabeledItem<T>>>();

    /**
     * Obtem o json
     * @return 
     */
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

    /**
     * 
     * @return Collection
     */
    public Collection<Collection<LabeledItem<T>>> getData() {
        return data;
    }
}
