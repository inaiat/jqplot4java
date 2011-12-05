package br.com.digilabs.jqplot.data;

import java.io.Serializable;

public class LabeledItem<T extends Number> implements Serializable {
	
	private static final long serialVersionUID = 2905145421607972600L;

	private String label;
	private T value;
	
	public LabeledItem() {
	}
	
	public LabeledItem(String label, T value) {
		this.label = label;
		this.value = value;
	}
	
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}
}
