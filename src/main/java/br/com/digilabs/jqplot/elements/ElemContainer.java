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

/**
 * 
 * @author inaiat
 */
public class ElemContainer implements Element {

    private static final long serialVersionUID = -3849421146501469906L;
    private Float plotWidth;
    private Float plotHeight;

    /**
     * 
     * @param plotWidth
     * @param plotHeight 
     */
    public ElemContainer(Float plotWidth, Float plotHeight) {
        this.plotWidth = plotWidth;
        this.plotHeight = plotHeight;
    }

    /**
     * 
     * @return plotHeight
     */
    public Float getPlotHeight() {
        return plotHeight;
    }

    /**
     * 
     * @param plotHeight 
     */
    public void setPlotHeight(Float plotHeight) {
        this.plotHeight = plotHeight;
    }

    /**
     * 
     * @return plotWidth
     */
    public Float getPlotWidth() {
        return plotWidth;
    }

    /**
     * 
     * @param plotWidth 
     */
    public void setPlotWidth(Float plotWidth) {
        this.plotWidth = plotWidth;
    }

    public static void createElement() {
    }
}
