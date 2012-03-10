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
package br.com.digilabs.jqplot.axis;

import java.io.Serializable;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.elements.TickOptions;

/**
 *
 * @author inaiat
 */
public class Axis implements Serializable {

    private static final long serialVersionUID = -5426777530263336010L;
    private Boolean show;
    private JqPlotResources renderer;
    private Boolean autoScale;
    private TickOptions tickOptions;
    private String[] ticks;
    private JqPlotResources labelRenderer;
    private JqPlotResources tickRenderer;
    private String label;
    private Float pad;
    private Float padMin;
    private Float padMax;
    private String min;
    private String tickInterval;

    /**
     * 
     * @return 
     */
    public String getMin() {
        return min;
    }

    /**
     * 
     * @param min 
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * 
     * @return 
     */
    public String getTickInterval() {
        return tickInterval;
    }

    /**
     * 
     * @param tickInterval 
     */
    public void setTickInterval(String tickInterval) {
        this.tickInterval = tickInterval;
    }

    /**
     * 
     * @return 
     */
    public Float getPadMin() {
        return padMin;
    }

    /**
     * 
     * @param padMin 
     */
    public void setPadMin(Float padMin) {
        this.padMin = padMin;
    }

    /**
     * 
     * @return 
     */
    public Float getPadMax() {
        return padMax;
    }

    /**
     * 
     * @param padMax 
     */
    public void setPadMax(Float padMax) {
        this.padMax = padMax;
    }

    
    /**
     * @return the show
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * @return the autoScale
     */
    public Boolean getAutoScale() {
        return autoScale;
    }

    /**
     * @param autoScale the autoScale to set
     */
    public void setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
    }

    /**
     * @return the tickOptions
     */
    public TickOptions getTickOptions() {
        return tickOptions;
    }

    /**
     * @param tickOptions the tickOptions to set
     */
    public void setTickOptions(TickOptions tickOptions) {
        this.tickOptions = tickOptions;
    }

    /**
     * @return the labelRenderer
     */
    public JqPlotResources getLabelRenderer() {
        return labelRenderer;
    }

    /**
     * @param labelRenderer the labelRenderer to set
     */
    public void setLabelRenderer(JqPlotResources labelRenderer) {
        this.labelRenderer = labelRenderer;
    }

    /**
     * @return the tickRenderer
     */
    public JqPlotResources getTickRenderer() {
        return tickRenderer;
    }

    /**
     * @param tickRenderer the tickRenderer to set
     */
    public void setTickRenderer(JqPlotResources tickRenderer) {
        this.tickRenderer = tickRenderer;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the pad
     */
    public Float getPad() {
        return pad;
    }

    /**
     * @param pad the pad to set
     */
    public void setPad(Float pad) {
        this.pad = pad;
    }

    /**
     * @return the renderer
     */
    public JqPlotResources getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(JqPlotResources renderer) {
        this.renderer = renderer;
    }

    /**
     * @return the ticks
     */
    public String[] getTicks() {
        return ticks;
    }

    /**
     * @param ticks the ticks to set
     */
    public void setTicks(String[] ticks) {
        this.ticks = ticks;
    }
}
