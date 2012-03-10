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

import java.util.Arrays;
import java.util.Collection;

/**
 * Representa a abstração do conjunto de dados de um chart
 * @author inaiat
 */
public abstract class AbstractCollectionData<T> implements ChartData<Collection<T>>  {        
    
    private static final long serialVersionUID = 7797681985474175237L;

	/**
     * 
     * @param value 
     */
    public void addValues(Collection<T> value) {
        getData().addAll(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(T... values) {
        getData().addAll(Arrays.asList(values));
    }

    /**
     * 
     * @param value 
     */
    public void addValue(T value) {
        getData().add(value);
    }    
    
}
