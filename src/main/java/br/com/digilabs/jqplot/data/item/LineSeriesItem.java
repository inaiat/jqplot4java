/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.data.item;

import java.io.Serializable;

/**
 * 
 * Helper to build line series charts.
 * 
 * @author inaiat
 *
 * @param <I> index of series
 * @param <V> value of series
 */
public class LineSeriesItem<I extends Serializable, V extends Serializable> implements BaseItem {

	private static final long serialVersionUID = 1L;
	
	private I index;
	private V value;	
	
	public LineSeriesItem() {
	}
	
	public LineSeriesItem(I index, V value) {
		this.index = index;
		this.value = value;
	}
	
	public I getIndex() {
		return index;
	}
	public void setIndex(I index) {
		this.index = index;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}	

}
