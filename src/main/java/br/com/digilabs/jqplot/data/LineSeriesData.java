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
package br.com.digilabs.jqplot.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;

import br.com.digilabs.jqplot.data.item.LineSeriesItem;

/**
 * Data Helper to build Line Series Charts.
 *
 * @param <I> {@link LineSeriesItem} Index type
 * @param <V> {@link LineSeriesItem} Value type
 */
public class LineSeriesData<I extends Number,V extends Number> extends AbstractCollectionData<Collection<LineSeriesItem<I, V>>> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8490476851004459871L;
	
	/** The data. */
	private List<Collection<LineSeriesItem<I, V>>> data = new ArrayList<Collection<LineSeriesItem<I, V>>>();

	/* (non-Javadoc)
	 * @see br.com.digilabs.jqplot.data.ChartData#getData()
	 */
	public Collection<Collection<LineSeriesItem<I, V>>> getData() {
		return data;
	}	

	/* (non-Javadoc)
	 * @see br.com.digilabs.jqplot.data.ChartData#toJsonString()
	 */
	public String toJsonString() {
    	JSONArray jsonArray = new JSONArray();        
        for (Collection<LineSeriesItem<I, V>> col : data) {
        	JSONArray serie = new JSONArray();
        	for (LineSeriesItem<I, V> lineSeriesItem : col) {
                JSONArray itemArray = new JSONArray();
                itemArray.put(lineSeriesItem.getIndex());
                itemArray.put(lineSeriesItem.getValue());
                serie.put(itemArray);
			}
        	jsonArray.put(serie);
        	
        }
        return jsonArray.toString();
	}
	
}
