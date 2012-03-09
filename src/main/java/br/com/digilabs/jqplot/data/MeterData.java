package br.com.digilabs.jqplot.data;

import org.json.JSONArray;

/**
 * Representa os dados de um chart Meter
 * @author inaiat
 */
public class MeterData extends NumberData<Float> {

	private static final long serialVersionUID = -1543265764447003656L;

	/**
     * Construtor
     */
    public MeterData() {
        super(0F);
    }

    /**
     * Construtor
     * @param value 
     */
    public MeterData(Float value) {
        super(value);
    }
    
    /**
     * retorna o json
     * @return string correspondendo ao json
     */
    @Override
    public String toJsonString() {
        JSONArray jsonArray = new JSONArray();
        JSONArray valueArray = new JSONArray();
        valueArray.put(getData());
        jsonArray.put(valueArray);
        return jsonArray.toString();
    }
}
