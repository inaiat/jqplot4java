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
package br.com.digilabs.jqplot.elements;

import java.io.Serializable;

/**
 *
 * @author inaiat
 */
public class FillBetween implements Serializable {

    private static final long serialVersionUID = 8516029001505871387L;
    private Integer serie1;
    private Integer serie2;
    private String color;
    private Integer baseSeries;
    private Boolean fill;

    /**
     * 
     * @return baseSeries
     */
    public Integer getBaseSeries() {
        return baseSeries;
    }

    /**
     * 
     * @param baseSeries 
     */
    public void setBaseSeries(Integer baseSeries) {
        this.baseSeries = baseSeries;
    }

    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return fill true ou false
     */
    public Boolean getFill() {
        return fill;
    }

    /**
     * 
     * @param fill 
     */
    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    /**
     * 
     * @return serie1
     */
    public Integer getSerie1() {
        return serie1;
    }

    /**
     * 
     * @param serie1 
     */
    public void setSerie1(Integer serie1) {
        this.serie1 = serie1;
    }

    /**
     * 
     * @return serie2
     */
    public Integer getSerie2() {
        return serie2;
    }

    /**
     * 
     * @param serie2 
     */
    public void setSerie2(Integer serie2) {
        this.serie2 = serie2;
    }
}
