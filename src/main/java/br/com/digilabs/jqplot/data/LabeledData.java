package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.LabeledItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;

/**
 * @author inaiat
 * @param <T> 
 */
public class LabeledData<T extends Number> extends AbstractCollectionData<LabeledItem<T>> {

    private List<LabeledItem<T>> data = new ArrayList<LabeledItem<T>>();

    public LabeledData() {
    }

    /**
     * Construtor
     * @param values 
     */
    public LabeledData(LabeledItem<T>... values) {
        addValues(values);
    }

    /**
     * Retorna o json
     * @return json
     */
    public String toJsonString() {
    	JSONArray jsonArray = new JSONArray();        
        for (LabeledItem<T> labeledItem : data) {
            JSONArray itemArray = new JSONArray();
            itemArray.put(labeledItem.getLabel());
            itemArray.put(labeledItem.getValue());
            jsonArray.put(itemArray);
        }
        JSONArray outerArray = new JSONArray();
        outerArray.put(jsonArray);
        return outerArray.toString();
    }

    /**
     * 
     * @return Collection
     */
    public Collection<LabeledItem<T>> getData() {
        return data;
    }
}
