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
import org.json.JSONArray;

/**
 * Representa os dados de um Pie ou Donut chart
 * @author inaiat
 * @param <T> 
 */
public class PieDonutData<T extends Number> extends AbstractCollectionData<Collection<LabeledItem<T>>> {

	private static final long serialVersionUID = -7450037021913733446L;

	private Collection<Collection<LabeledItem<T>>> data = new ArrayList<Collection<LabeledItem<T>>>();

    /**
     * Obtem o json
     * @return 
     */
    public String toJsonString() {
        JSONArray dataArray = new JSONArray();
        JSONArray jsonArray = new JSONArray();
        for (Collection<LabeledItem<T>> col : data) {
            JSONArray itemArray = null;
            for (LabeledItem<T> item : col) {
                itemArray = new JSONArray();
                itemArray.put(item.getLabel());
                itemArray.put(item.getValue());
                jsonArray.put(itemArray);
            }
            if (itemArray != null) {
                dataArray.put(jsonArray);
                jsonArray = new JSONArray();
            }
        }

        return dataArray.toString();
    }

    /**
     * 
     * @return Collection
     */
    public Collection<Collection<LabeledItem<T>>> getData() {
        return data;
    }
}
