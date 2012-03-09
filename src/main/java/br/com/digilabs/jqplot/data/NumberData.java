/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.data;


/**
 * Representa um number
 * @author inaiat
 */
public abstract class NumberData<T extends Number> implements ChartData<T> {

    
	private static final long serialVersionUID = 3043833458517563918L;

	private T data;
    
    /**
     * 
     * @param value 
     */
    public NumberData(T value) {
        data = value;
    }

    /**
     * 
     * @return data
     */
    public T getData() {
        return data;
    }

    /**
     * 
     * @param value 
     */
    public void setValue(T value) {
        this.data = value;
    }

    /**
     * retorna o json com as informações
     * @return json
     */
    public abstract String toJsonString();
}
