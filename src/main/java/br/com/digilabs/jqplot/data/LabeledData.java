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

	private static final long serialVersionUID = -1202233319043142424L;

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
