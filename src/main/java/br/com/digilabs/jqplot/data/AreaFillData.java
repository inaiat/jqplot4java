package br.com.digilabs.jqplot.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;


/**
 * Representa os dados do chart AreaFill
 * @author inaiat
 */
public class AreaFillData<T extends Number> extends AbstractCollectionData<List<T>> {

	private static final long serialVersionUID = -2456625545492808162L;

	private List<List<T>> data = new ArrayList<List<T>>();

    /**
     * Construtor
     */
    public AreaFillData() {
    }

    /**
     * Construtor
     * @param values 
     */
    public AreaFillData(List<T>... values) {
        for (int i = 0; i < values.length; i++) {
        	List<T> list = values[i];
            addValue(list);
        }
    }

    /**
     * 
     * @return Collection data
     */
    public Collection<List<T>> getData() {
        return data;
    }

    /**
     * retorna o json
     * @return json
     */
    public String toJsonString() {
        JSONArray jsonArray = new JSONArray(data);
        return jsonArray.toString();
    }
}
