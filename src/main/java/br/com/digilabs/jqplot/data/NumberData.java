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
