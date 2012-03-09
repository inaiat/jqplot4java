package br.com.digilabs.jqplot.data;

import java.util.ArrayList;
import java.util.Collection;

import org.json.JSONArray;


/**
 * representa os dados de um chart de barra
 * @author inaiat
 */
public class BarData<T extends Number> extends AbstractCollectionData<Collection<T>> {
    
	private static final long serialVersionUID = -2087356275172825289L;

	private Collection<Collection<T>> data = new ArrayList<Collection<T>>();

    /**
     * Construtor
     */
    public BarData() {
    }
    
    /**
     * 
     * @param values 
     */
    public BarData(Collection<T>... values) {
        addValues(values);
    }    

    /**
     * 
     * @return Collection
     */
    public Collection<Collection<T>> getData() {
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
