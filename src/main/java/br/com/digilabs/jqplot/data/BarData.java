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
