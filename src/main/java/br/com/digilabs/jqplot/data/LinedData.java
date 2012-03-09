package br.com.digilabs.jqplot.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;



/**
 * Dados de um chart Lined
 * @author inaiat
 */
public class LinedData<T extends Number> extends AbstractCollectionData<T> {
    
	private static final long serialVersionUID = -550315213084815871L;

	private List<T> data = new ArrayList<T>();

    /**
     * Construtor
     */
    public LinedData() {
    }
    
    /**
     * Construtor
     * @param values 
     */
    public LinedData(T... values) {
        addValues(values);
    }    

    /**
     * Obtem os dados
     * @return data
     */
    public Collection<T> getData() {
        return data;
    }

    /**
     * Retorno o json
     * @return String contendo o json
     */
    public String toJsonString() {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(data);
        return jsonArray.toString();
    }    

    
}
